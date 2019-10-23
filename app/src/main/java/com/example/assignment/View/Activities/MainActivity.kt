package com.example.assignment.View.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment.R
import com.example.assignment.View.Fragments.DisplayFragment


class MainActivity : AppCompatActivity() {

    val fragmentManager = supportFragmentManager;
    val displayFragmentInstance = DisplayFragment();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDisplayFragment();


    }

    fun initDisplayFragment(){

        fragmentManager.beginTransaction().add(R.id.displayFragment, displayFragmentInstance).commit()



    }
}
