package com.example.markpadua.myfirst

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_clicked.*

class ViewClicked : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_clicked)
        val name = intent.getStringExtra("name")
        txtAdd.text = intent.getStringExtra("add")
        txtName.text = name
    }
}
