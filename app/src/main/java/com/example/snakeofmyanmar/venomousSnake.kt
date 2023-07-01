package com.example.snakeofmyanmar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class venomousSnake : Fragment(R.layout.fragment_venomous_snake) {

    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter : snakeID_RecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater.inflate(R.layout.fragment_poisonous_snake , container , false)

        var venomousSnakeIDList = listOf(
            SnakesData(R.drawable.ngn_daw_kyar , "နန်းတော်ကြား"),
            SnakesData(R.drawable.mwe_sein , "မြွေစိမ်းမြှီးခြောက်"),
            SnakesData(R.drawable.mwe_sein , "မြွေစိမ်းမြှီးခြောက်"),
            SnakesData(R.drawable.mwe_sein , "မြွေစိမ်းမြှီးခြောက်")
        )

        adapter = snakeID_RecyclerViewAdapter(venomousSnakeIDList)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

        return view
    }

}