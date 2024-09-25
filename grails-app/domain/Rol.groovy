class Rol {
    String ad
    static hasMany = [kullanicilar: Kullanici]
    static constraints = {
        ad blank: false, unique: true
    }
}
