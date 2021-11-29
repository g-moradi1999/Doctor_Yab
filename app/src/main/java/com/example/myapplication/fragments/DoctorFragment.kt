package com.example.myapplication.fragments

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.SearchView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.doctorList.Doctors
import com.example.myapplication.doctorList.DoctorsAdapter
import com.example.myapplication.doctorList.DoctorsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList


class DoctorFragment : Fragment() {

    private lateinit var recycle: RecyclerView
    var dataList = ArrayList<Doctors>()
    val list = ArrayList<Doctors>()

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        val t = inflater.inflate(R.layout.fragment_doctor, container, false)
        recycle = t.findViewById(R.id.recyclerview)
        recycle.adapter = DoctorsAdapter(requireActivity(), dataList)
        recycle.layoutManager =
            LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)

        DoctorsApi().getList().enqueue(object : Callback<List<Doctors>> {
            override fun onResponse(
                call: Call<List<Doctors>>,
                response: Response<List<Doctors>>
            ) {
                response.body()?.let {
                    dataList.addAll(it)
                }
            }

            override fun onFailure(call: Call<List<Doctors>>, t: Throwable) {
                Toast.makeText(requireActivity(), "fail", Toast.LENGTH_LONG).show()
                Log.v("Error!", "WE HAVE ERROR!", t)
            }
        })
        setHasOptionsMenu(true)
        return t
    }

    override fun onCreateOptionsMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.menu, menu)
        val item = menu.findItem(R.id.appSearchBar)
        item.expandActionView()
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                val searchText = p0!!.lowercase(Locale.getDefault())
                list.clear()
                if (searchText.isNotEmpty()) {
                    dataList.forEach {
                        if (it.name.lowercase(Locale.getDefault()).contains(searchText)) {
                            list.add(it)
                        }
                    }
                    recycle.adapter = DoctorsAdapter(requireActivity(), list)
                } else {
                    list.clear()
                    list.addAll(dataList)
                    recycle.adapter = DoctorsAdapter(requireActivity(), list)
                }
                return false
            }

        })
        return super.onCreateOptionsMenu(menu, menuInflater)
    }
}

