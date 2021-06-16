package com.example.featuretwo

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.base.BaseFragment
import com.example.featuretwo.databinding.FragmentDBinding

class FragmentD : BaseFragment<FragmentDBinding>(FragmentDBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.setOnClickListener {
            val uri = Uri.parse("myApp://fragmentB")
            //findNavController().navigate(uri)
        }
    }
}
