package com.example.myapplication.fragments

import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.myapplication.R
import com.example.myapplication.search.SearchByCity_Specialty
import com.example.myapplication.specialty.*
import java.util.*


class HomeFragment : Fragment() {
    companion object {
        lateinit var c: String
        lateinit var s: String
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val t = inflater.inflate(R.layout.fragment_home, container, false)
        setLocale(requireActivity(), "en")
        val search = t.findViewById<Button>(R.id.search)
        val spinner1 = t.findViewById<Spinner>(R.id.city)
        spinner1.adapter = ArrayAdapter(
            requireActivity(),
            R.layout.support_simple_spinner_dropdown_item,
            resources.getStringArray(R.array.city_list)
        )
        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener,
            AdapterView.OnItemClickListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    0 -> {

                    }
                    1 -> {
                        c = parent?.getItemAtPosition(position) as String
                    }
                    2 -> {
                        c = parent?.getItemAtPosition(position) as String
                    }
                    3 -> {
                        c = parent?.getItemAtPosition(position) as String
                    }
                    4 -> {
                        c = parent?.getItemAtPosition(position) as String
                    }
                    5 -> {
                        c = parent?.getItemAtPosition(position) as String
                    }
                    6 -> {
                        c = parent?.getItemAtPosition(position) as String
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                TODO("Not yet implemented")
            }

        }
        val spinner2 = t.findViewById<Spinner>(R.id.specialty)
        spinner2.adapter = ArrayAdapter(
            requireActivity(),
            R.layout.support_simple_spinner_dropdown_item,
            resources.getStringArray(R.array.specialty_list)
        )

        spinner2.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    when (position) {
                        0 -> {

                        }
                        1 -> {
                            s = parent?.getItemAtPosition(position) as String
                        }
                        2 -> {
                            s = parent?.getItemAtPosition(position) as String
                        }
                        3 -> {
                            s = parent?.getItemAtPosition(position) as String
                        }
                        4 -> {
                            s = parent?.getItemAtPosition(position) as String
                        }
                        5 -> {
                            s = parent?.getItemAtPosition(position) as String
                        }
                        6 -> {
                            s = parent?.getItemAtPosition(position) as String
                        }
                        7 -> {
                            s = parent?.getItemAtPosition(position) as String
                        }
                        8 -> {
                            s = parent?.getItemAtPosition(position) as String
                        }
                        9 -> {
                            s = parent?.getItemAtPosition(position) as String
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

                override fun onItemClick(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    TODO("Not yet implemented")
                }

            }

        search.setOnClickListener {
            val intent = Intent(requireActivity(), SearchByCity_Specialty::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent)
        }

        val pic1: ImageView = t.findViewById(R.id.pic1)
        val pic2: ImageView = t.findViewById(R.id.pic2)
        val pic3: ImageView = t.findViewById(R.id.pic3)
        val pic4: ImageView = t.findViewById(R.id.pic4)
        val pic5: ImageView = t.findViewById(R.id.pic5)
        val pic6: ImageView = t.findViewById(R.id.pic6)
        val pic7: ImageView = t.findViewById(R.id.pic7)
        val pic8: ImageView = t.findViewById(R.id.pic8)
        val pic9: ImageView = t.findViewById(R.id.pic9)

        pic1.setOnClickListener {
            val intent1 = Intent(context, Liver::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent1)
        }
        pic2.setOnClickListener {
            val intent1 = Intent(context, Tooth::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent1)
        }
        pic3.setOnClickListener {
            val intent1 = Intent(context, Brain::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent1)
        }
        pic4.setOnClickListener {
            val intent1 = Intent(context, Lung::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent1)
        }
        pic5.setOnClickListener {
            val intent1 = Intent(context, Heart::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent1)
        }
        pic6.setOnClickListener {
            val intent1 = Intent(context, Childbirth::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent1)
        }
        pic7.setOnClickListener {
            val intent1 = Intent(context, Skin::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent1)
        }
        pic8.setOnClickListener {
            val intent1 = Intent(context, Nose::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent1)
        }
        pic9.setOnClickListener {
            val intent1 = Intent(context, Eye::class.java)
            setLocale(requireActivity(), "en")
            startActivity(intent1)
        }
        return t
    }

    private fun setLocale(activity: FragmentActivity, language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val resources: Resources = activity.resources
        val config: Configuration = resources.configuration
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
    }
}