package com.example.firstapp

import java.util.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    private var points = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pickRandomNumbers()
    }

    fun leftButtonClick(view: View){

        val leftButton = findViewById<Button>(R.id.leftbutton)
        val rightButton = findViewById<Button>(R.id.rightbutton)
        val leftNum= leftButton.toString().toInt()
        val rightNum = rightButton.toString().toInt()
        if(leftNum > rightNum){
            points++
        } else {
            points--
        }
        findViewById<TextView>(R.id.points).text = "Points: $points"
        pickRandomNumbers()

    }

    fun rightButtonClick(view: View){
        val leftButton = findViewById<Button>(R.id.leftbutton)
        val rightButton = findViewById<Button>(R.id.rightbutton)
        val leftNum= leftButton.toString().toInt()
        val rightNum = rightButton.toString().toInt()
        if(leftNum < rightNum){
            points--
        } else {
            points++
        }
        findViewById<TextView>(R.id.points).text = "Points: $points"
        pickRandomNumbers()

    }


    fun pickRandomNumbers(){

            val leftButton = findViewById<Button>(R.id.leftbutton)
            val rightButton = findViewById<Button>(R.id.rightbutton)
            val r = Random()
            val num1 = r.nextInt(10)
            leftButton.text = "$num1"

            val num2 = r.nextInt(10)
            rightButton.text = "$num2"
    }
}
