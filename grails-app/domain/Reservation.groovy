class Reservation {
    Long id
    User user
    Book book
    Date reservationDate
    String status

    static constraints = {
        user nullable: false
        book nullable: false
        reservationDate nullable: false
        status nullable: false, blank: false, inList: ["Reserved", "Cancelled", "Completed"]
    }
}