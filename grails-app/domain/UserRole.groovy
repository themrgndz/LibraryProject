class UserRole {
    Long id
    User user
    Role role

    static constraints = {
        user nullable: false
        role nullable: false
    }
}