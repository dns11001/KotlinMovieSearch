package ru.gb.kotlinmoviesearch

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import ru.gb.kotlinmoviesearch.R
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var searchButton : Button = findViewById(R.id.search_button)
        var createButton : Button = findViewById(R.id.create_item_button)

        createButton.setOnClickListener {
            var hello = Item("Breaking Bad", 2010, this@MainActivity)
        }

        searchButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Work in progress", Toast.LENGTH_LONG).show()
        }
    }
}

data class Item(var name: String, var year: Int, var context: Context) {
    init {
        Toast.makeText(context, "$name : $year created", Toast.LENGTH_LONG).show()
    }
}
