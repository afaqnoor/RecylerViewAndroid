package com.example.recylerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var newsArrayList: ArrayList<News>,var context: Activity, ) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    // to create a new instance
    // when layout manager fails to find a suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachitem, parent, false)
        return ViewHolder(itemView)
    }

    // populate data with items
    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        var currentItem = newsArrayList[position]
        holder.title.text = currentItem.newsHeading
        holder.image.setImageResource(currentItem.newsImage)
    }

    // show how many list item are present in our array
    override fun getItemCount(): Int {
        return newsArrayList.size
    }

    // it hold the view so view are not created everytime , so memory can be saved
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = itemView.findViewById<TextView>(R.id.tvHeading)
        var image = itemView.findViewById<ShapeableImageView>(R.id.newsImage)


    }

}