package com.example.myapplication.uploadImage

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ImageList : AppCompatActivity(), ImagesAdapter.RowClickListener {
    private lateinit var mViewModel: ImageViewModel
    var dataList = ArrayList<Image>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_image)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val name = intent.getStringExtra("name")
        mViewModel = ViewModelProvider(this).get(ImageViewModel::class.java)
        mViewModel.getImages().observe(this, { t ->
            if (t != null) {
                for (i in t) {
                    if (i.docName == name)
                        dataList.addAll(listOf(i))
                }
                recyclerView.layoutManager = LinearLayoutManager(applicationContext)
                val imageAdapter = ImagesAdapter(this, this)
                imageAdapter.setData(dataList)
                recyclerView.adapter = imageAdapter

            } else {
                Toast.makeText(this, "No images have been show", Toast.LENGTH_LONG).show()
            }
        })
    }


    override fun onDeleteImageClickListener(image: Image) {
        mViewModel.deleteImage(image)
    }

    override fun onItemClickListener(image: Image) {

    }
}