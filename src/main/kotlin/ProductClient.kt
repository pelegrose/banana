import khttp.async
import khttp.responses.Response
import kotlin.coroutines.suspendCoroutine

class ProductClient {
    suspend fun getProduct(id: Int): Response {
        return suspendCoroutine { cont ->
            async.get("https://60d34780858b410017b2f602.mockapi.io/products/products/$id") {
                cont.resumeWith(Result.success(this)) // yield
            }
        }
    }

}