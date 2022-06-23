package ru.gb.kotlinmoviesearch

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import ru.gb.kotlinmoviesearch.R
import java.security.AccessController.getContext
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cycles()
        val hello = Item("Breaking Bad", 2010, this@MainActivity)


        findViewById<Button>(R.id.search_button).setOnClickListener {
            Toast.makeText(this@MainActivity, "Work in progress", Toast.LENGTH_LONG).show()
        }

        findViewById<Button>(R.id.create_item_button).setOnClickListener {
            val copyItem = hello.copy(name = "Gladiator", year = 2004)
        }






    }

    private fun cycles() {
        for(i in 1..3) {
            Toast.makeText(this@MainActivity, "$i", Toast.LENGTH_SHORT).show()
        }

        for(i in 3 downTo 1) {
            Toast.makeText(this@MainActivity, "$i", Toast.LENGTH_SHORT).show()
        }

        for(i in 4 downTo 1 step 2) {
            Toast.makeText(this@MainActivity, "$i", Toast.LENGTH_SHORT).show()
        }
    }
}

data class Item(var name: String, var year: Int, var context: Context) {
    init {
        Toast.makeText(context, "$name : $year created", Toast.LENGTH_SHORT).show()
    }
}




