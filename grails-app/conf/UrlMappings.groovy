class UrlMappings {
    static mappings = {
        "/"(controller: 'Giris', action: 'index')
        "/anasayfa"(controller: 'Anasayfa',action: 'index')
        "500"(view:'/error')
    }
}
