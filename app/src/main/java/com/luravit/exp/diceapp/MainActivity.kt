package com.luravit.exp.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var diceOneImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceOneImg = findViewById(R.id.img_dice)

        val rollButton = findViewById<Button>(R.id.btnRoll)

        rollButton.setOnClickListener() {
            rollDice()
        }

    }
    fun rollDice() {

        val randomNumber = (1..6).random()

        val imageRandom = when(randomNumber) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
        else -> R.drawable.dice_empty
        }
diceOneImg.setImageResource(imageRandom)
    }

}

