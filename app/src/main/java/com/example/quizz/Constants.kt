package com.example.quizz

object Constants {
    fun getQuestions(): ArrayList<Questions>
    {
        val questionsList  = ArrayList<Questions>()
        val que1 = Questions(1, "What country does this flag belong ?",
            R.drawable.ic_flag_of_argentina, "Argentina",
            "India", "USA", "UAE",
        1
            )
        questionsList.add(que1)
        val que2 = Questions(2, "What country does this flag belong ?",
            R.drawable.ic_flag_of_australia, "Argentina",
            "India", "Australia", "UAE",
            3
        )
        questionsList.add(que2)

        val que3 = Questions(3, "What country does this flag belong ?",
            R.drawable.ic_flag_of_belgium, "Nepal",
            "Switzerland", "Bhutan", "Belgium",
            4
        )
        questionsList.add(que3)

        val que4 = Questions(4, "What country does this flag belong ?",
            R.drawable.ic_flag_of_brazil, "Brazil",
            "Portugal", "Austria", "Egypt",
            1
        )
        questionsList.add(que4)

        val que5 = Questions(5, "What country does this flag belong ?",
            R.drawable.ic_flag_of_denmark, "Armenia",
            "Sri lanka", "Fucking Denmark", "Vatican city",
            3
        )
        questionsList.add(que5)

        val que6 = Questions(6, "What country does this flag belong ?",
            R.drawable.ic_flag_of_fiji, "England",
            "fiji", "Scot land", "Nether land",
            2
        )
        questionsList.add(que6)

        val que7 = Questions(7, "What country does this flag belong ?",
            R.drawable.ic_flag_of_germany, "Spain",
            "Luxembourg", "Germany", "finland",
            3
        )
        questionsList.add(que7)

        val que8 = Questions(8, "What country does this flag belong ?",
            R.drawable.ic_flag_of_india, "Iran",
            "Ireland", "chad", "❤India",
            3
        )
        questionsList.add(que8)

        val que9 = Questions(9, "What country does this flag belong ?",
            R.drawable.ic_flag_of_kuwait, "Qatar",
            "Oman", "Bahrain", "Kuwait",
            4
        )
        questionsList.add(que9)

        val que10 = Questions(10, "What country does this flag belong ?",
            R.drawable.ic_flag_of_new_zealand, "USA",
            "New Zealand", "Australia", "Ecuador",
            3
        )
        questionsList.add(que10)
        return questionsList

    }
}