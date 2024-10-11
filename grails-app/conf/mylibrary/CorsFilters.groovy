package mylibrary

class CorsFilter {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                response.setHeader('Access-Control-Allow-Origin', '*')
                response.setHeader('Access-Control-Allow-Methods', 'GET, POST, PUT, DELETE, OPTIONS')
                response.setHeader('Access-Control-Allow-Headers', 'Content-Type')
                response.setHeader('Access-Control-Max-Age', '3600')
            }
        }
    }
}
