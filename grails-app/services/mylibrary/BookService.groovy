package mylibrary

import grails.transaction.Transactional
import grails.validation.ValidationException

@Transactional
class BookService {

    // List all books with error handling
    List<Book> listAllBooks() {
        try {
            return Book.list()
        } catch (Exception e) {
            log.error("Error listing books: ${e.message}", e)
            return []
        }
    }

    // Add a new book with validation check
    Book saveBook(Map params) {
        try {
            Book book = new Book(params)
            book.validate() // Explicitly check validation before saving
            if (!book.hasErrors()) {
                book.save(flush: true)
                return book
            } else {
                log.error("Validation errors while saving book: ${book.errors}")
                throw new ValidationException("Book validation failed", book.errors)
            }
        } catch (Exception e) {
            log.error("Error saving book: ${e.message}", e)
            return null
        }
    }

    // Update an existing book with better error handling
    Book updateBook(Long id, Map params) {
        try {
            Book book = Book.get(id)
            if (!book) {
                log.error("Book not found with ID: $id")
                return null
            }
            book.properties = params
            book.validate()
            if (!book.hasErrors()) {
                book.save(flush: true)
                return book
            } else {
                log.error("Validation errors while updating book: ${book.errors}")
                throw new ValidationException("Book validation failed", book.errors)
            }
        } catch (Exception e) {
            log.error("Error updating book: ${e.message}", e)
            return null
        }
    }

    // Delete a book by ID with validation
    boolean deleteBook(Long id) {
        try {
            Book book = Book.get(id)
            if (book) {
                book.delete(flush: true)
                return true
            } else {
                log.error("Book not found with ID: $id")
                return false
            }
        } catch (Exception e) {
            log.error("Error deleting book: ${e.message}", e)
            return false
        }
    }

    // Get a single book by ID with better error handling
    Book getBookById(Long id) {
        try {
            Book book = Book.get(id)
            if (!book) {
                log.error("Book not found with ID: $id")
            }
            return book
        } catch (Exception e) {
            log.error("Error retrieving book by ID: ${e.message}", e)
            return null
        }
    }
}
