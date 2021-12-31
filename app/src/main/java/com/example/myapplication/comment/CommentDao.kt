package com.example.myapplication.comment

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CommentDao {
    @Insert
    fun insertComment(comment: Comment)

    @Query("SELECT * FROM comment_table")
    fun getAllComments(): LiveData<List<Comment>>

    @Delete
    fun deleteComment(comment: Comment)
}

