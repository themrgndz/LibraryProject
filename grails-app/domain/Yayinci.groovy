class Yayinci {
    Long yayinciId
    String yayinciAdi

    static constraints = {
        yayinciAdi nullable: false, blank: false, size: 1..150
    }
}
