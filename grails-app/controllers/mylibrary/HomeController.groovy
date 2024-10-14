package mylibrary
import grails.converters.JSON

class HomeController {

    def list() {
        def books = Book.list()
        render books as JSON
    }

    def save() {
        def book = new Book(request.JSON)
        if (book.save(flush: true)) {
            render book as JSON
        } else {
            render(status: 400, text: "Kitap oluşturulamadı")
        }
    }

    def detail(Long id) {
        def book = Book.get(id)
        if (!book) {
            render(status: 404, text: "Kitap bulunamadı")
        } else {
            render book as JSON
        }
    }
    def options() {
        response.status = 200 // 200 OK durumu
        response.addHeader('Access-Control-Allow-Origin', '*')
        response.addHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS')
        response.addHeader('Access-Control-Allow-Headers', 'Content-Type, Authorization, X-Requested-With')
    }
}
