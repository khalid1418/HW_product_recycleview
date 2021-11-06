package com.example.hw_product_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.Adapter.ItemAdapter
import com.example.hw_product_recycleview.data.DataSource
import com.example.hw_product_recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val mydataset= DataSource().Loadinformation()
        val recyclerview = findViewById<RecyclerView>(R.id.recycle_n)
        recyclerview.adapter= ItemAdapter(this,mydataset)
recyclerview.setHasFixedSize(true)


    }
}