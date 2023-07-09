package com.example.snakeofmyanmar.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.snakeofmyanmar.R
import com.example.snakeofmyanmar.model.normalSnakesIDDataProvider
import com.example.snakeofmyanmar.snakeID_RecyclerViewAdapter

class normalSnake : Fragment(R.layout.fragment_normal_snake){

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: snakeID_RecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_normal_snake, container, false)


        val normalSnakeIDList = normalSnakesIDDataProvider().getNormalSnakesID()

        adapter = snakeID_RecyclerViewAdapter(normalSnakeIDList)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

        return view
    }
}