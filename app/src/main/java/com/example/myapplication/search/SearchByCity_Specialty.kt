package com.example.myapplication.search

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.doctorList.Doctors
import com.example.myapplication.doctorList.DoctorsAdapter
import com.example.myapplication.doctorList.DoctorsApi
import com.example.myapplication.fragments.HomeFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchByCity_Specialty : AppCompatActivity() {

    var dataList = ArrayList<Doctors>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_doctor)
        val recycle = findViewById<RecyclerView>(R.id.recyclerview)
        DoctorsApi().getList().enqueue(object : Callback<List<Doctors>> {
            override fun onResponse(call: Call<List<Doctors>>, response: Response<List<Doctors>>) {
                response.body()?.let {
                    for (i in it) {
                        if (i.city == HomeFragment.c && i.Specialty == HomeFragment.s)
                            dataList.addAll(listOf(i))
                    }
                }
                recycle.layoutManager = LinearLayoutManager(applicationContext)
                val doctorsAdapter = DoctorsAdapter(applicationContext, dataList)
                recycle.adapter = doctorsAdapter
            }

            override fun onFailure(call: Call<List<Doctors>>, t: Throwable) {
                Toast.makeText(this@SearchByCity_Specialty, "fail", Toast.LENGTH_LONG).show()
                Log.v("Error!", "WE HAVE ERROR!", t)
            }
        })

    }
}