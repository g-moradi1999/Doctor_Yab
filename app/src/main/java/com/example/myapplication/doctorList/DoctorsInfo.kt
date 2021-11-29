package com.example.myapplication.doctorList

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class DoctorsInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.doctors_info)

        val uname = findViewById<TextView>(R.id.username)
        val special = findViewById<TextView>(R.id.specialty_doctors)
        val city = findViewById<TextView>(R.id.city)
        val address = findViewById<TextView>(R.id.address)
        val phone = findViewById<TextView>(R.id.phonenumber)
        val day = findViewById<TextView>(R.id.day)

        val name = intent.getStringExtra("name")
        val specialty = intent.getStringExtra("specialty")
        val ciity = intent.getStringExtra("city")
        val addres = intent.getStringExtra("address")
        val phonee = intent.getStringExtra("phonenumber")
        val daay = intent.getStringExtra("day")

        uname.text = name
        special.text = specialty
        city.text = ciity
        address.text = addres
        phone.text = phonee
        day.text = daay
    }
}