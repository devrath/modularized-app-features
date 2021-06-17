package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModelProvider
import com.example.login.databinding.ActivityLoginBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import java.lang.Exception

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    companion object {
        const val FEATURE_HOME_SCREEN = "com.example.home.HomeActivity"
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
        binding.button.setOnClickListener {
            try {
                Class.forName(FEATURE_HOME_SCREEN)?.let { feature ->
                    startActivity(Intent(this@LoginActivity, feature))
                }
            }catch (exception : Exception){
                Timber.e("Error in launching feature: $exception")
            }
        }
    }

    private fun setContentForScreen() {
        binding = ActivityLoginBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }



}