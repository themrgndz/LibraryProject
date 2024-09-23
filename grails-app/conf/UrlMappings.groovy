class UrlMappings {
    static mappings = {
        "/"(view: "index") // Ana sayfa
        "500"(view:'/error') // Hata sayfası
        "/giris"(controller: "giris", action: "giris")
    }
}
