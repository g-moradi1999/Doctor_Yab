package com.example.myapplication.patient

import android.app.Application
import androidx.lifecycle.LiveData

class PatientRepository(application: Application) {
    val patientDao: PatientDao
    val allReserveUsers: LiveData<List<Patient>>
    val patientDatabase: PatientDatabase = PatientDatabase.getReserveDatabase(application)

    init {
        patientDao = patientDatabase.patientDao()
        allReserveUsers = patientDao.getAllReservesUsers()
    }

    fun getReserveUsers(): LiveData<List<Patient>> {
        return patientDao.getAllReservesUsers()
    }

    fun insertPatient(patient: Patient) {
        patientDatabase.patientDao().insertPatient(patient)
    }

    fun deleteReserves(patient: Patient) {
        patientDao.deleteReservedUser(patient)
    }

    fun checkReserve(time: String, date: String): Boolean {
        return patientDao.checkExist(time,date)
    }
}


