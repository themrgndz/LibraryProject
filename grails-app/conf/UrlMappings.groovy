class UrlMappings {
    static mappings = {
        "/"(controller: 'home', action: 'homepage')
        "/list"(controller: 'home', action: 'list')
        "/save"(controller: 'home', action: 'save')
        "/MyLibrary/save"(controller: 'home', action: 'save')
        "/profile"(controller: 'home',action: 'profile')
        "/detail/$id"(controller: "home", action: "detail")
        "500"(view:'/error')
    }
}
