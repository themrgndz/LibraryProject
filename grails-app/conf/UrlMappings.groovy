class UrlMappings {
    static mappings = {
        // API Routes
        
        // GET /api/books - Tüm kitapları listeler
        "/api/books"(controller: 'book', action: 'list', method: 'GET')
        
        // POST /api/books - Yeni kitap ekler
        "/api/books"(controller: 'book', action: 'save', method: 'POST')
        
        // GET /api/books/search - Kitap araması yapar
        "/api/books/search"(controller: 'book', action: 'search')
        
        // GET /api/books/{id} - ID'ye göre kitap detayını getirir
        "/api/books/$id"(controller: 'book', action: 'detail', method: 'GET')
        
        // PUT /api/books/{id} - ID'ye göre kitap bilgilerini günceller
        "/api/books/$id"(controller: 'book', action: 'update', method: 'PUT') 
        
        // DELETE /api/books/{id} - ID'ye göre kitabı siler
        "/api/books/$id"(controller: 'book', action: 'delete', method: 'DELETE')

        "500"(view:'/error')
    }
}
