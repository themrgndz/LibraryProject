class UrlMappings {
    static mappings = {
        // Homepage
        "/"(controller: 'home', action: 'list')

        // List
        "/list"(controller: 'home', action: 'list')
        "/list/search"(controller: 'home', action: 'search')

        // List
        "/api/list"(controller: 'home', action: 'list')
        "/api/save"(controller: 'home', action: 'save')

        // Save
        "/save"(controller: 'home', action: 'save')

        // Profile
        "/profile"(controller: 'home', action: 'profile')

        // Detail
        "/detail/$id"(controller: 'home', action: 'detail')

        // Error
        "500"(view:'/error')

        // API Routes
        "/api/list/$id"(controller: 'book', action: [GET: 'show', PUT: 'update', DELETE: 'delete']) // ID'ye göre kitap işlemleri

    }
}
