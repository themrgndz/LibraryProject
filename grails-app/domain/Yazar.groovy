class Yazar {
    Long yazarId
    String isim

    static constraints = {
        isim nullable: false, blank: false, size: 1..150
    }
}
