package mylibrary
class CorsFilters {
    def filters = {
        all(controller: '*', action: '*') {
            before = {
                response.setHeader("Access-Control-Allow-Origin", "*")
                response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")
                response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization")

                if (request.method == 'OPTIONS') {
                    response.setStatus(200)
                    render ''
                    return false
                }
            }
        }
    }
}
