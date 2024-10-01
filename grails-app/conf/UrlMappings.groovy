class UrlMappings {
    static mappings = {
        "/"(controller: 'home', action: 'login')
        "/homepage"(controller: 'home',action: 'homepage')
        "/home/homepage"(controller: 'home',action: 'homepage')
        "/profile"(controller: 'home',action: 'profile')
        "/detail/$id"(controller: "book", action: "detail")
        "/admin"(controller: 'admin',action: 'admin')
        "500"(view:'/error')
        "/index"(controller: 'home',action: 'index')

        "/api/books"(resources: 'book')
        "/api/books/$id"(controller: 'book', action: [GET: 'show', PUT: 'update', DELETE: 'delete'])
        "/api/books"(controller: 'book', action: [GET: 'index', POST: 'save'])
    }
}
