class Rezervasyon {
    Kullanici kullanici
    Kitap kitap
    Date rezervasyonTarihi
    static constraints = {
        kullanici nullable: false
        kitap nullable: false
        rezervasyonTarihi nullable: false
    }
}
