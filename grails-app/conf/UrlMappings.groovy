class UrlMappings {
    static mappings = {
        "/$controller/$action?/$id?"{
            constraints {

            }
        }

        // Anasayfa için yönlendirme
        "/"(controller: "anasayfa", action: "anasayfa")

        // Kitaplar listesi için yönlendirme
        "/books"(controller: "book", action: "list")

        // Kitap detayları için yönlendirme
        "/books/$id"(controller: "book", action: "show")

        // Admin paneli için yönlendirme
        "/admin"(controller: "admin", action: "dashboard")

        // 404 Hata Sayfası
        "404"(view: '/notFound')

        // 500 Hata Sayfası
        "500"(view: '/error')
    }
}
