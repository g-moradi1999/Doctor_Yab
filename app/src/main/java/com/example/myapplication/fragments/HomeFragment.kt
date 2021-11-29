package com.example.myapplication.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.city.*
import com.example.myapplication.specialty.*


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val t = inflater.inflate(R.layout.fragment_home, container, false)
        val spinner = t.findViewById<Spinner>(R.id.city)
        spinner.adapter = ArrayAdapter(
            requireActivity(),
            R.layout.support_simple_spinner_dropdown_item,
            resources.getStringArray(R.array.city_list)
        )
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener,
            AdapterView.OnItemClickListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                when (p2) {
                    0 -> {

                    }
                    1 -> {
                        val intent = Intent(requireActivity(), Tehran::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        val intent = Intent(requireActivity(), Mashhad::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        val intent = Intent(requireActivity(), Esfahan::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        val intent = Intent(requireActivity(), Shiraz::class.java)
                        startActivity(intent)
                    }
                    5 -> {
                        val intent = Intent(requireActivity(), Gorgan::class.java)
                        startActivity(intent)
                    }
                    6 -> {
                        val intent = Intent(requireActivity(), Rasht::class.java)
                        startActivity(intent)
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(requireActivity(), "", Toast.LENGTH_LONG).show()
            }

            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

            }

        }

        val pic1: ImageView = t.findViewById(R.id.pic1)
        val pic2: ImageView = t.findViewById(R.id.pic2)
        val pic3: ImageView = t.findViewById(R.id.pic3)
        val pic4: ImageView = t.findViewById(R.id.pic4)
        val pic5: ImageView = t.findViewById(R.id.pic5)
        val pic6: ImageView = t.findViewById(R.id.pic6)

        pic1.setOnClickListener {
            val intent1 = Intent(context, Liver::class.java)
            startActivity(intent1)
        }
        pic2.setOnClickListener {
            val intent1 = Intent(context, Tooth::class.java)
            startActivity(intent1)
        }
        pic3.setOnClickListener {
            val intent1 = Intent(context, Brain::class.java)
            startActivity(intent1)
        }
        pic4.setOnClickListener {
            val intent1 = Intent(context, Lung::class.java)
            startActivity(intent1)
        }
        pic5.setOnClickListener {
            val intent1 = Intent(context, Heart::class.java)
            startActivity(intent1)
        }
        pic6.setOnClickListener {
            val intent1 = Intent(context, Childbirth::class.java)
            startActivity(intent1)
        }

        return t
    }


}

