class Rol {
    Long rolId
    String rolAdi

    static constraints = {
        rolAdi nullable: false, blank: false, unique: true
    }
}
