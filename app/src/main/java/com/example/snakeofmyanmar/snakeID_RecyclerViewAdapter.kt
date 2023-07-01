package com.example.snakeofmyanmar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class snakeID_RecyclerViewAdapter(var snakesDataID : List<SnakesData>)
    : RecyclerView.Adapter<snakeID_RecyclerViewAdapter.SnakesViewHolder>(){

        inner class SnakesViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
            var imageView = itemView.findViewById<ImageView>(R.id.imageView)
            var textView = itemView.findViewById<TextView>(R.id.textView)
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SnakesViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.snake_id_cv , parent , false)
        return SnakesViewHolder(view)
    }


    override fun getItemCount(): Int {
        return snakesDataID.size
    }


    override fun onBindViewHolder(holder: SnakesViewHolder, position: Int) {
        holder.textView.text = snakesDataID[position].name
        holder.imageView.setImageResource(snakesDataID[position].image)
    }
}