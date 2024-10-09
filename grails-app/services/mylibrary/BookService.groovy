package mylibrary

import grails.transaction.Transactional

@Transactional
class BookService {

    // List all books
    List<Book> listAllBooks() {
        Book.list()
    }

    // Add a new book
    Book saveBook(Map params) {
        Book book = new Book(params)
        if (book.save(flush: true)) {
            return book
        } else {
            return null
        }
    }

    // Update an existing book
    Book updateBook(Long id, Map params) {
        Book book = Book.get(id)
        if (book) {
            book.properties = params
            if (book.save(flush: true)) {
                return book
            }
        }
        return null
    }

    // Delete a book by ID
    boolean deleteBook(Long id) {
        Book book = Book.get(id)
        if (book) {
            book.delete(flush: true)
            return true
        }
        return false
    }

    // Get a single book by ID
    Book getBookById(Long id) {
        Book.get(id)
    }
}
