package com.example.myapplication.uploadImage

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = [Image::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class ImageDataBase : RoomDatabase() {
    abstract fun imageDao(): ImageDao

    companion object {
        private var INSTANCE: ImageDataBase? = null

        fun getImageDatabase(context: Context): ImageDataBase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    ImageDataBase::class.java,
                    "ImageDatabase"
                )
                    .allowMainThreadQueries().build()

            }
            return INSTANCE as ImageDataBase
        }
    }
}
