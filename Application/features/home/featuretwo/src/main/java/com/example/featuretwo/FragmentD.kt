package com.example.featuretwo

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.base.BaseFragment
import com.example.featuretwo.databinding.FragmentDBinding

class FragmentD : BaseFragment<FragmentDBinding>(FragmentDBinding::inflate) {

    companion object {
        const val SCREEN_NAV = "myApp://fragmentB"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.switchId.setOnClickListener {
            val uri = Uri.parse(SCREEN_NAV)
            findNavController().navigate(uri)
        }
    }
}
