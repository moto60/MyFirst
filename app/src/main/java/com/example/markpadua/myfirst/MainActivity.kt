package com.example.markpadua.myfirst

import android.content.Intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
     
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, ColorRandomizer::class.java)
        startActivity(intent)

    }

    fun Submit(view: View) {
        if (txtUname.text.toString().equals("Admin") && txtPword.text.toString().equals("Admin")) {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()

        }
    }
}
