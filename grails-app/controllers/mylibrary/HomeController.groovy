package mylibrary
import grails.converters.JSON

class HomeController {

    def list() {
        def books = Book.list() // Veritabanından kitapları alıyoruz
        render books as JSON //json formatında
    }
    def Homepage(){
        respond Book.list()
    }
    def Login(){}
    def Profile(){}
    def index() {
        def books = Book.list() // Kitapları veritabanından çek
        render books as JSON    // Kitapları JSON formatında döndür
    }

}
