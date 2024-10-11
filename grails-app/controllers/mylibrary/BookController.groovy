package mylibrary

class BookController {

    BookService bookService

    // List all books
    def index() {
        try {
            def books = bookService.listAllBooks()
            respond books, [formats: ['json']]
        } catch (Exception e) {
            render status: 500, text: "Error listing books: ${e.message}"
        }
    }

    // Show a single book by ID
    def show(Long id) {
        try {
            def book = bookService.getBookById(id)
            if (book) {
                respond book, [formats: ['json']]
            } else {
                render status: 404, text: "Book not found."
            }
        } catch (Exception e) {
            render status: 500, text: "Error retrieving book: ${e.message}"
        }
    }

    // Save the newly created book using JSON request body
    def save() {
        try {
            def savedBook = bookService.saveBook(request.JSON) // Changed to request.JSON
            if (savedBook) {
                response.status = 201 // Created
                respond savedBook, [formats: ['json']]
            } else {
                render status: 400, text: "Validation error occurred while adding the book."
            }
        } catch (Exception e) {
            render status: 500, text: "Error occurred while adding the book: ${e.message}"
        }
    }

    // Update an existing book using JSON request body
    def update(Long id) {
        try {
            def updatedBook = bookService.updateBook(id, request.JSON) // Changed to request.JSON
            if (updatedBook) {
                respond updatedBook, [formats: ['json']]
            } else {
                render status: 400, text: "Validation error occurred while updating the book."
            }
        } catch (Exception e) {
            render status: 500, text: "Error occurred while updating the book: ${e.message}"
        }
    }

    // Delete a book by ID
    def delete(Long id) {
        try {
            if (bookService.deleteBook(id)) {
                render status: 204 // No Content
            } else {
                render status: 404, text: "Book not found."
            }
        } catch (Exception e) {
            render status: 500, text: "Error occurred while deleting the book: ${e.message}"
        }
    }

    // Render form for creating a new book (optional, can be removed for pure REST API)
    def create() {
        respond new Book(), [formats: ['json']]
    }

    // Render form for editing an existing book (optional, can be removed for pure REST API)
    def edit(Long id) {
        try {
            def book = bookService.getBookById(id)
            if (book) {
                respond book, [formats: ['json']]
            } else {
                render status: 404, text: "Book not found."
            }
        } catch (Exception e) {
            render status: 500, text: "Error occurred while fetching the book for editing: ${e.message}"
        }
    }

    // List all books in a non-RESTful way (optional)
    def list() {
        try {
            def bookList = bookService.listAllBooks()
            [bookList: bookList]
        } catch (Exception e) {
            render status: 500, text: "Error occurred while listing books: ${e.message}"
        }
    }

    def options() {
        // Preflight isteğine yanıt veriyoruz
        response.setHeader('Access-Control-Allow-Origin', 'http://localhost:3030')
        response.setHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS')
        response.setHeader('Access-Control-Allow-Headers', 'Content-Type')
        render status: 200
    }
}
