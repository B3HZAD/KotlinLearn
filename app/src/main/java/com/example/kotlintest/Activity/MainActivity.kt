package com.example.kotlintest.Activity

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.kotlintest.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val TAG: String = "Behzad"


    private lateinit var bottomNavigationView : BottomNavigationView
    val manager=supportFragmentManager


    var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView=findViewById(R.id.btnNav)
        bottomNavigationView.setOnNavigationItemReselectedListener {
            when(it.itemId)
            {
                R.id.navHome ->{}
                R.id.navVideo ->{}
                R.id.navProject ->{}
                R.id.navAbout ->{}
            }
            return@setOnNavigationItemReselectedListener true
        }

    }

    fun shoeHomeFragment()
    {
        val transaction = manager.beginTransaction()
        val fragment=Hom
    }

}