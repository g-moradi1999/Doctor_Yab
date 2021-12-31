package com.example.myapplication.uploadImage

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Image_table")
class Image(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "photo")
    val photo: Bitmap,
    @ColumnInfo(name = "doctor")
    val docName: String
)
