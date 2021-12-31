package com.example.myapplication.uploadImage

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ImageDao {
    @Insert
    fun insertImage(image: Image)

    @Query("SELECT * FROM Image_table")
    fun getAllImage(): LiveData<List<Image>>

    @Delete
    fun deleteImage(image: Image)
}
