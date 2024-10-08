package mylibrary

class Book {

    String title          // Kitap İsmi
    String author         // Yazar
    String publisher      // Yayınevi
    Integer publication_year // Yayın Yılı
    Integer page_count     // Sayfa Sayısı
    String language       // Dil
    String category       // Kategori
    String isbn           // ISBN
    Integer stock         // Stok Sayısı
    String img            // Image Link

    static constraints = {
        title blank: false, maxSize: 255
        author blank: false, maxSize: 255
        publisher blank: false, maxSize: 255
        publication_year min: 1000, max: Calendar.getInstance().get(Calendar.YEAR)
        page_count min: 1
        language blank: false, maxSize: 50
        category blank: false, maxSize: 100
        isbn blank: false, unique: true, maxSize: 13
        stock min: 0
        img blank: false
    }
    static mapping = {
        version false
    }
}

