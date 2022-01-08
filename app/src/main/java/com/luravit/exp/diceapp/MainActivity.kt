package com.luravit.exp.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var randomNumberTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomNumberTv = findViewById(R.id.randomNum)

        val rollButton = findViewById<Button>(R.id.btnRoll)

        rollButton.setOnClickListener() {
            rollDice()
        }

    }
    var counter = 0
    fun rollDice() {

        val randomNumber = (1..6).random()
        randomNumberTv.text = randomNumber.toString()
    }

}

