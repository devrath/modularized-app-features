package com.example.code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.code.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import java.lang.Exception

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    companion object {
        const val FEATURE_ON_BOARDING = "com.kienht.dagger.hilt.feature.FeatureActivity"
    }

    private lateinit var binding: ActivitySplashBinding

    private lateinit var viewmodel : SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentForScreen()
        onClickListeners()
    }

    private fun onClickListeners() {
        binding.buttonFeature.setOnClickListener {
            try {
                Class.forName(FEATURE_ON_BOARDING)?.let { feature ->
                    Timber.d("Launch activity$feature")
                }
            }catch (exception : Exception){
                Timber.e("Error in launching feature: $exception")
            }
        }
    }

    private fun setContentForScreen() {
        binding = ActivitySplashBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }


}