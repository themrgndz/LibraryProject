package mylibrary

class Book {
    String title
    String author
    String publisher
    Integer publicationYear
    Integer pageCount
    String language
    String category
    String isbn
    Integer stock
    String description
    String image_url

    static constraints = {
        title nullable: false
        author nullable: false
        publisher nullable: false
        publicationYear nullable: false
        pageCount nullable: false
        language nullable: false
        category nullable: false
        isbn nullable: false, unique: true
        stock nullable: false, min: 0
        description nullable: true
        image_url nullable: true
    }
    static mapping = {
        version false
    }
}
