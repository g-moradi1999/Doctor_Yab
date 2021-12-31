package com.example.myapplication.comment

import android.app.Application
import androidx.lifecycle.LiveData

class CommentRepository(application: Application) {
    val commentDao: CommentDao
    val allComments: LiveData<List<Comment>>
    val commentDatabase: CommentDataBase = CommentDataBase.getReserveDatabase(application)

    init {
        commentDao = commentDatabase.commentDao()
        allComments = commentDao.getAllComments()
    }

    fun getComments(): LiveData<List<Comment>> {
        return commentDao.getAllComments()
    }

    fun insertComment(comment: Comment) {
        commentDatabase.commentDao().insertComment(comment)
    }

    fun deleteComment(comment: Comment) {
        commentDao.deleteComment(comment)
    }
}

