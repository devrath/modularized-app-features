package com.example.intro.welcome

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.intro.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class WelcomeActivity : AppCompatActivity() {

    companion object {
        const val FEATURE_LOGIN = "com.example.login.LoginActivity"
        const val ERROR_IN_FEATURE_LAUNCH = "Error in launching feature "
    }

    private lateinit var binding: ActivitySplashBinding

    private lateinit var viewmodel : WelcomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentForScreen()
        setViewModel()
        onClickListeners()
    }

    private fun setViewModel() {
        viewmodel = ViewModelProvider(this@WelcomeActivity).get(WelcomeViewModel::class.java)
    }

    private fun onClickListeners() {
        binding.buttonFeature.setOnClickListener {
            try {
                Class.forName(FEATURE_LOGIN)?.let { feature ->
                    startActivity(Intent(this@WelcomeActivity, feature))
                }
            }catch (exception: Exception){
                Timber.e(ERROR_IN_FEATURE_LAUNCH.plus(exception))
            }
        }
    }

    private fun setContentForScreen() {
        binding = ActivitySplashBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }


}