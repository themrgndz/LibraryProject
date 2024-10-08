package mylibrary

class Book {
    String title
    String description
    String imageUrl
    int stock

    static constraints = {
        title nullable: false, blank: false, maxSize: 255
        description nullable: true, maxSize: 1000
        imageUrl nullable: true, maxSize: 2048
        stock nullable: false, min: 0
    }

    static mapping = {
        version false // Disable versioning
    }
}
