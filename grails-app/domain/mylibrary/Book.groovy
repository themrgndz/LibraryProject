package mylibrary

class Book {

    String title
    String author
    String publisher
    Integer publication_year
    Integer page_count
    String language
    String category
    String isbn
    Integer stock_count
    String img

    static constraints = {
        title blank: false, maxSize: 255
        author blank: false, maxSize: 255
        publisher blank: false, maxSize: 255
        publication_year nullable: true
        page_count min: 1, nullable: true
        language blank: false, maxSize: 50
        category blank: false, maxSize: 100
        isbn blank: false, unique: true, matches: /^[0-9\-]+$/
        stock_count min: 0, nullable: true
        img nullable: true
    }
    static mapping = { version false }
}
