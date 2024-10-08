class UrlMappings {
    static mappings = {
        "/"(controller: 'home', action: 'login')

        "/books"(controller: "book", action: "list", method: "GET")
        "/books/$id"(controller: "book", action: "show", method: "GET")
        "/books"(controller: "book", action: "save", method: "POST")
        "/books/$id"(controller: "book", action: "update", method: "PUT")
        "/books/$id"(controller: "book", action: "delete", method: "DELETE")

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
