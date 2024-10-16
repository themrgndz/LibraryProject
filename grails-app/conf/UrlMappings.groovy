class UrlMappings {
    static mappings = {
        // Homepage
        "/"(controller: 'home', action: 'list')

        // List
        "/list"(controller: 'home', action: 'list')
        "/list/search"(controller: 'home', action: 'search')

        // Save
        "/save"(controller: 'home', action: 'save')

        // Profile
        "/profile"(controller: 'home', action: 'profile')

        // Detail
        "/detail/$id"(controller: 'home', action: 'detail')

        // Error
        "500"(view:'/error')
    }
}
