class UrlMappings {

    static mappings = {

        "/MyLibrary/api/books"(controller: 'book') {
            action = [GET: 'index', POST: 'save']
        }

        "/MyLibrary/api/books/$id"(controller: 'book') {
            action = [GET: 'show', PUT: 'update', DELETE: 'delete']
        }

        // Optional: You could add an additional mapping for create/edit forms if needed.
        "/MyLibrary/api/books/create"(controller: 'book', action: 'create', method: 'GET')
        "/MyLibrary/api/books/edit/$id"(controller: 'book', action: 'edit', method: 'GET')

        // Default URL Mapping
        "/"(view: "/index")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
