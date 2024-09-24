
class UrlMappings {
    static mappings = {
        "/"(controller: "anasayfa", action: "index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
