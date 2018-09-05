package com.example.markpadua.myfirst

import android.os.Parcel
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.annotation.GlideType
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.load.resource.gif.GifDrawable
import com.bumptech.glide.request.RequestOptions.decodeTypeOf
import kotlinx.android.synthetic.main.list_layout.view.*

class ViewHolder(itemV: View): RecyclerView.ViewHolder(itemV){
    var imgUser: ImageView? = null
    var textViewName :   TextView? = null
    var textViewAddress :   TextView? = null

    init{
        this.textViewName = itemV.findViewById(R.id.textViewName) as TextView
        this.textViewAddress = itemV.findViewById(R.id.textViewAddress) as TextView
        this.imgUser = itemV.findViewById(R.id.imgV) as ImageView
    }

    fun BindData(user: User,listener: ListListener){
        textViewName?.text = user.name
        textViewAddress?.text = user.address
        itemView.setOnClickListener {
            listener.onClick(user)
        }
        Glide.with(itemView.context)
                .load(user.img)
                .into(imgUser!!)

    }

    interface ListListener{
        fun onClick(user: User)

    }
}