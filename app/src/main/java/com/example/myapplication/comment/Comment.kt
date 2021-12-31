package com.example.myapplication.comment

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "comment_table")
class Comment(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "userName")
    val userName: String,
    @ColumnInfo(name = "lastName")
    val doctorName: String,
    @ColumnInfo(name = "comment")
    val comment: String
)

