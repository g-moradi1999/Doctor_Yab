package com.example.myapplication.user

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.main.MainActivity
import com.example.myapplication.R
import kotlinx.coroutines.InternalCoroutinesApi

class Login : AppCompatActivity() {
    companion object {
        lateinit var username: String
        lateinit var lastname: String
        lateinit var code: String
        lateinit var phoneNumber: String
        lateinit var age: String
    }

    @InternalCoroutinesApi
    private lateinit var mUserViewModel: UserViewModel

    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val login = findViewById<Button>(R.id.save)
        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        login.setOnClickListener {
            val coode = findViewById<EditText>(R.id.code)
            val name = findViewById<EditText>(R.id.namee)
            val ucode = coode.text.toString()
            val uname = name.text.toString()
            this.runOnUiThread {
                val user: User = mUserViewModel.loginUsers(uname, ucode)
                if (uname != null && ucode != null) {
                    username = user.name
                    lastname = user.lastName
                    code = user.code
                    phoneNumber = user.phoneNumber
                    age = user.age
                    Log.d("Login", "$username + $lastname")
                } else {
                    Toast.makeText(this, "All fields must be filled", Toast.LENGTH_LONG)
                        .show()
                }
                /*   val profile = ProfileFragment()
                   this.supportFragmentManager.beginTransaction().add(R.id.frame, profile)
                       .commit()
                   login.visibility = View.GONE*/
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
