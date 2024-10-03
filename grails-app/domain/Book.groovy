class Book {
    Long id
    String title
    String author
    String publisher
    Integer publicationYear
    Integer pageCount
    String language
    String category
    String isbn
    Integer stockCount

    static constraints = {
        title nullable: false, blank: false
        author nullable: false
        publisher nullable: false
        publicationYear nullable: false
        pageCount nullable: false
        language nullable: false, blank: false
        category nullable: false
        isbn nullable: false, blank: false, unique: true
        stockCount nullable: false
    }
}