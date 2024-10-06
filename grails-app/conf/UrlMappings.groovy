class UrlMappings {
    static mappings = {
        "/"(controller: 'home', action: 'login')

        "/api/books"(controller: 'book', action: 'index', method: 'GET')
        "/api/books"(controller: 'book', action: 'saveBook', method: 'POST')
        "/api/books/$id"(controller: 'book', action: 'show', method: 'GET')
        "/api/books/$id"(controller: 'book', action: 'update', method: 'PUT')
        "/api/books/$id"(controller: 'book', action: 'delete', method: 'DELETE')


        "/**" {
            controller = "cors"
            action = "handleCors"
        }
    }
}
