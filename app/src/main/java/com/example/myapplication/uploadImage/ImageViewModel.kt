package com.example.myapplication.uploadImage

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class ImageViewModel(application: Application) : AndroidViewModel(application) {
    val allImages: LiveData<List<Image>>
    val repository: ImageRepository = ImageRepository(application)

    init {
        allImages = repository.allImages
    }

    fun getImages(): LiveData<List<Image>> {
        return repository.getImages()
    }

    fun insertImage(image: Image) {
        repository.insertImage(image)
    }

    fun deleteImage(image: Image) {
        repository.deleteImage(image)
    }
}
