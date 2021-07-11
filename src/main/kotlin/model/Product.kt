package model

import com.google.gson.annotations.SerializedName



data class Product(

    @SerializedName("id") val id : Int,
    @SerializedName("createdAt") val createdAt : String,
    @SerializedName("name") val name : String,
    @SerializedName("avatar") val avatar : String,
    @SerializedName("category") val category : String,
    @SerializedName("tags") val tags : List<Int>,
    @SerializedName("price") val price : Double,
    @SerializedName("department") val department : String,
    @SerializedName("color") val color : String,
    @SerializedName("adjective") val adjective : String,
    @SerializedName("material") val material : String,
    @SerializedName("description") val description : String
)