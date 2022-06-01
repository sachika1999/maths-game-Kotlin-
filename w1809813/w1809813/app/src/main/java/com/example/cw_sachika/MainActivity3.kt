package com.example.cw_sachika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
//        Name: sachika herath
//        IIT NO;2019712

        val correct_ans = findViewById<TextView>(R.id.textView6)
        val incorrect= findViewById<TextView>(R.id.textView7)

//reciving data from the mainactivity 2
        val mIntent = intent
        val mIntent_1 = intent

        val intValue_1 = mIntent.getIntExtra("message_key", 0)
        correct_ans.text= intValue_1.toString()

        val intValue = mIntent_1.getIntExtra("message_key_1", 1)
        incorrect.text= intValue.toString()


    }
}