package com.cannybits.findmyageapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    btnGetAge.setOnClickListener(){
        getUserAge()
    }
    }

    @SuppressLint("SetTextI18n")
    private fun getUserAge(){
        val userDOB = Integer.parseInt(etDate.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        tvShowAge.text ="You are ${currentYear - userDOB} years old"
    }


}