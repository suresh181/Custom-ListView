package com.example.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customlistview.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name= intent.getStringExtra("view")
        val msg= intent.getStringExtra("msg")
        val image= intent.getIntExtra("img",R.drawable.msdhoni)

        binding.title.text = name
        binding.description.text = msg
        binding.ivImg.setImageResource(image)





    }
}