package mylibrary

class MyCorsFilters {

    def filters = {
        all(controller: '*', action: '*') {
            before = {
                response.setHeader("Access-Control-Allow-Origin", "*")
                response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")
                response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization")

                // OPTIONS istekleri için hemen cevap vermek
                if (request.method == 'OPTIONS') {
                    response.status = 200
                    return false // Filtreyi sonlandır
                }
            }
            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }
    }
}
