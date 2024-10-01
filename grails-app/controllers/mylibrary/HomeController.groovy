package mylibrary

class HomeController {

    def Homepage(){
        respond Book.list()
    }
    def Login(){}
    def Profile(){}
    def index() {
        render(view: 'index')  // React uygulamanızın index.html dosyasını render et
    }

}
