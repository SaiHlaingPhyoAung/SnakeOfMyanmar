package com.example.snakeofmyanmar

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.snakeofmyanmar.model.HospitalChildData

class Hospital_Child_RecyclerView(var dataList : List<HospitalChildData>)
    : RecyclerView.Adapter<Hospital_Child_RecyclerView.ViewHolder>(){

        inner class ViewHolder(item : View) : RecyclerView.ViewHolder(item){
            val tvTitle = item.findViewById<TextView>(R.id.tvTitle)
            val tvDesc = item.findViewById<TextView>(R.id.tvDesc)
            val imageView = item.findViewById<TextView>(R.id.imageView)
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.hospital_child_cv , parent , false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return dataList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTitle.text = dataList[position].title
        holder.tvDesc.text = dataList[position].desc
        holder.imageView.text = dataList[position].image


        holder.tvDesc.setOnClickListener {
            val phoneNumber = dataList[position].desc
            // Open phone call intent with the phoneNumber
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            holder.itemView.context.startActivity(intent)
        }

        holder.imageView.setOnClickListener {
            val map = dataList[position].image
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q= $map"))
            holder.itemView.context.startActivity(intent)
        }
    }
}