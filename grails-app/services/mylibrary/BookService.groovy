package mylibrary

import grails.transaction.Transactional

@Transactional
class BookService {

    List<Book> getAllBooks() {
        return Book.list()
    }

    Book getBookById(Long id) {
        return Book.get(id)
    }

    Book addBook(String name, String author, String publisher, Integer year, Integer pageCount, String language, Category category, String isbn, Integer stock, String img) {
        Book book = new Book(
                name: name,
                author: author,
                publisher: publisher,
                year: year,
                pageCount: pageCount,
                language: language,
                category: category,
                isbn: isbn,
                stock: stock,
                img: img
        )
        if (book.save(flush: true)) {
            return book
        } else {
            return null
        }
    }

    Book updateBook(Long id, String name, String author, String publisher, Integer year, Integer pageCount, String language, Category category, String isbn, Integer stock, String img) {
        Book book = Book.get(id)
        if (book) {
            book.name = name
            book.author = author
            book.publisher = publisher
            book.year = year
            book.pageCount = pageCount
            book.language = language
            book.category = category
            book.isbn = isbn
            book.stock = stock
            book.img = img
            book.save(flush: true)
            return book
        } else {
            return null
        }
    }

    boolean deleteBook(Long id) {
        Book book = Book.get(id)
        if (book) {
            book.delete(flush: true)
            return true
        } else {
            return false
        }
    }
}
