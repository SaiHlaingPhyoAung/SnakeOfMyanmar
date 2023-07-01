package com.example.snakeofmyanmar

import android.opengl.Visibility
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class FirstAidRecyclerViewAdapter(var FirstAidList : List<FirstAidData>)
    : RecyclerView.Adapter<FirstAidRecyclerViewAdapter.FirstAidViewHolder>(){

        inner class FirstAidViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
            var title = itemView.findViewById<TextView>(R.id.textView)
            var desc = itemView.findViewById<TextView>(R.id.descTextView)
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstAidViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.firstaid_cv , parent , false)
        return FirstAidViewHolder(view)
    }


    override fun getItemCount(): Int {
        return FirstAidList.size
    }


    override fun onBindViewHolder(holder: FirstAidViewHolder, position: Int) {
        holder.title.text = FirstAidList[position].title
        holder.desc.setText(FirstAidList[position].desc)

        holder.title.setOnClickListener {
            if (holder.desc.visibility == View.GONE){
                holder.desc.visibility = View.VISIBLE
            } else {
                holder.desc.visibility = View.GONE
            }
        }

    }
}