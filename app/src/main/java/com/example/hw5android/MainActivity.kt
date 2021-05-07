package com.example.hw5android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.navView)
        val navHost = findNavController(R.id.navHost)

        val appBarConfig = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.dashboardFragment,
                R.id.notificationsFragment,
                R.id.settingsFragment
            )
        )

        setupActionBarWithNavController(navHost, appBarConfig)
        navView.setupWithNavController(navHost)
    }
}