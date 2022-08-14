package com.example.quizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat

class QuestionsActivity : AppCompatActivity(),View.OnClickListener {
    private var userName : String = "username"
    private var mCurrentQuestion : Int = 1
    private var mSelectedOption : Int = 0
    private var mCorrectAnswer : Int = 0
    private var mQuestionList:ArrayList<Questions>? = null
    private var tvQuestions : TextView? = null
    private var ivImage : ImageView? = null
    private var tvProgressBar: ProgressBar? = null
    private var tvProgress : TextView? = null
    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    private  var btnSubmit : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)
        tvQuestions = findViewById(R.id.tvQuestions)
        ivImage = findViewById(R.id.ivImage)
        tvProgressBar = findViewById(R.id.tvProgressBar)
        tvProgress  = findViewById(R.id.tvProgress)
        tvOptionOne = findViewById(R.id.tvOptionOne)
        tvOptionTwo = findViewById(R.id.tvOptionTwo)
        tvOptionThree = findViewById(R.id.tvOptionThree)
        tvOptionFour = findViewById(R.id.tvOptionFour)
        btnSubmit = findViewById(R.id.btnSubmit)
        mQuestionList = Constants.getQuestion()
        setQuestion()
        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)
        userName = intent.getStringExtra(Constants.USER_NAME).toString()
    }
    private fun setQuestion()
    {
        defaultOptionView()
        val questions:Questions = mQuestionList!![mCurrentQuestion-1]
        tvQuestions?.text = questions.questionStatement
        ivImage?.setImageResource(questions.questionsImages)
        tvProgressBar?.progress = mCurrentQuestion
        tvProgress?.text = "$mCurrentQuestion/${tvProgressBar?.max}"
        tvOptionOne?.text = questions.optionOne
        tvOptionTwo?.text = questions.optionTwo
        tvOptionThree?.text = questions.optionThree
        tvOptionFour?.text = questions.optionFour
        btnSubmit?.text = "SUBMIT"

    }
    override fun onClick(view: View?) {
        when(view?.id)
        {
            R.id.tvOptionOne->{
                selectedOptionView(1,R.drawable.selected_option_bg)
            }
            R.id.tvOptionTwo->{
                selectedOptionView(2,R.drawable.selected_option_bg)
            }
            R.id.tvOptionThree->{
                selectedOptionView(3,R.drawable.selected_option_bg)
            }
            R.id.tvOptionFour->{
                selectedOptionView(4,R.drawable.selected_option_bg)
            }
            R.id.btnSubmit->{
                if(mSelectedOption==0)
                {  mCurrentQuestion++
                    when {
                        mCurrentQuestion <= mQuestionList!!.size -> {
                            setQuestion()
                        }
                        else -> {
                           val  intent = Intent(this,ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME, userName)
                            intent.putExtra(Constants.totalNumberOfQuestions, mQuestionList?.size.toString())
                            intent.putExtra(Constants.totalNumberOfCorrectAnswer,mCorrectAnswer.toString())
                            startActivity(intent)
                            finish()
                        }
                    }
                }
                else
                {
                    val que = mQuestionList!![mCurrentQuestion-1]
                    if(mSelectedOption != que.correctAnswer)
                    {
                        answerView(mSelectedOption,R.drawable.wrong_ans_bg)
                    }
                    else mCorrectAnswer++
                    answerView(que.correctAnswer,R.drawable.right_ans_bg)
                    if(mCurrentQuestion==mQuestionList!!.size)
                    {
                        btnSubmit?.text = "FINISH"
                    }
                    else
                    {
                        btnSubmit?.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOption = 0
                }
            }
        }
    }
    private fun answerView(selectedOption :Int, drawableBackground: Int)
    {
        when(selectedOption)
        {
            1->{

                tvOptionOne?.background = ContextCompat.getDrawable(this,drawableBackground)
            }
            2->{

                tvOptionTwo?.background = ContextCompat.getDrawable(this,drawableBackground)
            }
            3->{

                tvOptionThree?.background = ContextCompat.getDrawable(this,drawableBackground)
            }
            4->{

                tvOptionFour?.background = ContextCompat.getDrawable(this,drawableBackground)
            }
        }
    }
    private fun selectedOptionView(chooseOption:Int, drawableBackground:Int)
    {
        mSelectedOption = chooseOption
        defaultOptionView()
        when(chooseOption)
        {
            1->{
                tvOptionOne?.setTextColor(Color.parseColor("#1C3879"))
                tvOptionOne?.setTypeface(Typeface.DEFAULT,Typeface.BOLD)
                tvOptionOne?.background = ContextCompat.getDrawable(this,drawableBackground)
            }
            2->{
                tvOptionTwo?.setTextColor(Color.parseColor("#1C3879"))
                tvOptionTwo?.setTypeface(Typeface.DEFAULT,Typeface.BOLD)
                tvOptionTwo?.background = ContextCompat.getDrawable(this,drawableBackground)
            }
            3->{
                tvOptionThree?.setTextColor(Color.parseColor("#1C3879"))
                tvOptionThree?.setTypeface(Typeface.DEFAULT,Typeface.BOLD)
                tvOptionThree?.background = ContextCompat.getDrawable(this,drawableBackground)
            }
            4->{
                tvOptionFour?.setTextColor(Color.parseColor("#1C3879"))
                tvOptionFour?.setTypeface(Typeface.DEFAULT,Typeface.BOLD)
                tvOptionFour?.background = ContextCompat.getDrawable(this,drawableBackground)
            }
        }
    }
    private fun defaultOptionView()
    {
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0,it)
        }
        tvOptionTwo?.let {
            options.add(1,it)
        }
        tvOptionThree?.let {
            options.add(2,it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }
        for(opt in options)
        {
            opt.setTextColor(Color.parseColor("#EAE3D2"))
            opt.typeface = Typeface.DEFAULT
            opt.background = ContextCompat.getDrawable(this,
                R.drawable.option_border_bg)
        }

    }
}





