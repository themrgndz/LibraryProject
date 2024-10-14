class BootStrap {
    def init = { servletContext ->
        def book = new Book(title: 'Example Book').save(flush: true)
    }
    def destroy = {
    }
}
