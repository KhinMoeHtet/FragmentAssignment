package com.example.assignmentfragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentfragment.R
import com.example.assignmentfragment.model.Arrival
import kotlinx.android.synthetic.main.arrival_item.view.*


class ArrivalAdapter (var arrivalList: ArrayList<Arrival>) :
    RecyclerView.Adapter<ArrivalAdapter.ArrivalViewHolder>() {
    class ArrivalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(arrival:Arrival) {
            itemView.imgArrival.setImageResource(arrival.image)
            itemView.txtName.text = arrival.name
            itemView.txtBrand.text = arrival.brand
            itemView.rating_bar.rating = arrival.rating.toFloat()
            itemView.txtPrice.text = arrival.price.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArrivalViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.arrival_item, parent, false)
        return ArrivalViewHolder(view)
    }

    override fun getItemCount(): Int=arrivalList.size

    override fun onBindViewHolder(holder: ArrivalViewHolder, position: Int) {
        holder.bind(arrivalList[position])
    }


}