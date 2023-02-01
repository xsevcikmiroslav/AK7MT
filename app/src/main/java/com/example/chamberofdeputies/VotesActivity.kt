package com.example.chamberofdeputies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class VotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_votes)

        val btnSearch = findViewById<Button>(R.id.btnSearch)
        btnSearch.setOnClickListener {
            onSearch()
        }
    }

    fun onSearch() {/*
        val list = findViewById<ListView>(R.id.votesList)
        val votesDataList = GetVotesList()

        val arrayAdapter: ArrayAdapter<VoteData> = ArrayAdapter(
            this, android.R.layout.activity_list_item, votesDataList
        )

        list.adapter = arrayAdapter

        list.setOnItemClickListener { adapterView: AdapterView<*>, view2: View, i: Int, l: Long ->
            val votesActivity = Intent(this, VoteDataActivity::class.java)
            startActivity(votesActivity)
        }*/
    }
}