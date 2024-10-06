package mylibrary
import grails.converters.JSON

class BookController {

    // List all books (Read - GET)
    def index() {
        respond Book.list(), [formats: ['json']]
    }

    // Show details of a specific book (Read - GET)
    def show(Long id) {
        Book book = Book.get(id)
        if (!book) {
            notFound()
            return
        }
        respond book, [formats: ['json']]
    }

    // POST /api/books
    def saveBook() {
        def book = new Book(request.JSON as Map) // Gelen veriyi JSON olarak al

        if (book.save(flush: true)) {
            render status: 201, json: [message: "Kitap başarıyla eklendi", book: book]
        } else {
            render status: 400, json: [error: "Kaydetme işlemi başarısız", errors: book.errors]
        }
    }

    // Update an existing book (Update - PUT)
    def update(Long id) {
        Book book = Book.get(id)
        if (!book) {
            notFound()
            return
        }

        book.properties = request.JSON // Gelen JSON verisini al

        if (!book.save(flush: true)) {
            respond book.errors, view: 'edit', [formats: ['json']]
            return
        }

        respond book, [formats: ['json']]
    }

    // Delete a book (Delete - DELETE)
    def delete(Long id) {
        Book book = Book.get(id)
        if (!book) {
            notFound()
            return
        }

        book.delete(flush: true)
        render status: 204, text: 'Book deleted', [formats: ['json']]
    }

    // Handle cases where the book is not found
    protected void notFound() {
        render status: 404, text: "Book not found", [formats: ['json']]
    }
}
