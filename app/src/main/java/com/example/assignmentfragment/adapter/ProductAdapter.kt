package com.example.assignmentfragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentfragment.R
import com.example.assignmentfragment.model.Product
import kotlinx.android.synthetic.main.product_item.view.*

class ProductAdapter(var productList: ArrayList<Product>) :
    RecyclerView.Adapter<ProductAdapter.productViewHolder>() {
    class productViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(product: Product) {
            itemView.imgProduct.setImageResource(product.imageProduct)
            itemView.txtNew.text=product.new
            itemView.txtDiscount.text=product.discount
            itemView.txtProductName.text=product.nameProduct
            itemView.txtProductBrand.text = product.brandProduct
            itemView.txtProductPrice.text = product.priceProduct.toString()
            itemView.txtProductPriceChanged.text = product.priceChangedProduct
            itemView.rating_bar_Product.rating = product.rating.toFloat()





        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.product_item, parent, false)
        return productViewHolder(view)
    }

    override fun getItemCount(): Int = productList.size
    override fun onBindViewHolder(holder: productViewHolder, position: Int) {
        holder.bind(productList[position])
    }
}