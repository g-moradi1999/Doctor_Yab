package com.example.myapplication.patient

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.InternalCoroutinesApi

@Database(entities = [Patient::class], version = 1, exportSchema = false)

abstract class PatientDatabase : RoomDatabase() {
    abstract fun patientDao(): PatientDao

    companion object {
        private var INSTANCE: PatientDatabase? = null

        @InternalCoroutinesApi
        fun getReserveDatabase(context: Context): PatientDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    PatientDatabase::class.java,
                    "patientDatabase"
                )
                    .allowMainThreadQueries().build()

            }
            return INSTANCE as PatientDatabase
        }
    }
}
