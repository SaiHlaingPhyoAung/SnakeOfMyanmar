package com.example.snakeofmyanmar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class normalSnake : Fragment(R.layout.fragment_normal_snake){
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: snakeID_RecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_normal_snake, container, false)

        var normalSnakeIDList = listOf(
            SnakesData(R.drawable.saba_gyi , "စပါးကြီး"),
            SnakesData(R.drawable.saba_own , "စပါးအုန်း"),
            SnakesData(R.drawable.htan_mwe , "ထန်းမြွေ"),
            SnakesData(R.drawable.yat_kan_kyo_mwe , "ယက်ကန်းကြိုးမြွေ"),
            SnakesData(R.drawable.saba_gyi , "saba Gyi"),
            SnakesData(R.drawable.saba_gyi , "saba Gyi")
        )

        adapter = snakeID_RecyclerViewAdapter(normalSnakeIDList)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

        return view
    }
}