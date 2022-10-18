package com.example.chapter6topic5.presenter

import com.example.chapter6topic5.model.DetailCarItem

interface CarView {

    fun onSuccess(msg : String, car : List<DetailCarItem>)
    fun onError(msg : String)

}