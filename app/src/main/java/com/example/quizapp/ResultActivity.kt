package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val userName = intent.getStringExtra(Constants.USER_NAME)
        val totalNumberOfQuestion = intent.getStringExtra(Constants.totalNumberOfQuestions)
        val totalNumberOfCorrectAnswer = intent.getStringExtra(Constants.totalNumberOfCorrectAnswer)
        val tvUser: TextView = findViewById(R.id.tvUser)
        val tvScored : TextView = findViewById(R.id.tvScored)
        val btnFinish:Button = findViewById(R.id.btnFinish)
        tvUser.text = userName
        tvScored.text = "Your score is $totalNumberOfCorrectAnswer out of $totalNumberOfQuestion"
        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}