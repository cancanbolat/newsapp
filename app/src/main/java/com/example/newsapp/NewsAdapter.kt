import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.NewsDetailsActivity
import com.example.newsapp.R
import com.example.newsapp.News

class NewsAdapter(private val context: Context, private val newsList: List<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.news_item, parent, false)
        return NewsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = newsList[position]
        holder.itemView.titleTextView.text = news.title
        holder.itemView.descriptionTextView.text = news.description

        holder.itemView.setOnClickListener {
            val intent = Intent(context, NewsDetailsActivity::class.java)
            intent.putExtra("title", news.title)
            intent.putExtra("description", news.description)
            context.startActivity(intent)
        }
    }

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}

