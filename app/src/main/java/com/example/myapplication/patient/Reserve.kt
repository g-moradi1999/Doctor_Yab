package com.example.myapplication.patient

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.user.Login
import kotlinx.coroutines.InternalCoroutinesApi

class Reserve : AppCompatActivity(), PatientAdapter.RowClickListener {
    @InternalCoroutinesApi
    private lateinit var mViewModel: PatientViewModel

    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reserve_list)

        mViewModel = ViewModelProvider(this).get(PatientViewModel::class.java)
        val uDoctorName = findViewById<TextView>(R.id.doctorName)
        val special = findViewById<TextView>(R.id.specialty_doctors)
        val date = findViewById<TextView>(R.id.date)
        val t = findViewById<TextView>(R.id.timee)
        val userName = findViewById<TextView>(R.id.uname)
        val uLastName = findViewById<TextView>(R.id.uLastname)
        val name = intent.getStringExtra("name")
        val specialty = intent.getStringExtra("specialty")
        uDoctorName.text = name
        special.text = specialty
        userName.text = Login.username
        uLastName.text = Login.lastname
        date.text = DatePicker.selectedDateStr
        t.text = DatePicker.hour_min
        val patient = Patient(
            0,
            userName.text.toString(),
            uLastName.text.toString(),
            uDoctorName.text.toString(),
            special.text.toString(),
            date.text.toString(),
            t.text.toString()
        )
        mViewModel.insertPatient(patient)
        Log.d("patient", userName.text.toString())
    }

    @InternalCoroutinesApi
    override fun onDeleteUserClickListener(patient: Patient) {
        mViewModel.deleteReserved(patient)

    }

    override fun onItemClickListener(patient: Patient) {

    }
}