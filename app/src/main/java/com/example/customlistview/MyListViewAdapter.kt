package com.example.customlistview

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListViewAdapter(private val context:Activity,
                        private val title:Array<String>,
                        private val description:Array<String>,
                        private val imgId: Array<Int>
):ArrayAdapter<String>(context,R.layout.custom_listview,title) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val listView = inflater.inflate(R.layout.custom_listview,null,true)

        val titleText = listView.findViewById<TextView>(R.id.tv_title)
        val reviews = listView.findViewById<TextView>(R.id.tv_description)
        val image = listView.findViewById(R.id.iv_icon)as ImageView

        titleText.text = title[position]
        reviews.text = description[position]
        image.setImageResource(imgId[position])
        return listView


    }



}

