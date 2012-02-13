package unitfails

class Book {
    String title
    static belongsTo = [author: Author]

    static constraints = {
      author nullable: true
    }
}
