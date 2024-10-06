package mylibrary

class BookController {
    BookService bookService

    def list() {
        def books = bookService.getAllBooks()
        respond books
    }

    def show(Long id) {
        def book = bookService.getBookById(id)
        if (book) {
            respond book
        } else {
            render status: 404, text: "Book not found."
        }
    }

    def save() {
        def name = params.name
        def author = params.author
        def publisher = params.publisher
        def year = params.int('year')
        def pageCount = params.int('pageCount')
        def language = params.language
        def category = Category.get(params.long('categoryId'))
        def isbn = params.isbn
        def stock = params.int('stock')
        def img = params.img

        def book = bookService.addBook(name, author, publisher, year, pageCount, language, category, isbn, stock, img)
        if (book) {
            respond book, status: 201
        } else {
            render status: 400, text: "Book could not be created."
        }
    }

    def update(Long id) {
        def name = params.name
        def author = params.author
        def publisher = params.publisher
        def year = params.int('year')
        def pageCount = params.int('pageCount')
        def language = params.language
        def category = Category.get(params.long('categoryId'))
        def isbn = params.isbn
        def stock = params.int('stock')
        def img = params.img

        def book = bookService.updateBook(id, name, author, publisher, year, pageCount, language, category, isbn, stock, img)
        if (book) {
            respond book
        } else {
            render status: 404, text: "Book not found or could not be updated."
        }
    }

    def delete(Long id) {
        if (bookService.deleteBook(id)) {
            render status: 204
        } else {
            render status: 404, text: "Book not found."
        }
    }
}
