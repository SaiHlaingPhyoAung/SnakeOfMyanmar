package com.example.snakeofmyanmar

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.snakeofmyanmar.model.SnakesIDData

class snakeID_RecyclerViewAdapter(var snakesDataID : List<SnakesIDData>)
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
        holder.imageView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, snake_id_cv::class.java)
            intent.putExtra("snakeId" , snakesDataID[position].ID)
            intent.putExtra("snakeId2" , snakesDataID[position].ID2)
            intent.putExtra("poison" , snakesDataID[position].poison)
            intent.putExtra("image" , snakesDataID[position].image)
            intent.putExtra("color" , snakesDataID[position].color)
            intent.putExtra("desc" , snakesDataID[position].desc)

            intent.putExtra("slider1" , snakesDataID[position].imageSlider1)
            intent.putExtra("slider2" , snakesDataID[position].imageSlider2)
            intent.putExtra("slider3" , snakesDataID[position].imageSlider3)
            intent.putExtra("slider4" , snakesDataID[position].imageSlider4)
            intent.putExtra("slider5" , snakesDataID[position].imageSlider5)

            context.startActivity(intent)
        }
    }
}