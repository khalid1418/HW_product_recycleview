package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_product_recycleview.databinding.FragmentWordListBinding

class WordListFragment : Fragment() {

    private var _binding :FragmentWordListBinding?=null

      val binding:FragmentWordListBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentWordListBinding.inflate(inflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            binding.phonename.text = it.get("phoneme").toString()
           binding.imagephone.setImageResource(it.getInt("image"))

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}