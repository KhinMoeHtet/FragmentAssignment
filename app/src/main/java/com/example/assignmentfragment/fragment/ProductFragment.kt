package com.example.assignmentfragment.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assignmentfragment.R
import com.example.assignmentfragment.adapter.ProductAdapter
import com.example.assignmentfragment.model.Product
import kotlinx.android.synthetic.main.fragment_product.*

class ProductFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_product, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var productList=ArrayList<Product>()

        productList.add(Product(R.drawable.iphone,"new","30% discount",
            "IPhone 8 Plus ","Apple",4.0,980000,
            "110000 KS"))

        productList.add(Product(R.drawable.bed1,"new","34% discount",
            "GhostBed 11 Inch Cooling Gel Memory Foam...","GhostBed",
            4.0,325000,
            "495000 KS"))
        productList.add(Product(R.drawable.switch_neon,"","",
            "Nintendo Switch-Neon Blue and Red Joy-Con","Nintendo",
            4.0,395000,
            ""))
        productList.add(Product(R.drawable.dress,"new","",
            "BELAROI Womens Comfy Swing Tunic Short","Belaroi",
            4.0,18900,
            ""))


        var productAdapter= ProductAdapter(productList)
        productRecycler.layoutManager= LinearLayoutManager(context)
        productRecycler.adapter=productAdapter
    }
}