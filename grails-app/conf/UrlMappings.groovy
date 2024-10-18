class UrlMappings {
    static mappings = {
        // Homepage
        "/"(controller: 'book', action: 'list')

        // List
        "/list"(controller: 'book', action: 'list')
        "/list/search"(controller: 'book', action: 'search')

        // Detail
        "/detail/$id"(controller: 'book', action: 'detail')

        // API Routes
        "/api/books"(controller: 'book', action: 'list') // Tüm kitapları listele
        "/api/books/search"(controller: 'book', action: 'search') // Kitap arama
        "/api/books"(controller: 'book', action: 'save') // Yeni kitap kaydet
        "/api/books/$id"(controller: 'book', action: [GET: 'detail', PUT: 'update', DELETE: 'delete']) // ID'ye göre kitap işlemleri

        // Profile
        "/profile"(controller: 'book', action: 'profile')

        // Error
        "500"(view:'/error')
    }
}
