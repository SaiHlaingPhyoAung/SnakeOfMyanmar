package com.example.snakeofmyanmar.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.snakeofmyanmar.Hospital_RecyclerViewAdapter
import com.example.snakeofmyanmar.R
import com.example.snakeofmyanmar.model.HospitalData
import com.example.snakeofmyanmar.model.HospitalDataProvider

class Hospitals : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var parentList : List<HospitalData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospitals)

        var ivBack = findViewById<ImageView>(R.id.ivBack)
        recyclerView = findViewById(R.id.recyclerView)

        ivBack.setOnClickListener {
            finish()
        }

        val DataList = HospitalDataProvider().getHospitalData()

        recyclerView.setHasFixedSize(true)

        var adapter = Hospital_RecyclerViewAdapter(DataList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
}