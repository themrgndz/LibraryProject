class Kitap {
    Long kitapId
    String baslik
    Yazar yazar
    Yayinci yayinci
    Integer yayinYili
    Integer sayfaSayisi
    String dil
    Kategori kategori
    String isbn
    Integer stokSayisi

    static constraints = {
        baslik nullable: false, blank: false, size: 1..200
        yayinYili nullable: false, min: 1450 // matbaanın icadı sonrası
        sayfaSayisi nullable: false, min: 1
        dil nullable: false, blank: false
        isbn nullable: false, blank: false, unique: true
        stokSayisi nullable: false, min: 0
    }
}
