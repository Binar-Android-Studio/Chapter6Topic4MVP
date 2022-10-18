package com.example.chapter6topic5.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DetailCarItem(
    @SerializedName("category")
    var category: String?,
    @SerializedName("createdAt")
    var createdAt: String?,
    @SerializedName("finish_rent_at")
    var finishRentAt: Any?,
    @SerializedName("id")
    var id: Int?,
    @SerializedName("image")
    var image: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("price")
    var price: Int?,
    @SerializedName("start_rent_at")
    var startRentAt: Any?,
    @SerializedName("status")
    var status: Boolean?,
    @SerializedName("updatedAt")
    var updatedAt: String?
) : Serializable