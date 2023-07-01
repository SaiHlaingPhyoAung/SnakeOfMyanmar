package com.example.snakeofmyanmar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FirstAid : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        var ivBack = findViewById<ImageView>(R.id.ivBack)
        recyclerView = findViewById(R.id.recyclerView)

        ivBack.setOnClickListener {
            finish()
        }

        var FirstAidList = listOf(
            FirstAidData("မြွေကိုက်ခံရရင်ဘာလုပ်မလဲ?" , R.string.`မြွေကိုက်ခံရရင်ဘာလုပ်မလဲ`)

        )

        var FirstAidadapter = FirstAidRecyclerViewAdapter(FirstAidList)
        recyclerView.adapter = FirstAidadapter
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}