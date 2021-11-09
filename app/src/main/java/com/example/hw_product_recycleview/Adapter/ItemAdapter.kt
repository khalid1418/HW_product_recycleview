package com.example.hw_product_recycleview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.PhoneListFragmentDirections
import com.example.hw_product_recycleview.R
import com.example.hw_product_recycleview.data.DataSource


class ItemAdapter(private val context: Context?) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private val dataset = DataSource().Loadinformation()

    class ItemViewHolder( val view: View) : RecyclerView.ViewHolder(view) {

        val productImage: ImageView? = view.findViewById(R.id.imageView)
        val productName: TextView? = view.findViewById(R.id.PhoneName)
        val productPrice: TextView? = view.findViewById(R.id.Price)
        val productIsVip: ImageView? = view.findViewById(R.id.VipIcone)
        val productButton:Button = view.findViewById(R.id.Button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.productImage?.setImageResource(item.productImage)
        holder.productName?.text = context?.resources?.getText(item.productName)
        holder.productPrice?.text = item.productPrice

        if (item.isVip) {
            holder.productIsVip?.visibility = View.VISIBLE
        }
        holder.productButton.setOnClickListener {

            if (item.productQuantity <= 0) {
                Toast.makeText(
                    context,
                    "the product is not available right now",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val action = PhoneListFragmentDirections.actionPhonelistToWordListFragment(phoneme = context?.resources?.getText(item.productName).toString(), image = item.productImage)
               holder.itemView.findNavController().navigate(action)

            }
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}

