package mylibrary

import grails.converters.JSON

//Kitap işlemlerini yöneten apicontroller sınıfı
class BookController {

    BookService bookService

    //Tüm kitapları listeler
    def list() {
        def books = bookService.listBooks()
        render books as JSON
    }

    //Kitap araması yapar
    def search() {
        def query = params.query
        def results = bookService.searchBooks(query)
        render results as JSON
    }

    //Yeni kitap kaydeder
    def save() {
        try {
            def result = bookService.saveBook(request.JSON as Map)

            if (!result.success) {
                render status: 400, json: [
                    message: 'Kitap kaydedilemedi',
                    errors: result.errors
                ]
            } else {
                render status: 201, json: [
                    message: 'Kitap başarıyla kaydedildi',
                    book: result.book
                ]
            }
        } catch (Exception e) {
            render status: 500, json: [
                message: 'Bir hata oluştu: ' + e.message
            ]
        }
    }

    //ID'ye göre kitap detayını getirir
    def detail(Long id) {
        def book = bookService.getBook(id)
        if (!book) {
            render status: 404, json: [message: "Kitap bulunamadı"]
        } else {
            render book as JSON
        }
    }

    //Kitap bilgilerini günceller
    def update(Long id) {
        def result = bookService.updateBook(id, request.JSON as Map)
        if (!result.success) {
            render status: 404, json: [
                message: "Kitap bulunamadı veya güncelleme başarısız oldu",
                errors: result.errors
            ]
        } else {
            render status: 200, json: [
                message: 'Kitap başarıyla güncellendi',
                book: result.book
            ]
        }
    }

    //Kitap siler
    def delete(Long id) {
        def result = bookService.deleteBook(id)
        if (result.success) {
            render status: 200, json: [message: 'Kitap başarıyla silindi']
        } else {
            render status: 404, json: [message: 'Kitap bulunamadı']
        }
    }

    //CORS için OPTIONS metodunu işler
    def options() {
        response.status = 200
        response.addHeader('Access-Control-Allow-Origin', '*')
        response.addHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS')
        response.addHeader('Access-Control-Allow-Headers', 'Content-Type, Authorization, X-Requested-With')
    }
}
