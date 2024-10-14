package mylibrary

import grails.converters.JSON

class BookController {

    // 1. GET - Tüm kitapları listeleme
    def index() {
        def books = Book.list()  // Book domain sınıfından tüm kitapları getirir.
        render books as JSON     // JSON formatında yanıt verir.
    }

    // 2. GET - ID ile bir kitabı bulma
    def show(Long id) {
        def book = Book.get(id)
        if (!book) {
            render(status: 404, text: "Kitap bulunamadı")
        } else {
            render book as JSON
        }
    }

    // 3. POST - Yeni bir kitap oluşturma
    def save() {
        def book = new Book(request.JSON)  // JSON verilerini Book domain objesine çevirir.
        if (book.save(flush: true)) {
            render book as JSON  // Başarıyla oluşturulan kitabı geri döndürür.
        } else {
            render(status: 400, text: "Kitap oluşturulamadı")
        }
    }

    // 4. PUT - Mevcut bir kitabı güncelleme
    def update(Long id) {
        def book = Book.get(id)
        if (!book) {
            render(status: 404, text: "Kitap bulunamadı")
        } else {
            book.properties = request.JSON
            if (book.save(flush: true)) {
                render book as JSON  // Güncellenmiş kitabı geri döndürür.
            } else {
                render(status: 400, text: "Kitap güncellenemedi")
            }
        }
    }

    // 5. DELETE - Bir kitabı silme
    def delete(Long id) {
        def book = Book.get(id)
        if (!book) {
            render(status: 404, text: "Kitap bulunamadı")
        } else {
            book.delete(flush: true)
            render(status: 204, text: "Kitap silindi")  // Başarıyla silinme durumu.
        }
    }
}
