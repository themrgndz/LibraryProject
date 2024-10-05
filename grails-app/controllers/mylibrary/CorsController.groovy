package mylibrary

class CorsController {
    def handleCors() {
        response.setHeader("Access-Control-Allow-Origin", "*")
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, X-Requested-With")
        render(status: 200)
    }
}

