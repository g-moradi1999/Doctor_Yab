package com.example.myapplication.doctorList

import com.google.gson.annotations.SerializedName

data class Doctors(

    @SerializedName("name")
    val name: String,
    @SerializedName("Specialty")
    val Specialty: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("address")
    val address: String,
    @SerializedName("phonenumber")
    val phonenumber: String,
    @SerializedName("day")
    val day: String,
    @SerializedName("timeS")
    val timeS: String,
    @SerializedName("timeE")
    val timeE: String
)



