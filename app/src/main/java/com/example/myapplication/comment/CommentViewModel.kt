package com.example.myapplication.comment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class CommentViewModel(application: Application) : AndroidViewModel(application) {
    val allComments: LiveData<List<Comment>>
    val repository: CommentRepository = CommentRepository(application)

    init {
        allComments = repository.getComments()
    }

    fun getComments(): LiveData<List<Comment>> {
        return repository.getComments()
    }

    fun insertComment(comment: Comment) {
        repository.insertComment(comment)
    }

    fun deleteComment(comment: Comment) {
        repository.deleteComment(comment)
    }
}

