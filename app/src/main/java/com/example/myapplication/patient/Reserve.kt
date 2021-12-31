package com.example.myapplication.patient

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.user.Login
import com.example.myapplication.user.Register

class Reserve : AppCompatActivity(), PatientAdapter.RowClickListener {
    private lateinit var mViewModel: PatientViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.r_list)
        mViewModel = ViewModelProvider(this).get(PatientViewModel::class.java)
        val uDoctorName = findViewById<TextView>(R.id.doctorName)
        val special = findViewById<TextView>(R.id.specialty_doctors)
        val date = findViewById<TextView>(R.id.date)
        val time = findViewById<TextView>(R.id.timee)
        val userName = findViewById<TextView>(R.id.uname)
        val uLastName = findViewById<TextView>(R.id.uLastname)
        val name = intent.getStringExtra("name")
        val specialty = intent.getStringExtra("specialty")
        val p = mViewModel.checkReserve(DatePicker.hour_min, DatePicker.selectedDateStr)
        if (p) {
            Toast.makeText(this, "this time & date has been reserved", Toast.LENGTH_LONG).show()
            finish()
        } else {
            uDoctorName.text = name
            special.text = specialty
            if (Register.uname == "") {
                userName.text = Login.username
            } else {
                userName.text = Register.uname
            }
            if (Register.uLastName == "") {
                uLastName.text = Login.lastname
            } else {
                uLastName.text = Register.uLastName
            }
            date.text = DatePicker.selectedDateStr
            time.text = DatePicker.hour_min
            val patient = Patient(
                0,
                userName.text.toString(),
                uLastName.text.toString(),
                uDoctorName.text.toString(),
                special.text.toString(),
                date.text.toString(),
                time.text.toString()
            )
            mViewModel.insertPatient(patient)
            Log.d("patient", userName.text.toString())
        }
    }

    override fun onDeleteUserClickListener(patient: Patient) {
        mViewModel.deleteReserved(patient)

    }

    override fun onItemClickListener(patient: Patient) {
    }
}