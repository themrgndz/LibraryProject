class Kitap {

    String id
    String ad
    String yazar
    String yayinEvi
    Integer yayinYili
    Integer sayfaSayisi
    String dil
    String kategori
    String isbn
    Integer stokSayisi
    String aciklama
    String kapakResmi

    static hasMany = [rezervasyonlar: Rezervasyon]
    static constraints = {
        id blank: false, unique: true
        ad blank: false
        yazar blank: false
        yayinEvi blank: false
        yayinYili nullable: true
        sayfaSayisi min: 1
        dil blank: false
        kategori blank: false
        isbn blank: false, unique: true, matches: /^[0-9]{13}$/
        stokSayisi min: 0
        aciklama blank: false
        kapakResmi blank: false
    }
}
