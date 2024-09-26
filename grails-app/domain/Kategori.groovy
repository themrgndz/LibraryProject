class Kategori {
    Long kategoriId
    String kategoriAdi

    static constraints = {
        kategoriAdi nullable: false, blank: false, size: 1..100
    }
}
