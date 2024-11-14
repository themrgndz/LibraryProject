package mylibrary

import javax.servlet.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class CorsFilters {

    def filters = {
        all(uri: "/**") {
            before = {
                if (request instanceof HttpServletRequest) {
                    HttpServletResponse response = (HttpServletResponse) response

                    response.setHeader("Access-Control-Allow-Origin", "*")
                    response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")
                    response.setHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                    response.setHeader("Access-Control-Allow-Credentials", "true")

                    if (request.method == "OPTIONS") {
                        response.status = 200
                        return false
                    }
                }
                return true
            }
        }
    }
}
