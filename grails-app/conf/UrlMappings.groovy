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
    }
}
