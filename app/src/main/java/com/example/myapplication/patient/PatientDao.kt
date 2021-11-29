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

    @Query("SELECT * FROM patient_table WHERE doctorName = :name")
    fun getByDoctorName(name: String): Patient

    @Delete
    fun deleteReservedUser(patient: Patient)
}

