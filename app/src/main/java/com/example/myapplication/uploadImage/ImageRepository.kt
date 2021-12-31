package com.example.myapplication.uploadImage

import android.app.Application
import androidx.lifecycle.LiveData

class ImageRepository(application: Application) {
    val imageDao: ImageDao
    val allImages: LiveData<List<Image>>
    val imageDataBase: ImageDataBase = ImageDataBase.getImageDatabase(application)

    init {
        imageDao = imageDataBase.imageDao()
        allImages = imageDao.getAllImage()
    }

    fun getImages(): LiveData<List<Image>> {
        return imageDao.getAllImage()
    }

    fun insertImage(image: Image) {
        imageDataBase.imageDao().insertImage(image)
    }

    fun deleteImage(image: Image) {
        imageDao.deleteImage(image)
    }
}
