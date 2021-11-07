package com.example.hw_product_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw_product_recycleview.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

       val intentText = intent.extras!!.getInt("name")
        binding.phonename.text = getText(intentText)
                val intentImage= intent!!.extras?.getInt("image")
                binding.imagephone.setImageResource(intentImage!!)






    }
}