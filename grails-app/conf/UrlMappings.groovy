class UrlMappings {
    static mappings = {
        "/"(controller: 'anasayfa', action: 'girisIndex')
        "/anasayfa"(controller: 'anasayfa',action: 'anasayfaIndex')
        "/profil"(controller: 'anasayfa',action: 'profilIndex')
        "/detay/$id"(controller: "kitap", action: "detay")
        "500"(view:'/error')
    }
}
