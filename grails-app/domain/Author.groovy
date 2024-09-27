class Author {
    Long id
    String name

    static constraints = {
        name nullable: false, blank: false
    }
}