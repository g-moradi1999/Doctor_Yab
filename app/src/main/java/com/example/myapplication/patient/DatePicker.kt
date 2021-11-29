package com.example.myapplication.patient

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.text.format.DateFormat
import android.text.format.DateFormat.is24HourFormat
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import devs.mulham.horizontalcalendar.HorizontalCalendar
import devs.mulham.horizontalcalendar.HorizontalCalendarListener
import java.util.*


class DatePicker : AppCompatActivity() {
    companion object {
        lateinit var selectedDateStr: String
        lateinit var hour_min: String
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        setLocale(this, "fa")
        val uname = findViewById<TextView>(R.id.username)
        val special = findViewById<TextView>(R.id.specialty_doctors)
        val city = findViewById<TextView>(R.id.city)
        val address = findViewById<TextView>(R.id.address)
        val day = findViewById<TextView>(R.id.day)
        val timeS = findViewById<TextView>(R.id.timeS)
        val timeE = findViewById<TextView>(R.id.timeE)
        val name = intent.getStringExtra("name")
        val specialty = intent.getStringExtra("specialty")
        val ciity = intent.getStringExtra("city")
        val addres = intent.getStringExtra("address")
        val daay = intent.getStringExtra("day")
        val ts = intent.getStringExtra("timeS")
        val te = intent.getStringExtra("timeE")
        uname.text = name
        special.text = specialty
        city.text = ciity
        address.text = addres
        day.text = daay

        timeS.text = ts
        timeE.text = te
        val endDate = Calendar.getInstance()
        endDate.add(Calendar.MONTH, 12)
        val startDate = Calendar.getInstance()
        startDate.add(Calendar.MONTH, -12)
        val calendar = HorizontalCalendar.Builder(this, R.id.calendarView)
            .startDate(startDate.time)
            .endDate(endDate.time)
            .datesNumberOnScreen(5)
            .dayNameFormat("EEE")
            .dayNumberFormat("dd")
            .monthFormat("MMM")
            .showDayName(true)
            .showMonthName(true)
            .textSizeMonthName(20F)
            .textSizeDayNumber(25F)
            .textSizeDayName(20F)
            .textColor(Color.BLACK, Color.BLACK)
            .selectorColor(Color.BLUE)
            .build()
        calendar.calendarListener = object : HorizontalCalendarListener() {
            override fun onDateSelected(date: Date?, position: Int) {
                selectedDateStr = DateFormat.format("EEE, MMM d, yyyy", date).toString()
                Log.i("onDateSelected", selectedDateStr)
            }
        }
        val time = findViewById<Button>(R.id.time)
        time.setOnClickListener {
            val isSystem24Hour = is24HourFormat(this)
            val clockFormat = if (isSystem24Hour) TimeFormat.CLOCK_24H else TimeFormat.CLOCK_12H
            val picker = MaterialTimePicker.Builder()
                .setTimeFormat(clockFormat)
                .setHour(12)
                .setMinute(0)
                .setTitleText("Set Time")
                .build()
            picker.show(supportFragmentManager, "Tag")
            picker.addOnPositiveButtonClickListener {
                val hour = picker.hour.toString()
                val min = picker.minute.toString()
                hour_min = "$hour:$min"
                Log.d("show hour", "$hour:$min")
            }
        }
        val s = findViewById<Button>(R.id.sabt)
        s.setOnClickListener {
            val intent = Intent(this, Reserve::class.java)
            intent.putExtra("name", name)
            intent.putExtra("specialty", specialty)
            setLocale(this, "en")
            startActivity(intent)
        }
    }

    private fun setLocale(activity: Activity, language: String?) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val resources: Resources = activity.resources
        val config: Configuration = resources.configuration
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)
    }
}
