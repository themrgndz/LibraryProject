package mylibrary

import grails.converters.JSON

class BookController {

    BookService bookService

    def list() {
        def books = bookService.listBooks()
        render books as JSON
    }

    def search() {
        def query = params.query
        // Arama işlemi: query'ye göre kitapları filtreleyip göster
        def results = bookService.searchBooks(query)
        render(view: 'list', model: [books: results])
    }

    def save() {
        try {
            def result = bookService.saveBook(request.JSON as Map)  // Servis katmanına veriyi gönder

            if (!result.success) {
                render status: 400, json: [message: 'Book save failed', errors: result.errors]
            } else {
                render status: 200, json: [message: 'Book saved successfully', book: result.book]
            }
        } catch (Exception e) {
            render status: 500, json: [message: 'An error occurred: ' + e.message]
        }
    }

    def detail(Long id) {
        def book = bookService.getBook(id)
        if (!book) {
            render(status: 404, text: "Kitap bulunamadı")
        } else {
            render book as JSON
        }
    }

    def update(Long id) {
        def bookInstance = bookService.updateBook(id, params)
        if (!bookInstance) {
            render status: 404, text: "Kitap bulunamadı veya güncelleme başarısız oldu"
        } else {
            render status: 200, text: 'Book updated successfully'
        }
    }

    def delete(Long id) {
        if (bookService.deleteBook(id)) {
            render status: 200, text: 'Book deleted successfully'
        } else {
            render status: 404, text: 'Kitap bulunamadı'
        }
    }

    def options() {
        response.status = 200 // 200 OK durumu
        response.addHeader('Access-Control-Allow-Origin', '*')
        response.addHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS')
        response.addHeader('Access-Control-Allow-Headers', 'Content-Type, Authorization, X-Requested-With')
    }
}
