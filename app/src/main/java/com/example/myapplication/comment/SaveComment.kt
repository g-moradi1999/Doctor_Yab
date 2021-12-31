package com.example.myapplication.comment

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.user.Login
import com.example.myapplication.user.Register

class SaveComment : AppCompatActivity() {
    private lateinit var mViewModel: CommentViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.s_comment)
        mViewModel = ViewModelProvider(this).get(CommentViewModel::class.java)
        val userName = findViewById<TextView>(R.id.uname)
        val docName = findViewById<TextView>(R.id.docName)
        val specialty = findViewById<TextView>(R.id.specialty)
        val comment = findViewById<TextView>(R.id.comment)
        val name = intent.getStringExtra("name")
        val specialtty = intent.getStringExtra("specialty")
        val edit = intent.getStringExtra("comment")
        if (Register.uname == "") {
            userName.text = Login.username
        } else {
            userName.text = Register.uname
        }
        docName.text = name
        specialty.text = specialtty
        comment.text = edit
        val addComment =
            Comment(0, userName.text.toString(), docName.text.toString(), comment.text.toString())
        mViewModel.insertComment(addComment)
    }
}
