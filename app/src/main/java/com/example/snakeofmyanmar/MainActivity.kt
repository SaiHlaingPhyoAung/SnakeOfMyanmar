package com.example.snakeofmyanmar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rlSnakeId = findViewById<RelativeLayout>(R.id.rlSnakeId)

        rlSnakeId.setOnClickListener {
           Intent(this , snakeID::class.java).also {
               startActivity(it)
           }
        }

    }
}