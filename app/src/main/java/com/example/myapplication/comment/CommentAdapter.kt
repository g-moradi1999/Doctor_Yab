package com.example.myapplication.comment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class CommentAdapter(
    private val context: Context,
    private val listener: RowClickListener
) :
    RecyclerView.Adapter<CommentAdapter.MyViewHolder>() {
    private var commentList = emptyList<Comment>()
    fun setData(comment: List<Comment>) {
        this.commentList = comment
    }
    class MyViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.uname)
        val docName: TextView = view.findViewById(R.id.docName)
        val comment: TextView = view.findViewById(R.id.comment)
        val delete: Button = view.findViewById(R.id.delete)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.save_comment, parent, false)
        return MyViewHolder(view)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = commentList[position]
        holder.name.text = currentItem.userName
        holder.docName.text = currentItem.doctorName
        holder.comment.text = currentItem.comment
        holder.itemView.setOnClickListener {
            listener.onItemClickListener(currentItem)
        }
        holder.delete.setOnClickListener {
            listener.onDeleteCommentClickListener(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return commentList.size
    }

    interface RowClickListener {
        fun onDeleteCommentClickListener(comment: Comment)
        fun onItemClickListener(comment: Comment)
    }
}