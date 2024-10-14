package mylibrary
import grails.converters.JSON

class HomeController {

    def list() {
        def books = Book.list()
        render books as JSON
    }

    def Homepage(){
        respond Book.list()
    }
}
