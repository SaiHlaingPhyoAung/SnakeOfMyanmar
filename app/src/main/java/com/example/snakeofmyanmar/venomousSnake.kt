package com.example.snakeofmyanmar

import android.graphics.Color
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
            SnakesIDData(R.drawable.saba_gyi , "စပါးကြီး" , "စပါးကြီး" , "Burmese Phyton" , "ပျော့" , R.drawable.saba_gyi , Color.rgb(255, 160, 0) , R.string.ngn_daw_kyar , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own),
            SnakesIDData(R.drawable.saba_own , "စပါးအုန်း" , "စပါးအုန်း" , "Python bivittatus" , "ပျော့" , R.drawable.saba_own ,Color.rgb(255, 160, 0), R.string.ngn_daw_kyar , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own),
            SnakesIDData(R.drawable.htan_mwe , "ထန်းမြွေ" ,"ထန်းမြွေ" ,"Golden Tree Snake" ,"ပျော့" , R.drawable.htan_mwe, Color.rgb(255, 160, 0), R.string.ngn_daw_kyar , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own),
            SnakesIDData(R.drawable.yat_kan_kyo_mwe , "ယက်ကန်းကြိုးမြွေ" ,"ယက်ကန်းကြိုးမြွေ" , "Green Vine snake","ပျော့" , R.drawable.yat_kan_kyo_mwe, Color.rgb(255, 160, 0), R.string.ngn_daw_kyar , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own),
            SnakesIDData(R.drawable.saba_gyi , "စပါးကြီး" , "စပါးကြီး" , "Burmese Phyton" , "ပျော့" , R.drawable.saba_gyi, Color.rgb(255, 160, 0), R.string.ngn_daw_kyar , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own),
            SnakesIDData(R.drawable.saba_own , "စပါးအုန်း" , "စပါးအုန်း" , "Python bivittatus" , "ပျော့" , R.drawable.saba_own, Color.rgb(255, 160, 0), R.string.ngn_daw_kyar , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own),
            SnakesIDData(R.drawable.htan_mwe , "ထန်းမြွေ" ,"ထန်းမြွေ" ,"Golden Tree Snake" ,"ပျော့" , R.drawable.htan_mwe, Color.rgb(255, 160, 0), R.string.ngn_daw_kyar , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own),
            SnakesIDData(R.drawable.yat_kan_kyo_mwe , "ယက်ကန်းကြိုးမြွေ" ,"ယက်ကန်းကြိုးမြွေ" , "Green Vine snake","ပျော့" , R.drawable.yat_kan_kyo_mwe, Color.rgb(255, 160, 0), R.string.ngn_daw_kyar , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own,R.drawable.saba_own , R.drawable.saba_own),
            )

        adapter = snakeID_RecyclerViewAdapter(venomousSnakeIDList)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

        return view
    }

}