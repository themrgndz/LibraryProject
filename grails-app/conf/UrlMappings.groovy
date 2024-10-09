class UrlMappings {

    static mappings = {

        // GET Mappings
        "/"(controller: 'book', action: 'index')
        "/MyLibrary/api/books"(controller: 'book', action: 'index')
        "/MyLibrary/api/books/$id"(controller: 'book', action: 'show')
        "/MyLibrary/api/books/create"(controller: 'book', action: 'create')
        "/MyLibrary/api/books/edit/$id"(controller: 'book', action: 'edit')

        // POST Mappings
        "/MyLibrary/api/books"(controller: 'book', action: 'save', method: 'POST')

        // PUT Mappings
        "/MyLibrary/api/books/$id"(controller: 'book', action: 'update', method: 'PUT')

        // DELETE Mappings
        "/MyLibrary/api/books/$id"(controller: 'book', action: 'delete', method: 'DELETE')

        // Default URL Mapping
        "/"(view: "/index")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
