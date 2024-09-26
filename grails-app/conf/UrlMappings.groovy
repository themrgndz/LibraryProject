class UrlMappings {
    static mappings = {
        "/"(controller: 'anasayfa', action: 'girisIndex')
        "/anasayfa"(controller: 'anasayfa',action: 'anasayfaIndex')
        "/profil"(controller: 'anasayfa',action: 'profilIndex')
        "/detay/$id"(controller: "kitap", action: "detay")
        "/yonetici"(controller: 'yonetici',action: 'anasayfaIndex')
        "500"(view:'/error')
        "/test"(controller: "anasayfa", action: "index")
    }
}
