package com.example.myapplication.user

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.main.MainActivity
import kotlinx.coroutines.InternalCoroutinesApi

class Register : AppCompatActivity() {
    @InternalCoroutinesApi
    private lateinit var mUserViewModel: UserViewModel

    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        val register = findViewById<Button>(R.id.save)
        register.setOnClickListener {
            val name = findViewById<EditText>(R.id.name)
            val lastName = findViewById<EditText>(R.id.lastName)
            val age = findViewById<EditText>(R.id.age)
            val code = findViewById<EditText>(R.id.code)
            val phone = findViewById<EditText>(R.id.phone)
            val uname = name.text.toString()
            val uLastName = lastName.text.toString()
            val uAge = age.text.toString()
            val uCode = code.text.toString()
            val uPhone = phone.text.toString()
            val user = User(0, uname, uLastName, uCode, uPhone, uAge)
            if (validInput(user)) {
                runOnUiThread {
                    mUserViewModel.insertUsers(user)
                    Toast.makeText(this, "successfully", Toast.LENGTH_LONG).show()
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }

            } else {
                Toast.makeText(this, "All fields must be filled", Toast.LENGTH_LONG)
                    .show()
            }
            name.text.clear()
            lastName.text.clear()
            age.text.clear()
            phone.text.clear()
            code.text.clear()
        }

      /*  val show = findViewById<Button>(R.id.show)
        show.setOnClickListener {
            val intent = Intent(this, UserList::class.java)
            startActivity(intent)
        }*/
        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

    }

    private fun validInput(user: User): Boolean {
        if (user.name.isEmpty() || user.lastName.isEmpty() || user.age.isEmpty() || user.code.isEmpty() || user.phoneNumber.isEmpty()) {
            return false
        }
        return true
    }

}
