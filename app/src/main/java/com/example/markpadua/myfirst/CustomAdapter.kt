package com.example.markpadua.myfirst

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide


class CustomAdapter(val userList : ArrayList<User>,val listener: ViewHolder.ListListener) : RecyclerView.Adapter<ViewHolder>() {

    private var context : Context? = null
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0?.context).inflate(R.layout.list_layout,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
       var user: User = userList[p1]
        p0.BindData(user,listener)
    }

}