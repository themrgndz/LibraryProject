import javax.servlet.*
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class CorsFilter implements Filter {

    void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse res = (HttpServletResponse) response
        HttpServletRequest req = (HttpServletRequest) request
        res.setHeader("Access-Control-Allow-Origin", "*")
        res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT")
        res.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization")
        res.setHeader("Access-Control-Max-Age", "3600")
        if ("OPTIONS".equalsIgnoreCase(req.getMethod())) {
            res.setStatus(HttpServletResponse.SC_OK)
        } else {
            chain.doFilter(request, response)
        }
    }

    void init(FilterConfig filterConfig) throws ServletException {}

    void destroy() {}
}
