package com.appdesk.sharemarketalertapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.appdesk.sharemarketalertapp.R
import com.appdesk.sharemarketalertapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //Bottom Navigation Functionality Setup
    override fun onStart() {
        super.onStart()
        val navController = findNavController(R.id.navHostFragmentMain)
        binding.bottomNavView.setupWithNavController(navController)
    }
}