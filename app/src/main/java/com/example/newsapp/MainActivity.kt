package com.example.newsapp

import NewsAdapter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.ui.theme.NewsAppTheme

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

    private fun generateDummyNews(): List<News> {
        return listOf(
            News("Başlık 1", "Açıklama 1"),
            News("Başlık 2", "Açıklama 2"),
            News("Başlık 3", "Açıklama 3"),
            News("Başlık 4", "Açıklama 4"),
            News("Başlık 5", "Açıklama 5")
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