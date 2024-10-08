package mylibrary

class CorsInterceptor {

    CorsInterceptor() {
        matchAll() // Tüm isteklere uygulanır
    }

    boolean before() {
        response.setHeader("Access-Control-Allow-Origin", "http://localhost:3030") // Frontend URL
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")
        response.setHeader("Access-Control-Allow-Headers", "Origin, Content-Type, Accept, Authorization")
        response.setHeader("Access-Control-Allow-Credentials", "true")

        if (request.method == "OPTIONS") {
            response.status = 200 // OPTIONS isteği olduğunda 200 döner
            return false // İşlemi sonlandır
        }

        return true // Diğer istekleri devam ettir
    }

    boolean after() {
        return true
    }

    void afterView() {
        // No-op
    }
}