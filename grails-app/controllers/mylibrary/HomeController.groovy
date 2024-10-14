package mylibrary
import grails.converters.JSON

class HomeController {

    def list() {
        def books = Book.list()
        render books as JSON
    }

    // 3. POST - Yeni bir kitap oluşturma
    def save() {
        def book = new Book(request.JSON)  // JSON verilerini Book domain objesine çevirir.
        if (book.save(flush: true)) {
            render book as JSON  // Başarıyla oluşturulan kitabı geri döndürür.
        } else {
            render(status: 400, text: "Kitap oluşturulamadı")
        }
    }
    def options() {
        response.status = 200 // 200 OK durumu
        response.addHeader('Access-Control-Allow-Origin', 'http://localhost:3030')
        response.addHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS')
        response.addHeader('Access-Control-Allow-Headers', 'Content-Type, Authorization, X-Requested-With')
    }
}
