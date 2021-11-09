package com.example.hw_product_recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_product_recycleview.Adapter.ItemAdapter
import com.example.hw_product_recycleview.databinding.FragmentPhonelistBinding

class PhoneListFragment : Fragment() {
        private var _binding : FragmentPhonelistBinding? = null

        private val binding get() = _binding


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

        }


        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            _binding = FragmentPhonelistBinding.inflate(inflater, container, false)
            return _binding?.root
        }


        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

            binding?.recycleview?.adapter= ItemAdapter(this.context)
            binding!!.recycleview.setHasFixedSize(true)


        }
        override fun onDestroyView() {
            super.onDestroyView()
            _binding = null
        }

    }