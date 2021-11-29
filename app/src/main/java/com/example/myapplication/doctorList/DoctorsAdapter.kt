package com.example.myapplication.doctorList

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.patient.DatePicker
import com.example.myapplication.patient.ReserveList


class DoctorsAdapter(
    private val context: Context,
    private val doctors: List<Doctors>
) : RecyclerView.Adapter<DoctorsAdapter.DoctorsViewHolder>() {

    class DoctorsViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val username: TextView = view.findViewById(R.id.username)
        val specialty: TextView = view.findViewById(R.id.specialty_doctors)
        val city: TextView = view.findViewById(R.id.city)
        val appointment: Button = view.findViewById(R.id.appointment)
        val reserved: Button = view.findViewById(R.id.reserved)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorsViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.doctors, parent, false)
        return DoctorsViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoctorsViewHolder, position: Int) {
        val doctor = doctors[position]
        holder.username.text = doctor.name
        holder.specialty.text = doctor.Specialty
        holder.city.text = doctor.city
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DoctorsInfo::class.java)
            intent.putExtra("name", holder.username.text)
            intent.putExtra("specialty", holder.specialty.text)
            intent.putExtra("city", doctor.city)
            intent.putExtra("address", doctor.address)
            intent.putExtra("phonenumber", doctor.phonenumber)
            intent.putExtra("day", doctor.day)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
        holder.appointment.setOnClickListener {
            val intent = Intent(context, DatePicker::class.java)
            intent.putExtra("name", holder.username.text)
            intent.putExtra("specialty", holder.specialty.text)
            intent.putExtra("city", doctor.city)
            intent.putExtra("address", doctor.address)
            intent.putExtra("day", doctor.day)
            intent.putExtra("timeS", doctor.timeS)
            intent.putExtra("timeE", doctor.timeE)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
        holder.reserved.setOnClickListener {
            val intent = Intent(context, ReserveList::class.java)
            intent.putExtra("docName", holder.username.text)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return doctors.size
    }

}
