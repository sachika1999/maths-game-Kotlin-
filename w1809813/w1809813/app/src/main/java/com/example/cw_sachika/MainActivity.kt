package com.example.cw_sachika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupWindow
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Name: sachika herath
//        IIT NO: 2019712

        val popubViwe = findViewById<Button>(R.id.button)
        val text1 = findViewById<TextView>(R.id.textView)
        val new_game = findViewById<Button>(R.id.button2)

        popubViwe.setOnClickListener {
//            https://www.youtube.com/watch?v=Zgx3C9DQyjM
//            initilizing the popu window
            val window = PopupWindow(this)
//            loacting the popup window xml file
            val view = layoutInflater.inflate(R.layout.popup, null)
            window.contentView = view
            val popuptxt = view.findViewById<TextView>(R.id.textView2)
            popuptxt.setText("(NAME:SACHIKA)                      (UOWid:1809813)                           I confirm that I understand what plagiarism is and have read and understood the section on Assessment Offences in the Essential Information for Students. The work that I have submitted is entirely my own. Any work from other authors is duly referenced and acknowledged.")
//            initilizing setonclicklistiner to exicute the popud window when clicking on it
            popuptxt.setOnClickListener {
                window.dismiss()
            }
//the location wher teh popup window should apear
            window.showAsDropDown(text1)
        }

        new_game.setOnClickListener {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
    }
}