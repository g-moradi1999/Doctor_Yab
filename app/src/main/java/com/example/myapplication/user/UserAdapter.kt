package com.example.myapplication.user

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.coroutines.InternalCoroutinesApi

class UserAdapter(private val listener: RowClickListener, private val context: Context) :
    RecyclerView.Adapter<UserAdapter.MyViewHolder>() {

    private var userList = emptyList<User>()
    fun setData(user: List<User>) {
        this.userList = user
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.username)
        val lastname: TextView = view.findViewById(R.id.lastName)
        val age: TextView = view.findViewById(R.id.age)
        val phone: TextView = view.findViewById(R.id.phone)
        val code: TextView = view.findViewById(R.id.code)
        val delete: Button = view.findViewById(R.id.delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.users, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = userList[position]
        holder.name.text = currentItem.name
        holder.lastname.text = currentItem.lastName
        holder.age.text = currentItem.age
        holder.phone.text = currentItem.phoneNumber
        holder.code.text = currentItem.code
        holder.itemView.setOnClickListener {
            listener.onItemClickListener(currentItem)
        }
        holder.delete.setOnClickListener {
            listener.onDeleteUserClickListener(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    interface RowClickListener {
        fun onDeleteUserClickListener(user: User)
        fun onItemClickListener(user: User)
    }
}