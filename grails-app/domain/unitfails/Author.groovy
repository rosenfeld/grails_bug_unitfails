package unitfails

class Author {
    String name
    // run "test-app unit:" from Grails interactive console and see it pass
    static hasMany = [books: Book] // comment this while on Grails interactive console
    // uncomment this and run "test-app unit:" again. Give it enough time and it will fail now:
    //static hasMany = [whateverOtherName: Book]

    static constraints = {
    }
}
