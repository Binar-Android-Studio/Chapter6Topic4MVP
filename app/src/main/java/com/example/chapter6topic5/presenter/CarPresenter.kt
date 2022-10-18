package com.example.chapter6topic5.presenter

import com.example.chapter6topic5.model.DetailCarItem
import com.example.chapter6topic5.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CarPresenter(val viewCar : CarView) {
    fun getDataCar(){
        RetrofitClient.instance.getAllCar()
            .enqueue(object : Callback<List<DetailCarItem>> {
                override fun onResponse(
                    call: Call<List<DetailCarItem>>,
                    response: Response<List<DetailCarItem>>
                ) {
                    if (response.isSuccessful){
                        viewCar.onSuccess(response.message(), response.body()!!)
                    }else{
                        viewCar.onError(response.message())
                    }
                }

                override fun onFailure(call: Call<List<DetailCarItem>>, t: Throwable) {
                    viewCar.onError(t.message!!)
                }

            })
    }
}