package com.example.code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.code.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    private lateinit var viewmodel : SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentForScreen()
        onClickListeners()
    }

    private fun onClickListeners() {
        binding.buttonFeature.setOnClickListener {
            val clazz = Class.forName("com.kienht.dagger.hilt.feature.FeatureActivity")
            // startActivity(Intent(this, clazz))
        }
    }

    private fun setContentForScreen() {
        binding = ActivitySplashBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }


}