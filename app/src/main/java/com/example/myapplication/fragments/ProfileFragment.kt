package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.user.Login

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val t = inflater.inflate(R.layout.fragment_profile, container, false)
        val userN = t.findViewById<TextView>(R.id.userN)
        val userL = t.findViewById<TextView>(R.id.userL)
        val codeU = t.findViewById<TextView>(R.id.codeU)
        val phoneU = t.findViewById<TextView>(R.id.phoneU)
        val ageU = t.findViewById<TextView>(R.id.ageU)
        val userNa = t.findViewById<TextView>(R.id.userNa)

        userN.text = Login.username
        userL.text = Login.lastname
        codeU.text = Login.code
        phoneU.text = Login.phoneNumber
        ageU.text = Login.age
        userNa.text = Login.username

        return t
    }

}

