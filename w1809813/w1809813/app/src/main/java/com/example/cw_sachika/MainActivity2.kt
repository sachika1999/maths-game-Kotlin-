package com.example.cw_sachika

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

//        Name: sachika herath
//        IIT NO: 2019712

//    golbel veribales
    var correct_answer = 0
    var worng_answer = 0
    var Answer1 = 0.0
    var Answer2 = 0.0
    var lastequation= ""
    var lastequation_2= ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        adiing textviwes
        val test = findViewById<TextView>(R.id.textView)
        val test2 = findViewById<TextView>(R.id.textView2)
        val test3 = findViewById<TextView>(R.id.textView3)
        val timer = findViewById<TextView>(R.id.textView9)
//adiing buttons
        val Grater = findViewById<Button>(R.id.button)
        val equalse = findViewById<Button>(R.id.button2)
        val Less = findViewById<Button>(R.id.button3)
        val check = findViewById<ImageView>(R.id.imageView2)


        var amount = 0.0
        var amount1 = 0.0
        var amount2 = 0.0
        var amount3 = 0.0
        var lastreturn = 0.0
        var lastreturn2 = 0.0
        var lastamount=""
        var lastamount_2=""
        var first_operator = ""
        var secondOperator = ""
        var thirdOperator = ""
        var forthOperator = ""

// creating the fisrt arithmetic expressions
        fun firstmeth(): Pair<Double, String>
        {
//            genarataing random number
            var a = (1..20).random()
            var b = (1..20).random()

//            selcting an arithmetic expressions randomdly
            var ranNum = (0..3).random()
            if (0 == ranNum) {
                amount = ((a + b).toDouble())
                first_operator = "$a + $b"
            } else if (1 == ranNum) {
                amount = ((a - b).toDouble())
                first_operator = "$a - $b"
            } else if (2 == ranNum) {
                amount = ((a / b).toDouble())
                first_operator = "$a / $b"
            } else if (3 == ranNum) {
                amount = ((a * b).toDouble())
                first_operator = "$a * $b"
            }
//initializing  a while loop
            var valid = false
            while(!valid)
            {
                //initializing if conditon to fliter the ones that LOWER THAN 10 and Intger valueas
                if (amount < 100 && amount > 0 && a%b ==0  ){
                    valid = true
                }else
                {
                    a = (1..20).random()
                    b = (1..20).random()
                     ranNum = (0..3).random()

                    if (0 == ranNum) {
                        amount = ((a + b).toDouble())
                        first_operator = "$a + $b"
                    } else if (1 == ranNum) {
                        amount = ((a - b).toDouble())
                        first_operator = "$a - $b"
                    } else if (2 == ranNum) {
                        amount = ((a / b).toDouble())
                        first_operator = "$a / $b"
                    } else if (3 == ranNum) {
                        amount = ((a * b).toDouble())
                        first_operator = "$a * $b"
                    }
                }
            }
//            return values
            return Pair(amount,first_operator)
        }

        // creating the second arithmetic expressions
        fun secongtmeth(): Pair<Double, String> {
            val (return1, returnEq1) = firstmeth()
            var c = (1..20).random()
            var  ranNum = (0..3).random()

            if (0 == ranNum) {
                amount1 = ((return1) + c)
                secondOperator = "( $returnEq1 ) + $c"
            } else if (1 == ranNum) {
                amount1 = ((return1) - c)
                secondOperator = "( $returnEq1 ) - $c"
            } else if (2 == ranNum) {
                amount1 = ((return1) / c)
                secondOperator = "( $returnEq1 ) / $c"
            } else if (3 == ranNum) {
                amount1 = ((return1) * c)
                secondOperator = "( $returnEq1 ) * $c"
            }
            //initializing  a while loop
            var valid = false
            while(!valid) {
                //initializing if conditon to fliter the ones that LOWER THAN 10 and Intger valueas

                if (amount1 < 100 && amount1 > 0 && return1.toInt()%c ==0 ) {
                    valid = true
                } else
                {
                    c = (1..20).random()
                    ranNum = (0..3).random()

                    if (0 == ranNum) {
                        amount1 = ((return1) + c)
                        secondOperator = "( $returnEq1 ) + $c"
                    } else if (1 == ranNum) {
                        amount1 = ((return1) - c)
                        secondOperator = "( $returnEq1 ) - $c"
                    } else if (2 == ranNum) {
                        amount1 = ((return1) / c)
                        secondOperator = "( $returnEq1 ) / $c"
                    } else if (3 == ranNum) {
                        amount1 = ((return1) * c)
                        secondOperator = "( $returnEq1 ) * $c"
                    }
                }
            }
            return Pair(amount1, secondOperator)
        }

        // creating the third arithmetic expressions
        fun thirdtmeth(): Pair<Double, String> {
            val (return2, returnEq2) = secongtmeth()
            var d = (1..20).random()
            var ranNum = (0..3).random()

            if (0 == ranNum) {
                amount2 = ((return2) + d)
                thirdOperator = "( $returnEq2 ) + $d"
            } else if (1 == ranNum) {
                amount2 = ((return2) - d)
                thirdOperator = "( $returnEq2 ) - $d"
            } else if (2 == ranNum) {
                amount2 = ((return2) / d)
                thirdOperator = "( $returnEq2 ) / $d"
            } else if (3 == ranNum) {
                amount2 = ((return2) * d)
                thirdOperator = "( $returnEq2 ) * $d"
            }
            //initializing  a while loop

            var valid = false
            while(!valid) {
                //initializing if conditon to fliter the ones that LOWER THAN 10 and Intger valueas
                if (amount2 < 100 && amount2 > 0 && return2.toInt()%d ==0) {
                    valid = true
                } else
                {
                    d = (1..20).random()
                    ranNum = (0..3).random()

                    if (0 == ranNum) {
                        amount2 = ((return2) + d)
                        thirdOperator = "( $returnEq2 ) + $d"
                    } else if (1 == ranNum) {
                        amount2 = ((return2) - d)
                        thirdOperator = "( $returnEq2 ) - $d"
                    } else if (2 == ranNum) {
                        amount2 = ((return2) / d)
                        thirdOperator = "( $returnEq2 ) / $d"
                    } else if (3 == ranNum) {
                        amount2 = ((return2) * d)
                        thirdOperator = "( $returnEq2 ) * $d"
                    }
                }
            }
//            return values
            return Pair(amount2, thirdOperator)
        }

        // creating the forth arithmetic expressions
        fun forthtmeth(): Pair<Double, String> {
            val (return3, returnEq3) = thirdtmeth()
            var e = (1..20).random()
            var ranNum = 0

            if (0 == ranNum) {
                amount3 = ((return3) + e)
                forthOperator = "( $returnEq3 ) + $e"
            } else if (1 == ranNum) {
                amount3 = ((return3) - e)
                forthOperator = "( $returnEq3 ) - $e"
            } else if (2 == ranNum) {
                amount3 = ((return3) / e)
                forthOperator = "( $returnEq3 ) / $e"
            } else if (3 == ranNum) {
                amount3 = ((return3) * e)
                forthOperator = "( $returnEq3 ) * $e"
            }
            //initializing  a while loop

            var valid = false
            while(!valid) {
                //initializing if conditon to fliter the ones that LOWER THAN 10 and Intger valueas
                if (amount3 < 100 && amount3 > 0 && return3.toInt()%e ==0) {
                    valid = true
                } else
                {
                    e = (1..20).random()
                    ranNum = (0..3).random()

                    if (0 == ranNum) {
                        amount3 = ((return3) + e)
                        forthOperator = "( $returnEq3 ) + $e"
                    } else if (1 == ranNum) {
                        amount3 = ((return3) - e)
                        forthOperator = "( $returnEq3 ) - $e"
                    } else if (2 == ranNum) {
                        amount3 = ((return3) / e)
                        forthOperator = "( $returnEq3 ) / $e"
                    } else if (3 == ranNum) {
                        amount3 = ((return3) * e)
                        forthOperator = "( $returnEq3 ) * $e"
                    }
                }
            }
//            retur values
            return Pair(amount3, forthOperator)
        }
//creating the first random arithmetic expressions
        fun firtsEquation(): Pair<Double, String> {

            val ranNum1 = (0..3).random()

            if (0 == ranNum1) {
                val (value1, valueEq1) = firstmeth()
                lastreturn = value1
                lastamount=valueEq1

            } else if (1 == ranNum1) {
                val (value1, valueEq1) = secongtmeth()
                lastreturn = value1
                lastamount=valueEq1

            } else if (2 == ranNum1) {
                val (value1, valueEq1) = thirdtmeth()
                lastreturn = value1
                lastamount=valueEq1

            } else if (3 == ranNum1) {
                val (value1, valueEq1) = forthtmeth()
                lastreturn = value1
                lastamount=valueEq1
            }
            return Pair(lastreturn,lastamount)
        }
        //creating the first random arithmetic expressions
        fun secondEquation(): Pair<Double, String>  {
            val ranNum2 = (0..3).random()

            if (0 == ranNum2) {
                val (value2, valueEq2) = firstmeth()
                lastreturn2 = value2
                lastamount_2=valueEq2
            } else if (1 == ranNum2) {
                val (value2, valueEq2) = secongtmeth()
                lastreturn2 = value2
                lastamount_2=valueEq2
            } else if (2 == ranNum2) {
                val (value2, valueEq2) = thirdtmeth()
                lastreturn2 = value2
                lastamount_2=valueEq2
            } else if (3 == ranNum2) {
                val (value2, valueEq2) = forthtmeth()
                lastreturn2 = value2
                lastamount_2=valueEq2
            }
            return Pair(lastreturn2,lastamount_2)
        }
//        putting random arithmetic expressions in to textviwes
        fun final() {
            val (number, numberString) = firtsEquation()
            val (number2, numberString2) = secondEquation()

            Answer1 = number
            Answer2 = number2
            lastequation= numberString
            lastequation_2= numberString2
            test.setText("$lastequation")
            test2.setText("$lastequation_2")
        }
        final()
//        Checking whether the answer is greater
        Grater.setOnClickListener {
            if (Answer1 > Answer2) {
                correct_answer = correct_answer + 1
                test3.setTextColor(Color.parseColor("#00ff08"))
                test3.text = "Correct"

            } else {
                worng_answer = worng_answer + 1
                test3.setTextColor(Color.parseColor("#FF0000"))
                test3.text = "Wrong"
            }
            final()
        }
//        checking whether the answer is lesser
        Less.setOnClickListener {
            if (Answer1 < Answer2) {
                correct_answer = correct_answer + 1
                test3.setTextColor(Color.parseColor("#00ff08"))
                test3.text = "Correct"
            } else {
                worng_answer = worng_answer + 1
                test3.setTextColor(Color.parseColor("#FF0000"))
                test3.text = "Wrong"
            }
            final()
        }
        equalse.setOnClickListener {
            if (Answer1 == Answer2) {
                correct_answer = correct_answer + 1
                test3.setTextColor(Color.parseColor("#00ff08"))
                test3.text = "Correct"
            } else {
                worng_answer = worng_answer + 1
                test3.setTextColor(Color.parseColor("#FF0000"))
                test3.text = "Wrong"
            }
            final()
        }
//        displing the answer as a toast
        check.setOnClickListener {
            if (Answer1 > Answer2) {
                Toast.makeText(
                    this, "GREATER",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    this, "LESS",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
//        getting the save data afetr rotating the device
        if (savedInstanceState != null) {
            correct_answer = savedInstanceState.getInt("Ccount")
            worng_answer = savedInstanceState.getInt("Ccount1")
            Answer1 = savedInstanceState.getDouble("answer")
            Answer2 = savedInstanceState.getDouble("answer1")
            lastequation = savedInstanceState.getString("equation").toString()
            lastequation_2 = savedInstanceState.getString("equation1").toString()
        }


        test.setText("$lastequation")
        test2.setText("$lastequation_2")


//going the the next page and passing data
        fun nextpage(){
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("message_key", correct_answer)
            intent.putExtra("message_key_1", worng_answer)
            startActivity(intent)
        }

//creating the 50 secong timer
         object : android.os.CountDownTimer(40000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time=0
                timer.setText("Time left: " + ((millisUntilFinished) / 1000))
            }

//calling the next mage method to go to the next page
            override fun onFinish() {
                nextpage()
            }
        }.start()
    }

//saving data
//    https://www.youtube.com/watch?v=KJGKj078Qag
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("Ccount", correct_answer)
        outState.putInt("Ccount1", worng_answer)
        outState.putDouble("answer",Answer1 )
        outState.putDouble("answer1",Answer2)
        outState.putString("equation", lastequation)
        outState.putString("equation1", lastequation_2)

    }
}