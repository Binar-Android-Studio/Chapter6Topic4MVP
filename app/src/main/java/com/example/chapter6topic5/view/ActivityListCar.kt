package com.example.chapter6topic5.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.chapter6topic5.R
import com.example.chapter6topic5.databinding.ActivityListCarBinding
import com.example.chapter6topic5.model.DetailCarItem
import com.example.chapter6topic5.presenter.CarPresenter
import com.example.chapter6topic5.presenter.CarView

class ActivityListCar : AppCompatActivity(), CarView {
     lateinit var binding: ActivityListCarBinding
     lateinit var presenterCar : CarPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListCarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenterCar = CarPresenter(this)
        presenterCar.getDataCar()
    }

    override fun onSuccess(msg : String, car : List<DetailCarItem>){
        binding.apply {
            rvCar.layoutManager = LinearLayoutManager(this@ActivityListCar)
            rvCar.adapter = CarAdapter(car)
        }
    }

    override fun onError(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}