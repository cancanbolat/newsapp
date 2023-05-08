package com.example.newsapp

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_news_details.*

class NewsDetailsActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_details)

        val title = intent.getStringExtra("title")
        val description = intent.getStringExtra("description")

        titleTextView.text = title
        descriptionTextView.text = description
    }
}