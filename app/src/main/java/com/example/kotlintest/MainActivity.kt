package com.example.kotlintest

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SharedMemory
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import kotlin.math.log
import android.widget.Toast as Toas

class MainActivity : AppCompatActivity() {

    val TAG: String = "Behzad"

    lateinit var userPref: SharedPreferences

    lateinit var edtName: EditText
    lateinit var edtCity: EditText
    lateinit var edtAge: EditText
    lateinit var edtSkill: EditText

    var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edtName = findViewById(R.id.edtName)
        edtCity = findViewById(R.id.edtCity)
        edtAge = findViewById(R.id.edtAge)
        edtSkill = findViewById(R.id.edtSkill)


        val btnGo = findViewById<Button>(R.id.btnGo)

        userPref = getSharedPreferences("userInformation", Context.MODE_PRIVATE)

        loadUserData()

        btnGo.setOnClickListener {
            val goto2activity = Intent(this, TestActivity::class.java)
            saveUserData()
            startActivity(goto2activity)
        }

    }

    private fun saveUserData() {
        val editor = userPref.edit()
        editor.putString("name", edtName.text.toString())
        editor.putString("age", edtAge.text.toString())
        editor.putString("city", edtCity.text.toString())
        editor.putString("skill", edtSkill.text.toString())
        editor.apply()
        Toas. makeText(this,"ذخیره شد",android.widget.Toast.LENGTH_SHORT).show()

    }
    private fun  loadUserData()
    {
        val name=userPref.getString("name","")
        val age=userPref.getString("age","")
        val city=userPref.getString("city","")
        val skill=userPref.getString("skill","")

        edtName.setText(name)
        edtAge.setText(age)
        edtCity.setText(city)
        edtSkill.setText(skill)
    }

}