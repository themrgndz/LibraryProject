class KullaniciRol {
    Long kullaniciRolId
    Kullanici kullanici
    Rol rol

    static constraints = {
        kullanici nullable: false
        rol nullable: false
    }
}
