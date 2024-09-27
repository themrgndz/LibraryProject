class User {
    Long id
    String firstName
    String lastName
    String username
    String password
    String email
    String profilePicture

    static constraints = {
        firstName nullable: false, blank: false
        lastName nullable: false, blank: false
        username nullable: false, blank: false, unique: true
        password nullable: false, blank: false
        email nullable: false, blank: false, email: true
        profilePicture nullable: true
    }
}