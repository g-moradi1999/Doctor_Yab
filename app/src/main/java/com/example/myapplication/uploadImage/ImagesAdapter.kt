package com.example.myapplication.uploadImage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ImagesAdapter(
    private val context: Context, private val listener: RowClickListener
) : RecyclerView.Adapter<ImagesAdapter.MyViewHolder>() {
    private var imageList = emptyList<Image>()
    fun setData(image: List<Image>) {
        this.imageList = image
    }
    class MyViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        var image = view.findViewById<ImageView>(R.id.image)
        val docName: TextView = view.findViewById(R.id.doctor)
        val user: TextView = view.findViewById(R.id.user)
        val delete: Button = view.findViewById(R.id.delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.activity_upload_image, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = imageList[position]
        holder.image.setImageBitmap(currentItem.photo)
        holder.docName.text = currentItem.docName
        holder.itemView.setOnClickListener {
            listener.onItemClickListener(currentItem)
        }
        holder.delete.setOnClickListener {
            listener.onDeleteImageClickListener(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    interface RowClickListener {
        fun onDeleteImageClickListener(image: Image)
        fun onItemClickListener(image: Image)
    }
}