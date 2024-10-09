package mylibrary

class BookController {

    BookService bookService

    // List all books
    def index() {
        respond bookService.listAllBooks(), [formats: ['json']]
    }

    // Show a single book by ID
    def show(Long id) {
        def book = bookService.getBookById(id)
        if (book) {
            respond book, [formats: ['json']]
        } else {
            render status: 404, text: "Book not found."
        }
    }

    // Render form for creating a new book (optional, can be removed for pure REST API)
    def create() {
        respond new Book(), [formats: ['json']]
    }

    // Save the newly created book
    def save() {
        def book = bookService.saveBook(params)
        if (book) {
            response.status = 201 // Created
            respond book, [formats: ['json']]
        } else {
            render status: 400, text: "Error occurred while adding the book."
        }
    }

    // Render form for editing an existing book (optional, can be removed for pure REST API)
    def edit(Long id) {
        def book = bookService.getBookById(id)
        if (book) {
            respond book, [formats: ['json']]
        } else {
            render status: 404, text: "Book not found."
        }
    }

    // Update an existing book
    def update(Long id) {
        def book = bookService.updateBook(id, params)
        if (book) {
            respond book, [formats: ['json']]
        } else {
            render status: 400, text: "Error occurred while updating the book."
        }
    }

    // Delete a book
    def delete(Long id) {
        if (bookService.deleteBook(id)) {
            render status: 204 // No Content
        } else {
            render status: 404, text: "Book not found."
        }
    }

    def list() {
        def bookList = bookService.listAllBooks() // Servisten tüm kitapları al
        [bookList: bookList] // Görünüme kitap listesini gönder
    }
}
