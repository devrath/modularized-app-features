package com.example.code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModelProvider
import com.example.code.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import java.lang.Exception

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    companion object {
        const val FEATURE_LOGIN = "com.example.login.LoginActivity"
    }

    private lateinit var binding: ActivitySplashBinding

    private lateinit var viewmodel : SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentForScreen()
        setViewModel()
        onClickListeners()
    }

    private fun setViewModel() {
        viewmodel = ViewModelProvider(this@SplashActivity).get(SplashViewModel::class.java)
    }

    private fun onClickListeners() {
        binding.buttonFeature.setOnClickListener {
            try {
                Class.forName(FEATURE_LOGIN)?.let { feature ->
                    startActivity(Intent(this@SplashActivity, feature))
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