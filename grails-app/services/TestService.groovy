class TestService {

    def kategoriService

    def testConnection() {
        try {
            def kategoriler = Kategori.list() // Kategoriler tablosundaki tüm verileri al
            return kategoriler // Kategorileri döndür
        } catch (Exception e) {
            return "Bağlantı hatası: ${e.message}" // Hata mesajını döndür
        }
    }
}
