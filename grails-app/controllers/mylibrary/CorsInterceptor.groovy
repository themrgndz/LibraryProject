package mylibrary

class CorsInterceptor {

    CorsInterceptor() {
        matchAll() // Tüm URL'ler için geçerli
    }

    boolean before() {
        response.setHeader("Access-Control-Allow-Origin", "*") // Belirli bir domain kullanmak istersen "*" yerine o domain'i yazabilirsin
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization")

        // OPTIONS isteğine cevap vermek için
        if (request.method == 'OPTIONS') {
            render(status: 200)
            return false
        }

        return true // Diğer işlemler için isteğin devam etmesini sağla
    }

    boolean after() {
        return true
    }

    void afterView() {
        // Görüntüleme sonrası işlemler için
    }
}
