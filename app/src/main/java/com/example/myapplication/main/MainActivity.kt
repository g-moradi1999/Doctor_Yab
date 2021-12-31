package com.example.myapplication.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.myapplication.R
import com.example.myapplication.fragments.DoctorFragment
import com.example.myapplication.fragments.HomeFragment
import com.example.myapplication.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val selectedListener =
            BottomNavigationView.OnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.homeFragment -> {
                        val homeFragment = HomeFragment()
                        val fragmentTransaction = supportFragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.frame, homeFragment)
                        fragmentTransaction.commit()
                    }
                    R.id.profileFragment -> {
                        val profileFragment = ProfileFragment()
                        val fragmentTransaction = supportFragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.frame, profileFragment)
                        fragmentTransaction.commit()
                    }
                    R.id.doctorFragment -> {
                        val doctorFragment = DoctorFragment()
                        val fragmentTransaction = supportFragmentManager.beginTransaction()
                        fragmentTransaction.replace(R.id.frame, doctorFragment)
                        fragmentTransaction.commit()
                    }
                }
                true
            }
        bottomNavigationView.setOnNavigationItemSelectedListener(selectedListener)
        val homeFragment = HomeFragment()
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, homeFragment, "")
        fragmentTransaction.commit()
    }
}
