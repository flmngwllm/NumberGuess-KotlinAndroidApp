package com.example.firstapp

import java.util.*
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    // set the starting value to 0
    private var points = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pickRandomNumbers()
    }

    //function for the left button
    fun leftButtonClick(view: View){

        val leftButton = findViewById<Button>(R.id.leftbutton)
        val rightButton = findViewById<Button>(R.id.rightbutton)
        val leftNum= leftButton.text.toString().toInt()
        val rightNum = rightButton.text.toString().toInt()
        if(leftNum > rightNum){
            //correct
            points++
        } else {
            //wrong
            points--
        }
        findViewById<TextView>(R.id.points).text = "Points: $points"
        pickRandomNumbers()

    }

    //function for the right button
    fun rightButtonClick(view: View){
        val leftButton = findViewById<Button>(R.id.leftbutton)
        val rightButton = findViewById<Button>(R.id.rightbutton)
        val leftNum= leftButton.text.toString().toInt()
        val rightNum = rightButton.text.toString().toInt()
        if(leftNum < rightNum){
            points++
        } else {
            points--
        }
        findViewById<TextView>(R.id.points).text = "Points: $points"
        pickRandomNumbers()

    }


    //function to start the buttons with random numbers
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
