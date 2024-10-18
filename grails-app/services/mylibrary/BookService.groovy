package mylibrary

import grails.transaction.Transactional

import javax.xml.bind.ValidationException

@Transactional
class BookService {

    def listBooks() {
        return Book.list()
    }

    def searchBooks(String query) {
        return Book.findAllByTitleLike("%${query}%")
    }

    def saveBook(Map bookData) {
        
        log.info("\nVeri alındı: ${bookData}\n")

        // Gelen veride eksik veya boş alanlar olup olmadığını kontrol et
        if (!bookData.title || !bookData.author) {
            log.warn("Eksik zorunlu alanlar: title veya author eksik")
            return [success: false, message: "Zorunlu alanlar eksik: title ve author gereklidir", status: 400]
        }

        try {
            def bookInstance = new Book(bookData)

            // Eğer veri domain modelindeki kısıtlamaları sağlamıyorsa
            if (!bookInstance.save(flush: true)) {
                log.error("Kitap kaydedilemedi: ${bookInstance.errors}")
                return [success: false, errors: bookInstance.errors, status: 400]
            }

            log.info("Kitap başarıyla kaydedildi: ${bookInstance}")
            return [success: true, book: bookInstance, status: 200]

        } catch (ValidationException e) {
            log.error("Doğrulama hatası: ${e.message}")
            return [success: false, errors: e.errors, status: 400]
        } catch (Exception e) {
            log.error("Beklenmeyen hata: ${e.message}")
            return [success: false, message: "Beklenmeyen hata oluştu: ${e.message}", status: 500]
        }
    }

    def getBook(Long id) {
        return Book.get(id)
    }

    def updateBook(Long id, Map params) {
        def bookInstance = Book.get(id)
        if (bookInstance) {
            bookInstance.properties = params
            if (!bookInstance.save(flush: true)) {
                return null // Güncelleme başarısız oldu
            }
            return bookInstance
        }
        return null
    }

    def deleteBook(Long id) {
        def bookInstance = Book.get(id)
        if (bookInstance) {
            bookInstance.delete(flush: true)
            return true
        }
        return false
    }
}
