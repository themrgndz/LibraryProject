class UrlMappings {

    static mappings = {
        // Kitaplar için temel işlemler
        "/MyLibrary/books"(controller: "book", action: "index") // Tüm kitapları listele
        "/MyLibrary/book"(controller: "book", action: "save") // Yeni bir kitap kaydet
        "/MyLibrary/book/$id"(controller: "book", action: "show") // Tek bir kitabı göster
        "/MyLibrary/book/$id/update"(controller: "book", action: "update") // Bir kitabı güncelle
        "/MyLibrary/book/$id/delete"(controller: "book", action: "delete") // Bir kitabı sil

        // API Yolları
        "/MyLibrary/api/books"(controller: "book", action: "index") // API üzerinden tüm kitapları listele
        "/MyLibrary/api/book"(controller: "book", action: "save") // API üzerinden yeni bir kitap kaydet
        "/MyLibrary/api/book/$id"(controller: "book", action: "show") // API üzerinden tek bir kitabı göster
        "/MyLibrary/api/book/$id/update"(controller: "book", action: "update") // API üzerinden bir kitabı güncelle
        "/MyLibrary/api/book/$id/delete"(controller: "book", action: "delete") // API üzerinden bir kitabı sil

        // Default
        "/"(controller: "book", action: "index") // Ana sayfa
        "500"(view: '/error') // 500 Hatası
        "404"(view: '/notFound') // 404 Hatası
    }
}
