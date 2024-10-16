package mylibrary
import grails.converters.JSON

class HomeController {

    def list() {
        def books = Book.list()
        render books as JSON
    }

    def search() {
        def query = params.query
        // Arama işlemi: query'ye göre kitapları filtreleyip göster
        def results = Book.findAllByTitleLike("%${query}%")
        render(view: 'list', model: [books: results])
    }

    def save() {
        def bookInstance = new Book(params)
        if (!bookInstance.save(flush: true)) {
            render status: 500, text: 'Failed to save book'
        } else {
            render status: 200, text: 'Book saved successfully'
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
