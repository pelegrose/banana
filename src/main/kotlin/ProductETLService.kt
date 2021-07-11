import kotlinx.coroutines.runBlocking
import model.Product

class ProductETLService(private val productClient: ProductClient,
                        private val parser: ProductParser){

    suspend fun getAllProducts( limit: Int): List<Product> {
        return (1..limit).mapNotNull {
            productClient.getProduct(it).let {  resp ->
                parser.parseProduct(resp)
            }
        }
    }

    fun run(): Product? {
        return runBlocking {
            parser.parseProduct(productClient.getProduct(1))
        }

    }

}
