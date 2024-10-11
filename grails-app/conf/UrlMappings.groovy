class UrlMappings {

    static mappings = {
        "/mylibrary/books"(controller: "book", action: "index") // List all books
        "/mylibrary/book"(controller: "book", action: "save") // Save a new book
        "/mylibrary/book/$id"(controller: "book", action: "show") // Show a single book
        "/mylibrary/book/$id"(controller: "book", action: "update") // Update a book
        "/mylibrary/book/$id"(controller: "book", action: "delete") // Delete a book

        // API Routes
        "/mylibrary/api/books"(controller: "book", action: "index") // List all books for API
        "/mylibrary/api/book"(controller: "book", action: "save") // Save a new book for API
        "/mylibrary/api/book/$id"(controller: "book", action: "show") // Show a single book for API
        "/mylibrary/api/book/$id"(controller: "book", action: "update") // Update a book for API
        "/mylibrary/api/book/$id"(controller: "book", action: "delete") // Delete a book for API

        // Default
        "/"(controller: "book", action: "index")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
