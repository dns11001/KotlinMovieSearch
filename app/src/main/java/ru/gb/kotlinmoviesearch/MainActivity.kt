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


        findViewById<Button>(R.id.search_button).setOnClickListener {
            var hello = Item("Breaking Bad", 2010, this@MainActivity)
        }

        findViewById<Button>(R.id.create_item_button).setOnClickListener {
            Toast.makeText(this@MainActivity, "Work in progress", Toast.LENGTH_LONG).show()
        }


        var hello = Item("Breaking Bad", 2010, this@MainActivity)
        var copyItem = hello.copy()



    }

    private fun cycles() {
        for(i in 1..10) {
            Toast.makeText(this@MainActivity, "$i", Toast.LENGTH_LONG).show()
            Thread.sleep(50L)
        }

        for(i in 10 downTo 1) {
            Toast.makeText(this@MainActivity, "$i", Toast.LENGTH_LONG).show()
            Thread.sleep(50L)
        }

        for(i in 10 downTo 1 step 2) {
            Toast.makeText(this@MainActivity, "$i", Toast.LENGTH_LONG).show()
            Thread.sleep(50L)
        }
    }
}

data class Item(var name: String, var year: Int, var context: Context) {
    init {
        Toast.makeText(context, "$name : $year created", Toast.LENGTH_LONG).show()
    }
}




