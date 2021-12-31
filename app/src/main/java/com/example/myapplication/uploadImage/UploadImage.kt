package com.example.myapplication.uploadImage

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.user.Login
import com.example.myapplication.user.Register

class UploadImage : AppCompatActivity(), ImagesAdapter.RowClickListener {
    private lateinit var mViewModel: ImageViewModel
    lateinit var filePath: Uri
    lateinit var picture: ImageView
    lateinit var doctor: TextView
    lateinit var name: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.u_image)
        name = intent.getStringExtra("name").toString()
        doctor = findViewById(R.id.doctor)
        val user = findViewById<TextView>(R.id.user)
        if (Register.uname == "") {
            user.text = Login.username
        } else {
            user.text = Register.uname
        }
        mViewModel = ViewModelProvider(this).get(ImageViewModel::class.java)
        picture = findViewById(R.id.image)
        val i = Intent()
        i.type = "image/*"
        i.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(i, "choose picture"), 111)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 111 && resultCode == Activity.RESULT_OK && data != null) {
            filePath = data.data!!
            val bitmap = MediaStore.Images.Media.getBitmap(contentResolver, filePath)
            picture.setImageBitmap(bitmap)
            doctor.text = name
            val image = Image(0, bitmap, doctor.text.toString())
            mViewModel.insertImage(image)
        }
    }

    override fun onDeleteImageClickListener(image: Image) {
        mViewModel.deleteImage(image)
    }

    override fun onItemClickListener(image: Image) {
        TODO("Not yet implemented")
    }
}