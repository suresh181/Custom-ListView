package com.example.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customlistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

        val title = arrayOf(
            "MS Dhoni",
            "Suresh Raina",
            "Moeen Ali",
            "Ravindra Jadeja",
            "Dwayne Bravo",
            "C Hari Nishaanth",
            "Sam Curran",
            "Robin Uthappa",
            "Ruturaj Gaikwad",
            "Ambati Rayudu",
            "Narayan Jagadeesan"
            )

        val description = arrayOf("Mahendra Singh Dhoni, is a former international cricketer who captained the Indian national cricket team in limited-overs formats from 2007 to 2017 and in Test cricket from 2008 to 2014.",
                                 "Suresh Raina is a former Indian international cricketer. An aggressive left-handed middle-order batsman and an occasional off-spin bowler, he is also regarded as one of the best fielders in world cricket.",
                                 "Moeen Munir Ali is an English international cricketer. An all-rounder, he is a left-handed batsman and right-arm off-spinner",
                                 "Ravindrasinh Anirudhsinh Jadeja, commonly known as Ravindra Jadeja, is an Indian international cricketer. He is an all-rounder",
                                "Dwayne John Bravo is a Trinidadian cricketer and a former captain of the West Indies cricket team. A genuine all-rounder",
                                "Chezhian Hari nishanth is an Indian cricketer. He made his Twenty20 debut for Tamil Nadu in the 2018–19 Syed Mushtaq Ali Trophy on 21 February 2019",
                                "Samuel Matthew Curran is an English cricketer, who plays for Surrey County Cricket Club, and England.",
                                "Robin Venu Uthappa is an Indian cricketer who plays for Kerala in domestic cricket. Robin has represented team India in ODIs and T20Is",
                                "Ruturaj Dashrat Gaikwad is an Indian cricketer who plays for Maharashtra in domestic cricket and for the Chennai Super Kings in the Indian Premier League.",
                                "Ambati Thirupathi Rayudu is an Indian professional cricketer and current captain of the Andhra team in the Syed Mushtaq Ali Trophy championship",
                                "Narayan Jagadeesan is an Indian cricketer. He made his first-class debut for Tamil Nadu in the 2016–17 Ranji Trophy on 27 October 2016, where he won the man of the match award."
                                )

          val imageId = arrayOf(R.drawable.msdhoni,R.drawable.suresh,R.drawable.alic,R.drawable.jadc,
            R.drawable.cbravo,R.drawable.hari,R.drawable.samc,R.drawable.uthappa,R.drawable.rutuc,
            R.drawable.ambati,R.drawable.narayanac)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.lvListView.isClickable = true
        val myListViewAdapter = MyListViewAdapter(this,title,description,imageId)
        binding.lvListView.adapter = myListViewAdapter


        binding.lvListView.setOnItemClickListener { adapterView, view, i, l ->
            val name = title[i]
            val msg = description[i]
            val img = imageId[i]
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("view",name)
            intent.putExtra("msg",msg)
            intent.putExtra("img",img)
            startActivity(intent)
        }





    }


}