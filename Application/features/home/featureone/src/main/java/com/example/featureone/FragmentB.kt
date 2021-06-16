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
import com.example.featureone.databinding.FragmentBBinding

class FragmentB : BaseFragment<FragmentBBinding>(FragmentBBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.setOnClickListener {
            val uri = Uri.parse("myApp://fragmentD")
            findNavController().navigate(uri)
        }
    }
}
