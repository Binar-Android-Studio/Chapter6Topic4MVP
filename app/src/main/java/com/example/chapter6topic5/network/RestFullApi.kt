package com.example.chapter6topic5.network

import com.example.chapter6topic5.model.DetailCarItem
import retrofit2.Call
import retrofit2.http.GET

interface RestFullApi {
    @GET("admin/car")
    fun getAllCar() : Call<List<DetailCarItem>>
}