class UrlMappings {
    static mappings = {
        "/"(controller: 'home', action: 'login')
        "/homepage"(controller: 'home',action: 'homepage')
        "/home/homepage"(controller: 'home',action: 'homepage')
        "/profile"(controller: 'home',action: 'profile')
        "/detail/$id"(controller: "book", action: "detail")
        "500"(view:'/error')

        "/api/books"(resources: 'book')
        "/api/books/$id"(controller: 'book', action: [GET: 'show', PUT: 'update', DELETE: 'delete'])
        "/api/books"(controller: 'book', action: [GET: 'index', POST: 'save'])
        "/MyLibrary/api/books"(Controller: 'book', action: [GET: 'detail', POST: 'save'])
    }
}
