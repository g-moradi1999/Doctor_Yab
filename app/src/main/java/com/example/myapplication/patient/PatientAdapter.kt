package com.example.myapplication.patient

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class PatientAdapter(private val listener: RowClickListener, private val context: Context) :
    RecyclerView.Adapter<PatientAdapter.MyViewHolder>() {

    private var reserveList = emptyList<Patient>()
    fun setData(reserve: List<Patient>) {
        this.reserveList = reserve
    }

    class MyViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val doctorName: TextView = view.findViewById(R.id.doctorName)
        val specialty: TextView = view.findViewById(R.id.specialty_doctors)
        val date: TextView = view.findViewById(R.id.date)
        val time: TextView = view.findViewById(R.id.timee)
        val name: TextView = view.findViewById(R.id.uname)
        val lastName: TextView = view.findViewById(R.id.uLastname)
        val delete: Button = view.findViewById(R.id.delete)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.activity_reserve_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = reserveList[position]
        holder.doctorName.text = currentItem.doctorName
        holder.specialty.text = currentItem.specialty
        holder.date.text = currentItem.date
        holder.time.text = currentItem.time
        holder.name.text = currentItem.userName
        holder.lastName.text = currentItem.lastName
        holder.itemView.setOnClickListener {
            listener.onItemClickListener(currentItem)
        }
        holder.delete.setOnClickListener {
            listener.onDeleteUserClickListener(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return reserveList.size
    }

    interface RowClickListener {
        fun onDeleteUserClickListener(patient: Patient)
        fun onItemClickListener(patient: Patient)
    }
}