package com.cannybits.findmyageapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnGetAge.setOnClickListener(){
        tvShowAge.text = "You are ${getUserAge().toString()} years old"
    }
    }

    private fun getUserAge():Int{
        val userDOB = Integer.parseInt(etDate.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        return currentYear - userDOB
    }


}