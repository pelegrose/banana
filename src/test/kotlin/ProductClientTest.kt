import kotlinx.coroutines.runBlocking
import org.junit.Test
import kotlin.test.assertEquals

internal class ProductClientTest {

    val uut = ProductClient()

    @Test
    fun `given a product with id 2, fetch to model`() {
        val resp = runBlocking {
             uut.getProduct(2)
        }
        assertEquals(expected = 200,resp.statusCode)

    }
}