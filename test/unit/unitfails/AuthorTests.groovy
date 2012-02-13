package unitfails



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Author)
@Mock([Book, Author])
class AuthorTests {

    void testCanCreateAuthor() {
       assert new Author(name: 'Author').save(flush: true)
    }
}
