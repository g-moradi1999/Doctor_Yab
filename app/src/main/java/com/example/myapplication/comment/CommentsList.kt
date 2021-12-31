package com.example.myapplication.comment

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class CommentsList : AppCompatActivity(), CommentAdapter.RowClickListener {
    private lateinit var mCommentViewModel: CommentViewModel
    var dataList = ArrayList<Comment>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comments_list)
        val name = intent.getStringExtra("docName")
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        mCommentViewModel = ViewModelProvider(this).get(CommentViewModel::class.java)
        mCommentViewModel.getComments().observe(this, { t ->
            if (t != null) {
                for (i in t) {
                    if (i.doctorName == name) {
                        dataList.addAll(listOf(i))
                    }
                }
                recyclerView.layoutManager = LinearLayoutManager(applicationContext)
                val commentAdapter = CommentAdapter(this, this)
                commentAdapter.setData(t)
                recyclerView.adapter = commentAdapter
                Log.d("Tag", t.toString())
            } else {
                Toast.makeText(this, "there is not any comments", Toast.LENGTH_LONG).show()
            }
        })
    }

    override fun onDeleteCommentClickListener(comment: Comment) {
        mCommentViewModel.deleteComment(comment)
    }

    override fun onItemClickListener(comment: Comment) {

    }
}