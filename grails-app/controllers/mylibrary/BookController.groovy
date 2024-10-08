package mylibrary
import grails.converters.JSON
class BookController {

    def index() {
        respond Book.list(), [formats: ['json']]
    }

    def show(Long id) {
        Book book = Book.get(id)
        if (!book) {
            notFound()
            return
        }
        respond book, [formats: ['json']]
    }

    def save() {
        println("BASARDINNNNN")
        def bookData = request.JSON
        def book = new Book(bookData)

        if (book.save(flush: true)) {
            render book as JSON
        } else {
            render status: 400, text: book.errors as JSON
        }
    }

    def update(Long id) {
        Book book = Book.get(id)
        if (!book) {
            notFound()
            return
        }

        book.properties = params

        if (!book.save(flush: true)) {
            respond book.errors, view: 'edit', [formats: ['json']]
            return
        }

        respond book, [formats: ['json']]
    }

    def delete(Long id) {
        Book book = Book.get(id)
        if (!book) {
            notFound()
            return
        }

        book.delete(flush: true)
        render status: 204, text: 'Book deleted', [formats: ['json']]
    }

    protected void notFound() {
        render status: 404, text: "Book not found", [formats: ['json']]
    }
    def handleCorsOptions() {
        render status: 200
    }
}


