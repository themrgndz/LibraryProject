package mylibrary

class BookController {

    def detail(Long id) {
        def bookInstance = Book.get(id)
        def similarBooks = Book.findAll("from Book as b where b.id != :id order by rand()", [id: id], [max: 4])
        if (!bookInstance) {
            flash.message = "Kitap bulunamadı"
            redirect(action: "detail")
        } else {
            [bookInstance: bookInstance, similarBooks: similarBooks]
        }
    }

}
