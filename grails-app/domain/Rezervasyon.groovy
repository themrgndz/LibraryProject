class Rezervasyon {
    Long rezervasyonId
    Kullanici kullanici
    Kitap kitap
    Date rezervasyonTarihi
    String durum

    static constraints = {
        kullanici nullable: false
        kitap nullable: false
        rezervasyonTarihi nullable: false
        durum nullable: false, blank: false, inList: ["Beklemede", "Onaylandı", "İptal"]
    }
}
