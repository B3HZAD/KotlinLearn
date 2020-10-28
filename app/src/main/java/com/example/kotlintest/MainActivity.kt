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

    }

}