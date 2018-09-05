package com.example.markpadua.myfirst

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.widget.Toast


class ColorRandomizer : AppCompatActivity() , ViewHolder.ListListener {
    override fun onClick(user: User) {
        Toast.makeText(this,user.name,Toast.LENGTH_SHORT).show()
        val mintent = Intent(this, ViewClicked::class.java)
        mintent.putExtra("name",user.name)
        mintent.putExtra("add",user.address)
        startActivity(mintent)

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_randomizer)

        val RecyclerView  = findViewById(R.id.MyRecycler) as RecyclerView
        RecyclerView.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL, true)

        val users = ArrayList<User>()
        users.add(User("Andrey","Las Pinas","data:image/jpeg;base64,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"))
        users.add(User("Chris","Makati","data:image/jpeg;base64,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"))
        users.add(User("Francis","Taguig","https://media.giphy.com/media/eHKM1zH4JBMk/giphy.gif"))

        val adapter = CustomAdapter(users,this)
        RecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        RecyclerView.adapter = adapter




    }



}