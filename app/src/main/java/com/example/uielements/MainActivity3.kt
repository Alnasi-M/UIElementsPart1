package com.example.uielements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val act3_name = intent.getStringExtra("name")
        findViewById<TextView>(R.id.act3_name).text = act3_name

        val act3_email = intent.getStringExtra("email")
        findViewById<TextView>(R.id.act3_email).text = act3_email

        val act3_age = intent.getIntExtra("age", 69)
        findViewById<TextView>(R.id.act3_age).text = act3_age.toString()

        val act3dob = intent.getStringExtra("calender")
        findViewById<TextView>(R.id.act3_DOB).text = act3dob

        val act3phone = intent.getStringExtra("phone")
        findViewById<TextView>(R.id.act3_phone).text = act3phone
    }
}