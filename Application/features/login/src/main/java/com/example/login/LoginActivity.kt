package com.example.login

import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.base.BaseActivity
import com.example.login.databinding.ActivityLoginBinding
import timber.log.Timber
import java.lang.Exception

class LoginActivity : BaseActivity() {

    companion object {
        const val FEATURE_ON_BOARDING = "com.kienht.dagger.hilt.feature.FeatureActivity"
    }

    private lateinit var binding: ActivityLoginBinding

    private lateinit var viewmodel : LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentForScreen()
        setViewModel()
        onClickListeners()
    }

    private fun setViewModel() {
        viewmodel = ViewModelProvider(this@LoginActivity).get(LoginViewModel::class.java)
    }

    private fun onClickListeners() {
       /* binding.buttonFeature.setOnClickListener {
            try {
                *//*Class.forName(FEATURE_ON_BOARDING)?.let { feature ->
                    Timber.d("Launch activity$feature")
                }*//*
            }catch (exception : Exception){
                Timber.e("Error in launching feature: $exception")
            }
        }*/
    }

    private fun setContentForScreen() {
        binding = ActivityLoginBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }



}