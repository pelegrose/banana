import com.google.gson.Gson
import khttp.responses.Response
import model.Product

class ProductParser {
     fun parseProduct(asyncHttpReq: Response): Product? {
         return Gson().fromJson(
             asyncHttpReq.text,
             Product::class.java
         )
     }

}