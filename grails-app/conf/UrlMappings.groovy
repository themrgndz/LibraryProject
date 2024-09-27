class UrlMappings {
    static mappings = {
        "/"(controller: 'Home', action: 'Login')
        "/homepage"(controller: 'Home',action: 'homepage')
        "/profile"(controller: 'Home',action: 'profile')
        "/detail/$id"(controller: "Book", action: "detail")
        "/admin"(controller: 'Admin',action: 'admin')
        "500"(view:'/error')
    }
}
