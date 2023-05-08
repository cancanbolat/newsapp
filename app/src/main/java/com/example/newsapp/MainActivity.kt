package com.example.newsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.ui.theme.NewsAppTheme
import com.example.newsapp.R

class MainActivity : ComponentActivity() {
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dummyNews = generateDummyNews()
        newsAdapter = NewsAdapter(dummyNews)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = newsAdapter
    }

    private fun generateDummyNews(): List<NewsItem> {
        return listOf(
            NewsItem("Başlık 1", "Açıklama 1"),
            NewsItem("Başlık 2", "Açıklama 2"),
            NewsItem("Başlık 3", "Açıklama 3"),
            NewsItem("Başlık 4", "Açıklama 4"),
            NewsItem("Başlık 5", "Açıklama 5")
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewsAppTheme {
        Greeting("Android")
    }
}