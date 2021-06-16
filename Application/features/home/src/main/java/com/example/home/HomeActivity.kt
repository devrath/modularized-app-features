package com.example.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.example.home.databinding.ActivityHomeBinding
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val navController: NavController by lazy { findNavController(R.id.fragment_nav_host) }

    private lateinit var binding: ActivityHomeBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavigation()
    }

    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_nav_host) as NavHostFragment
        binding.btmNavMain.setupWithNavController(navHostFragment.navController)
        changeBottomNavigationFragment()
    }

    private fun changeBottomNavigationFragment() {
        binding.btmNavMain.setOnNavigationItemSelectedListener {
            if (binding.btmNavMain.menu.findItem(it.itemId).isChecked) {
                false
            } else {
                when (it.itemId) {
                    R.id.nav_feature_one -> {
                        navController.navigate(R.id.nav_feature_one)
                        true
                    }
                    R.id.nav_feature_two -> {
                        navController.navigate(R.id.nav_feature_two)
                        true
                    }
                    R.id.nav_feature_three -> {
                        navController.navigate(R.id.nav_feature_three)
                        true
                    }
                    else -> false
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }
}
