package com.cannybits.findmyageapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.text.TextWatcher
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etDate.addTextChangedListener(textWatcher)
    }

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {

        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

        }

        @SuppressLint("SetTextI18n")
        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            try {
                val currentYear = Calendar.getInstance().get(Calendar.YEAR)
                val age = currentYear - Integer.parseInt(p0.toString())
                tvShowAge.text = "You entered year ${p0}, you are ${age.toString()} years old"
                if (p1 >= 4) {
                    tvShowAge.text = "Invalid year"
                }
            } catch(ex: Exception){
                tvShowAge.text = ex.message
            }
        }
    }
}