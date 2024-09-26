class AnasayfaController {
    def anasayfaIndex(){}
    def girisIndex(){}
    def profilIndex(){}

    TestService testService

    def index() {
        def result = testService.testConnection() // Service'den bağlantı testi yap
        render result // Sonucu render et
    }
}

