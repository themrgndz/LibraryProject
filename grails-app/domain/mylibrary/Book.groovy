package mylibrary

class Book {

    String title            // Title of the book
    String author           // Author of the book
    String publisher        // Publisher of the book
    Integer publication_year // Year of publication
    Integer page_count      // Total number of pages
    String language         // Language of the book
    String category         // Category of the book
    String isbn             // ISBN of the book
    Integer stock_count      // Number of copies in stock
    String img              // Link to the book cover image

    static constraints = {
        title blank: false, maxSize: 255
        author blank: false, maxSize: 255
        publisher blank: false, maxSize: 255
        publication_year nullable: true // Optional
        page_count min: 1, nullable: true // Must be positive if provided
        language blank: false, maxSize: 50
        category blank: false, maxSize: 100
        isbn blank: false, unique: true, matches: /^[0-9\-]+$/
        stock_count min: 0, nullable: true // Can be zero or positive
        img nullable: true // Optional
    }
    static mapping = { version false }
}
