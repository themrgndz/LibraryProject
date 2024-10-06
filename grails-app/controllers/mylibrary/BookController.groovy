package mylibrary
import grails.converters.JSON
class BookController {

    // List all books (Read - GET)
    def index() {
        respond Book.list(), [formats: ['json']]
    }

    // Show details of a specific book (Read - GET)
    /*
    def books = Book.list()

    def book = Book.get(1L)

    def book = Book.findByTitle("The Great Gatsby")

    def inStockBooks = Book.findAllByStockGreaterThan(0)

    def books = Book.findAllByTitleLike("The%")

    def booksSortedByStock = Book.list(sort: "stock", order: "desc")

    def books = Book.findAllByStockGreaterThanAndTitleLike(5, "The%")

    def books = Book.executeQuery("from Book where stock > :stock and title like :title", [stock: 5, title: 'The%'])
    */
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
        def book = new Book(params)
        if (book.save(flush: true)) {
            render status: 200, json: [message: "Kitap başarıyla eklendi"]
        } else {
            render status: 500, json: [error: "Kaydetme işlemi başarısız"]
        }
    }


    // Update an existing book (Update - PUT)
    def update(Long id) {
        Book book = Book.get(id)
        if (!book) {
            notFound()
            return
        }

        book.properties = params

        if (!book.save(flush: true)) {
            // If there are validation errors
            respond book.errors, view: 'edit', [formats: ['json']]
            return
        }

        // Respond with updated book details after successful update
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
        // Respond with success message or status
        render status: 204, text: 'Book deleted', [formats: ['json']]
    }

    // Handle cases where the book is not found
    protected void notFound() {
        render status: 404, text: "Book not found", [formats: ['json']]
    }
}


