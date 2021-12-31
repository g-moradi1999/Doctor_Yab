package com.example.myapplication.user

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.coroutines.InternalCoroutinesApi

class UserList : AppCompatActivity(), UserAdapter.RowClickListener {

    private lateinit var mUserViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_list)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
        mUserViewModel.getUsers().observe(this,
            { t ->
                if (t != null) {
                    recyclerView.layoutManager = LinearLayoutManager(applicationContext)
                    val userAdapter = UserAdapter(this, this)
                    userAdapter.setData(t)
                    recyclerView.adapter = userAdapter
                    Log.d("Tag", t.toString())
                }
            })
    }

    override fun onDeleteUserClickListener(user: User) {
        mUserViewModel.deleteUsers(user)
    }

    override fun onItemClickListener(user: User) {

    }
}
