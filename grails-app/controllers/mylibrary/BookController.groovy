package mylibrary

class BookController {
    static responseFormats = ['json', 'xml']

    def index() {
        respond Book.list()
    }

    def show(int id) {
        respond Book.get(id)
    }

    def save() {
        def book = new Book(request.JSON)
        if (book.save(flush: true)) {
            respond book, [status: 201]
        } else {
            respond book.errors, [status: 400]
        }
    }

    def update(int id) {
        def book = Book.get(id)
        if (book) {
            book.properties = request.JSON
            if (book.save(flush: true)) {
                respond book
            } else {
                respond book.errors, [status: 400]
            }
        } else {
            render status: 404
        }
    }

    def delete(int id) {
        def book = Book.get(id)
        if (book) {
            book.delete(flush: true)
            render status: 204
        } else {
            render status: 404
        }
    }
}
