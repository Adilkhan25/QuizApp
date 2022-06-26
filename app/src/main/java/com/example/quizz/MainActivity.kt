package com.example.quizz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart : Button = findViewById(R.id.btnStart)
        val editName : EditText = findViewById((R.id.editName))
        btnStart.setOnClickListener {
            if (editName.text.isEmpty()) {
                Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_LONG).show()
            } else {
                    // let's go next page
                    val intent = Intent(this, QuestionActivity::class.java)
                    // start another activity
                    startActivity(intent)
                   // close this activity
                    finish()

            }
        }
    }

}