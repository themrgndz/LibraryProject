class Book {
    Long id
    String title
    Author author
    Publisher publisher
    Integer publicationYear
    Integer pageCount
    String language
    Category category
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