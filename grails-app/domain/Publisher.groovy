class Publisher {
    Long id
    String publisherName

    static constraints = {
        publisherName nullable: false, blank: false
    }
}