package com.example.learn_new_language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

lateinit var numberstv: TextView
lateinit var colorstv: TextView
lateinit var familytv: TextView
lateinit var phrasetv: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberstv = findViewById(R.id.numbers)
        numberstv.setOnClickListener{
            val intent = Intent(this, NumbersActivity::class.java)
            startActivity(intent)
        }

        colorstv = findViewById(R.id.colors)
        colorstv.setOnClickListener {
            val intent = Intent(this, ColorsActivity::class.java)
            startActivity(intent)
        }

        familytv = findViewById(R.id.family)
        familytv.setOnClickListener {
            val intent = Intent(this, FamilyActivity::class.java)
            startActivity(intent)
        }

        phrasetv = findViewById(R.id.phrases)
        phrasetv.setOnClickListener {
            val intent = Intent(this, PhraseActivity::class.java)
            startActivity(intent)
        }
    }
}