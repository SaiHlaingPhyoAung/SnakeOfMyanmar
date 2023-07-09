package com.example.snakeofmyanmar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView
import com.example.snakeofmyanmar.view.FirstAid
import com.example.snakeofmyanmar.view.Hospitals

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rlSnakeId = findViewById<RelativeLayout>(R.id.rlSnakeId)
        var cvSnakeID = findViewById<CardView>(R.id.cvSnakeID)
        var cvHospital = findViewById<CardView>(R.id.cvHospital)
        var cvFirstAid = findViewById<CardView>(R.id.cvFirstAid)

        cvSnakeID.setOnClickListener {
           Intent(this , snakeID::class.java).also {
               startActivity(it)
           }
        }

        cvHospital.setOnClickListener{
            Intent(this , Hospitals::class.java).also{
                startActivity(it)
            }
        }

        cvFirstAid.setOnClickListener {
            Intent(this , FirstAid::class.java).also {
                startActivity(it)
            }
        }

    }
}