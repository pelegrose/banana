import kotlinx.coroutines.runBlocking
import model.Product
import org.junit.Test
import kotlin.test.assertEquals

class ExtractTest {

    private val productClient = ProductClient()
    private val parser = ProductParser()
    private val etl = ProductETLService(productClient,parser)

    @Test
    fun `given an api call to fetch a product, read it into a domain object`(){
        val parse = etl.run()
        assertEquals("silver", parse?.color)
    }

    @Test
    fun `load all products  to mem`(){

        val actual = runBlocking {
            etl.getAllProducts(10)
        }

        assertEquals(10,actual.size)


    }



}


