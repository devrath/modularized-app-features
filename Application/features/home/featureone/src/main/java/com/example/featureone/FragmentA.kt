package com.example.featureone

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.base.BaseFragment
import com.example.featureone.R
import com.example.featureone.databinding.FragmentABinding
import com.example.featureone.databinding.FragmentABinding.inflate

class FragmentA : BaseFragment<FragmentABinding>(FragmentABinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.switchId.setOnClickListener {
            val uri = Uri.parse("myApp://fragmentD")
            findNavController().navigate(uri)
        }
    }
}
