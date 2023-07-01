package com.example.snakeofmyanmar

import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Hospital_RecyclerViewAdapter(var HospitalLocation : List<HospitalData>)
    : RecyclerView.Adapter<Hospital_RecyclerViewAdapter.HospitalViewHolder>(){

       inner class HospitalViewHolder(itemVeiw : View) : RecyclerView.ViewHolder(itemVeiw){
            var textView = itemVeiw.findViewById<TextView>(R.id.textView)
           var recyclerView = itemVeiw.findViewById<RecyclerView>(R.id.parentRecyclerView)
           var imageView = itemVeiw.findViewById<ImageView>(R.id.imageView)
           var relativeLayout = itemView.findViewById<RelativeLayout>(R.id.relativeLayout)
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HospitalViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.hospitals_cv , parent , false)
        return HospitalViewHolder(view)
    }


    override fun getItemCount(): Int {
        return HospitalLocation.size
    }


    override fun onBindViewHolder(holder: HospitalViewHolder, position: Int) {
        val parentItem = HospitalLocation[position]
        holder.textView.text = parentItem.name
        holder.imageView.setImageResource(HospitalLocation[position].image)

        holder.recyclerView.setHasFixedSize(true)
        holder.recyclerView.layoutManager = LinearLayoutManager(holder.itemView.context , LinearLayoutManager.VERTICAL , false)


        val adapter = Hospital_Child_RecyclerView(parentItem.childItemList)
        holder.recyclerView.adapter = adapter

        holder.imageView.setOnClickListener {
            if (holder.recyclerView.visibility == View.GONE){
                holder.recyclerView.visibility = View.VISIBLE
                holder.imageView.setImageResource(R.drawable.arrow_up)
            } else {
                holder.recyclerView.visibility = View.GONE
                holder.imageView.setImageResource(R.drawable.arrow_down)
            }
        }
    }

}