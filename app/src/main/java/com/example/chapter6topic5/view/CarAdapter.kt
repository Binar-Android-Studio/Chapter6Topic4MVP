package com.example.chapter6topic5.view


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.chapter6topic5.databinding.ItemCarBinding
import com.example.chapter6topic5.model.DetailCarItem

class CarAdapter (var listCar : List<DetailCarItem>): RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    inner class ViewHolder(var binding: ItemCarBinding) :
            RecyclerView.ViewHolder(binding.root){
                fun bind(item: DetailCarItem){
                    binding.apply {
                        nameCar.text = item.name
                        categoryCar.text = item.category
                        priceCar.text = item.price.toString()

                        Glide.with(itemView)
                            .load(item.image)
                            .into(imgCar)

                    }
                }
            }


    interface CarAdapterInterface {
        fun onItemClick(car : DetailCarItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarAdapter.ViewHolder {
        var view = ItemCarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: CarAdapter.ViewHolder, position: Int) {
        holder.bind(listCar[position])

    }

    override fun getItemCount(): Int {
        return listCar.size
    }
}