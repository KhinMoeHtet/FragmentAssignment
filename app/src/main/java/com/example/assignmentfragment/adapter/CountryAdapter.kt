package com.example.assignmentfragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentfragment.R
import com.example.assignmentfragment.model.Country
import kotlinx.android.synthetic.main.country_item.view.*

class CountryAdapter(var countryList: ArrayList<Country>) :
    RecyclerView.Adapter<CountryAdapter.countryViewHolder>() {
    class countryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(country: Country) {
            itemView.imgCountry.setImageResource(country.imageCountry)
            itemView.txtCountryName.text = country.nameCountry
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): countryViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.country_item, parent, false)
        return countryViewHolder(view)
    }

    override fun getItemCount(): Int = countryList.size
    override fun onBindViewHolder(holder: countryViewHolder, position: Int) {
        holder.bind(countryList[position])
    }
}