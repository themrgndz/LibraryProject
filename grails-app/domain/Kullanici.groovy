class Kullanici {
    Long kullaniciId
    String ad
    String soyad
    String kullaniciAdi
    String sifre
    String eposta
    String profilResmi

    static constraints = {
        ad nullable: false, blank: false
        soyad nullable: false, blank: false
        kullaniciAdi nullable: false, blank: false, unique: true
        sifre nullable: false, blank: false, password: true
        eposta nullable: false, blank: false, email: true
        profilResmi nullable: true
    }
}
