package com.example.quizapp

data class Questions(
    val id:Int,
    val questionStatement:String,
    val questionsImages:Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour: String,
    val correctAnswer:Int
)
