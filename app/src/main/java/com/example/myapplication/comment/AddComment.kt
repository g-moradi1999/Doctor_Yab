package com.example.myapplication.comment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class AddComment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_comment)
        val commentText = findViewById<EditText>(R.id.txt)
        val name = intent.getStringExtra("name")
        val specialty = intent.getStringExtra("specialty")
        val button = findViewById<Button>(R.id.sabt)
        button.setOnClickListener {
            val intent = Intent(this, SaveComment::class.java)
            intent.putExtra("name", name)
            intent.putExtra("specialty", specialty)
            intent.putExtra("comment", commentText.text.toString())
            startActivity(intent)
        }
    }
}