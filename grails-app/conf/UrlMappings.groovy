class UrlMappings {
    static mappings = {
        "/"(controller: 'home', action: 'login')
        "/homepage"(controller: 'home',action: 'homepage')
        "/home/homepage"(controller: 'home',action: 'homepage')
        "/profile"(controller: 'home',action: 'profile')
        "/detail/$id"(controller: "book", action: "detail")
        "500"(view:'/error')

        //"/api/book"(controller: "book", action: "save")

        "/api/book/$id"(controller: 'book', action: [GET: 'show', PUT: 'update', DELETE: 'delete'])
        "/api/book"(controller: 'book', action: [GET: 'index', POST: 'save'])
        "/MyLibrary/api/book"(controller: 'book', action: [GET: 'index', POST: 'save'])

        "/**" {
            controller = "cors"
            action = "handleCors"
        }
    }
}
