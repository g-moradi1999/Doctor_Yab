package com.example.myapplication.comment

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Comment::class], version = 1, exportSchema = false)

abstract class CommentDataBase : RoomDatabase() {
    abstract fun commentDao(): CommentDao

    companion object {
        private var INSTANCE: CommentDataBase? = null

        fun getReserveDatabase(context: Context): CommentDataBase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    CommentDataBase::class.java,
                    "commentDatabase"
                )
                    .allowMainThreadQueries().build()

            }
            return INSTANCE as CommentDataBase
        }
    }
}

