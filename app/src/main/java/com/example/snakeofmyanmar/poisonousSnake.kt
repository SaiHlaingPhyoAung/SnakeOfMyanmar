package com.example.snakeofmyanmar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class poisonousSnake : Fragment(R.layout.fragment_poisonous_snake) {

    private lateinit var recyclerView : RecyclerView
    private lateinit var adapter : snakeID_RecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_poisonous_snake , container , false)

        var poisonousSnakeIDList = listOf(
            SnakesData(R.drawable.htan_mwe , "ထန်းမြွေ"),
            SnakesData(R.drawable.htan_mwe , "ထန်းမြွေ"),
            SnakesData(R.drawable.htan_mwe , "ထန်းမြွေ"),
            SnakesData(R.drawable.htan_mwe , "ထန်းမြွေ"),
            SnakesData(R.drawable.htan_mwe , "ထန်းမြွေ")
        )

        adapter = snakeID_RecyclerViewAdapter(poisonousSnakeIDList)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

        return view
    }

}