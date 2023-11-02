package com.example.recylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var newArray: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myRecyclerView = findViewById(R.id.recyclerView)

        val newsImageArray = arrayOf(
            R.drawable.apple,
            R.drawable.banana,
            R.drawable.appicon,
            R.drawable.beef,
            R.drawable.chicken,
            R.drawable.dumba,
            R.drawable.pomegranate,
            R.drawable.salad,
            R.drawable.ginger,
            R.drawable.graps,
            R.drawable.goat,
        )

        val newsNameArray = arrayOf(
            "Apple is the best for eat in the Morning",
            "Banana is the best for eat on Strong bones",
            "Apple is the best for eat in the Morning",
            "Apple is the best for eat in the Morning",
            "Apple is the best for eat in the Morning",
            "Apple is the best for eat in the Morning",
            "Apple is the best for eat in the Morning",
            "Apple is the best for eat in the Morning",
            "Apple is the best for eat in the Morning",
            "Apple is the best for eat in the Morning",
            "Apple is the best for eat in the Morning",

            )

        // to set vertically and Horizontally Item Scrolling inside RecyclerView
        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newArray = arrayListOf<News>()

        // to Store data on this Array List
        for ( index in newsImageArray.indices){
            val news = News(newsNameArray[index], newsImageArray[index])
            newArray.add(news)
        }

        myRecyclerView.adapter = MyAdapter(newArray, this)
    }
}