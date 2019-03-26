package com.example.injeolmi.beruberu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.ActionBar

class MainActivity : AppCompatActivity() {
    //BottomNavigationBar Workout
    lateinit var toolbar: ActionBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar=supportActionBar!!
        val bottomNavigation:BottomNavigationView=findViewById(R.id.navigationView)
        //end of BottomNavigationBar Workout
    }  

}
