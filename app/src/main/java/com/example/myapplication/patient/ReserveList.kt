package com.example.myapplication.patient

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.coroutines.InternalCoroutinesApi

class ReserveList : AppCompatActivity(), PatientAdapter.RowClickListener {
    @InternalCoroutinesApi
    private lateinit var mViewModel: PatientViewModel
    var dataList = ArrayList<Patient>()

    @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.reserve)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        val name = intent.getStringExtra("docName")
        mViewModel = ViewModelProvider(this).get(PatientViewModel::class.java)
        mViewModel.getReserveUsers().observe(this, { t ->
            if (t != null) {
                for (i in t) {
                    if (i.doctorName == name)
                        dataList.addAll(listOf(i))
                }
                recyclerView.layoutManager = LinearLayoutManager(applicationContext)
                val patientAdapter = PatientAdapter(this, this)
                patientAdapter.setData(dataList)
                recyclerView.adapter = patientAdapter
                Log.d("Tag", t.toString())

            } else {
                Toast.makeText(this, "No Appointments have been Reserved", Toast.LENGTH_LONG).show()
            }
        })
    }

    @InternalCoroutinesApi
    override fun onDeleteUserClickListener(patient: Patient) {
        mViewModel.deleteReserved(patient)
    }

    override fun onItemClickListener(patient: Patient) {

    }
}