package com.example.myapplication.patient

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PatientDao {
    @Insert
    fun insertPatient(patient: Patient)

    @Query("SELECT * FROM patient_table")
    fun getAllReservesUsers(): LiveData<List<Patient>>

    @Delete
    fun deleteReservedUser(patient: Patient)

    @Query("SELECT EXISTS (SELECT * FROM patient_table WHERE time = :time AND date = :date)")
    fun checkExist(time: String, date: String): Boolean
}

