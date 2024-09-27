class Role {
    Long id
    String roleName

    static constraints = {
        roleName nullable: false, blank: false, unique: true
    }
}