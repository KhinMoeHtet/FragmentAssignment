package com.example.assignmentfragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignmentfragment.R
import com.example.assignmentfragment.adapter.ArrivalAdapter
import com.example.assignmentfragment.model.Arrival
import kotlinx.android.synthetic.main.fragment_arrival.*

class ArrivalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_arrival, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val arrivalList=ArrayList<Arrival>()
        arrivalList.add(Arrival(R.drawable.bag,"Hyde Park N41015","LOUIS VUITTON",4.0,9999999))
        arrivalList.add(Arrival(R.drawable.shirt,"HORNS PINK LONG SLEEVE T SHIRT","Lady Gaga",5.0,72000))
        arrivalList.add(Arrival(R.drawable.iphones12,"Iphone 12","Apple",3.0,600000))
        val itemAdapter = ArrivalAdapter(arrivalList)
        arrivalRecycler.layoutManager= LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        arrivalRecycler.adapter = itemAdapter
    }
}