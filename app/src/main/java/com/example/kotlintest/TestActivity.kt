package com.example.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val txtName = findViewById<TextView>(R.id.txtName)
        val txtAge = findViewById<TextView>(R.id.txtAge)
        val txtCity = findViewById<TextView>(R.id.txtCity)
        val txtSkill = findViewById<TextView>(R.id.txtSkill)

        var name = intent.extras?.getString("name")
        var age = intent.extras?.getString("age")
        var city = intent.extras?.getString("city")
        var skill = intent.extras?.getString("skill")


        txtName.text=name
        txtAge.text=age
        txtCity.text=city
        txtSkill.text=skill

    }
}