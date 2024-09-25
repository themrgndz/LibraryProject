class Kullanici {
    String isim
    String soyisim
    String kullaniciAdi
    String sifre
    String email
    String profilResmi
    static hasMany = [rezervasyonlar: Rezervasyon]
    static constraints = {
        isim blank: false
        soyisim blank: false
        kullaniciAdi blank: false, unique: true
        sifre blank: false
        email email: true, blank: false, unique: true
        profilResmi nullable: true
    }
}
