package com.example.myapplication.patient;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\fH\'J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/myapplication/patient/PatientDao;", "", "checkExist", "", "time", "", "date", "deleteReservedUser", "", "patient", "Lcom/example/myapplication/patient/Patient;", "getAllReservesUsers", "Landroidx/lifecycle/LiveData;", "", "insertPatient", "app_debug"})
public abstract interface PatientDao {
    
    @androidx.room.Insert()
    public abstract void insertPatient(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.patient.Patient patient);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM patient_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.myapplication.patient.Patient>> getAllReservesUsers();
    
    @androidx.room.Delete()
    public abstract void deleteReservedUser(@org.jetbrains.annotations.NotNull()
    com.example.myapplication.patient.Patient patient);
    
    @androidx.room.Query(value = "SELECT EXISTS (SELECT * FROM patient_table WHERE time = :time AND date = :date)")
    public abstract boolean checkExist(@org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String date);
}