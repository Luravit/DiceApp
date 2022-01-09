package com.luravit.exp.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var diceOneImg : ImageView
    lateinit var diceTwoImg : ImageView
    lateinit var diceThreeImg : ImageView
    lateinit var diceFourImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceOneImg = findViewById(R.id.img_dice1)
        diceTwoImg = findViewById(R.id.img_dice2)
        diceThreeImg = findViewById(R.id.img_dice3)
        diceFourImg = findViewById(R.id.img_dice4)

        val rollButton = findViewById<Button>(R.id.btnRoll)

        rollButton.setOnClickListener() {
            rollDice()
        }

    }
    fun rollDice() {

        val randomNumber1 = (1..6).random()
        val randomNumber2 = (1..6).random()
        val randomNumber3 = (1..6).random()
        val randomNumber4 = (1..6).random()


        val imageRandom1 = when(randomNumber1) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
        else -> R.drawable.dice_empty
        }

        val imageRandom2 = when(randomNumber2) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
        else -> R.drawable.dice_empty
        }


        val imageRandom3 = when(randomNumber3) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
        else -> R.drawable.dice_empty
        }


        val imageRandom4 = when(randomNumber4) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
        else -> R.drawable.dice_empty
        }


diceOneImg.setImageResource(imageRandom1)
diceTwoImg.setImageResource(imageRandom2)
diceThreeImg.setImageResource(imageRandom3)
diceFourImg.setImageResource(imageRandom4)
    }

}

