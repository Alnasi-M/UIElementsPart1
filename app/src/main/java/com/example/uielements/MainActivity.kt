package com.example.uielements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.act_button1).setOnClickListener { foo() }
        val seek = findViewById<SeekBar>(R.id.act_seekBar1)
        seek?.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {
                val ageDisplay: TextView = findViewById(R.id.act_age1)
                ageDisplay.text = "Age: ${seek.progress}"
            }
            override fun onStartTrackingTouch(seek: SeekBar) {
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })
        
        val switch = findViewById<Switch>(R.id.act_switch1)
        val phone = findViewById<EditText>(R.id.act_phone1)
        phone.visibility = View.INVISIBLE
        switch.setOnCheckedChangeListener{switch, isChecked ->
            if (isChecked){
                phone.visibility = View.VISIBLE
            }else{
                phone.visibility = View.INVISIBLE
            }
        }
    }
    private fun foo(){
        val intent = Intent(this, MainActivity2::class.java)
        val name:String = findViewById<EditText>(R.id.act_name1).text.toString()
        val email:String = findViewById<EditText>(R.id.act_email1).text.toString()
        val phone:String = findViewById<EditText>(R.id.act_phone1).text.toString()
        val seekValue:Int = findViewById<SeekBar>(R.id.act_seekBar1).progress
        intent.putExtra("name", name)
        intent.putExtra("email", email)
        intent.putExtra("phone", phone)
        intent.putExtra("seekbar", seekValue)
        startActivity(intent)
    }
}