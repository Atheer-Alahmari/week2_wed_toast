package com.example.week2_wed

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var f_nameED:EditText
    lateinit var l_nameED:EditText
    lateinit var myToastB:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        f_nameED=findViewById(R.id.editText)
        l_nameED=findViewById(R.id.editText2)

        myToastB=findViewById(R.id.button)

        myToastB.setOnClickListener {
            var fName=f_nameED.text.toString()
            var lName=l_nameED.text.toString()
            Toast.makeText(applicationContext, "$fName  $lName", Toast.LENGTH_SHORT).show()
        }
    }
}