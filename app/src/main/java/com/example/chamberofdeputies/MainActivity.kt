package com.example.chamberofdeputies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnVote = findViewById<Button>(R.id.btnVote)
        btnVote.setOnClickListener {
            val votesActivity = Intent(this, VotesActivity::class.java)
            startActivity(votesActivity)
        }
    }
}