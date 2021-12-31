package com.example.myapplication.fragments

import android.content.res.Configuration
import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.myapplication.R
import com.example.myapplication.user.Login
import com.example.myapplication.user.Register
import java.util.*


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val t = inflater.inflate(R.layout.fragment_profile, container, false)
        setLocale(requireActivity(), "en")
        val userN = t.findViewById<TextView>(R.id.userN)
        val userL = t.findViewById<TextView>(R.id.userL)
        val codeU = t.findViewById<TextView>(R.id.codeU)
        val phoneU = t.findViewById<TextView>(R.id.phoneU)
        val ageU = t.findViewById<TextView>(R.id.ageU)
        val userNa = t.findViewById<TextView>(R.id.userNa)
        if (Register.uname == "") {
            userN.text = Login.username
            userNa.text = Login.username
        } else {
            userN.text = Register.uname
            userNa.text = Register.uname
        }
        if (Register.uLastName == "") {
            userL.text = Login.lastname
        } else {
            userL.text = Register.uLastName
        }
        if (Register.uAge == "") {
            ageU.text = Login.age
        } else {
            ageU.text = Register.uAge
        }
        if (Register.uPhone == "") {
            phoneU.text = Login.phoneNumber
        } else {
            phoneU.text = Register.uPhone
        }
        if (Register.uCode == "") {
            codeU.text = Login.code
        } else {
            codeU.text = Register.uCode
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
