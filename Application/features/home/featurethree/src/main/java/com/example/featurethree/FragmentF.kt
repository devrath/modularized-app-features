package com.example.featurethree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.base.BaseFragment
import com.example.featurethree.R
import com.example.featurethree.databinding.FragmentFBinding

class FragmentF : BaseFragment<FragmentFBinding>(FragmentFBinding::inflate) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f, container, false)
    }
}
