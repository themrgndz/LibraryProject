package mylibrary

class Book {
    String title
    String author
    String publisher
    Integer publication_year
    Integer page_count
    String isbn
    String category
    String language
    Integer stock
    String image_url
    String description

    static constraints = {
        title nullable: false, blank: false
        author nullable: false, blank: false
        isbn nullable: false, unique: true
    }
    static mapping = {
        version false
    }
}
