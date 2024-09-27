class Category {
    Long id
    String categoryName

    static constraints = {
        categoryName nullable: false, blank: false
    }
}