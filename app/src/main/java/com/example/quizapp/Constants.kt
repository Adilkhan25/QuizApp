package com.example.quizapp

object Constants {
    const val USER_NAME : String = "Adil"
    const val totalNumberOfQuestions : String = "20"
    const val totalNumberOfCorrectAnswer : String = "0"
    fun getQuestion() : ArrayList<Questions>{
        val collectionOfQuestion = ArrayList<Questions>()
      val  que1 = Questions(1,"What is the value of c in the below given code?",
            R.drawable.ic_one_question, "3000","30000","300010","300000",2
        )
        collectionOfQuestion.add(que1)
        val que2 = Questions(2,"Which one statement among the following is right related to super?",
        R.drawable.ic_two_question, "Used to handle the error","used to access methods and members of child class",
        "used to access methods and members of parent class","used for overloading",3)
        collectionOfQuestion.add(que2)
        val  que3 = Questions(3,"What is the output of given code?",
            R.drawable.ic_three_question, "0","20","400","210",4
        )
        collectionOfQuestion.add(que3)

        val  que4 = Questions(4,"What is the output of given code?",
            R.drawable.ic_four_question, "2399","2199","2189","2400",1
        )
        collectionOfQuestion.add(que4)

        val  que5 = Questions(5,"Which algorithm Sort the given array in minimum time?",
            R.drawable.ic_five_question, "Merge Sort","Quick Sort","Count Sort","Selection Sort",3
        )
        collectionOfQuestion.add(que5)
        val  que6 = Questions(6,"Identify the algorithm which is give in image",
            R.drawable.ic_six_question, "Merge Sort","Quick Sort","Count Sort","Selection Sort",2
        )
        collectionOfQuestion.add(que6)
        val  que7 = Questions(7,"Identify the algorithm which is give in image",
            R.drawable.ic_seven_question, "Merge Sort","Quick Sort","Count Sort","Selection Sort",1
        )
        collectionOfQuestion.add(que7)
        val  que8 = Questions(8,"what is the time complexity of algorithm which is give in image",
            R.drawable.ic_six_question, "O(n*long(n))","O(n*n)","O(n)","O(1)",1
        )
        collectionOfQuestion.add(que8)
        collectionOfQuestion.add(que7)
        val  que9 = Questions(9,"what is the time complexity of algorithm which is give in image",
            R.drawable.ic_seven_question, "O(n*n)","O(n)","O(n*long(n))","O(n*n*n)",3
        )
        collectionOfQuestion.add(que9)
        val  que10 = Questions(10,"is extra space required to sort this array in minimum time",
            R.drawable.ic_five_question, "YES","NO","Sometime Yes,sometime No","yes up to half range",1
        )
        collectionOfQuestion.add(que10)
        val  que11 = Questions(11,"How much extra space required to sort this array in minimum time",
            R.drawable.ic_five_question, "O(1)","O(n*lon(n))","O(n*n)","O(n)",4
        )
        collectionOfQuestion.add(que11)





        return collectionOfQuestion
    }
}