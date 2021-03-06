package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton : Button= findViewById(R.id.roll_button)
        rollbutton.setOnClickListener{
            Toast.makeText(this,"button clicked!",Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {

        val diceimage: ImageView=findViewById(R.id.dice_image)
        val dis_text: TextView=findViewById(R.id.val_display)
        val randomInt =(1..6).random()
        when(randomInt){
            6 ->dis_text.text="WOW 6!"
            else -> dis_text.text=randomInt.toString()
        }
        val random_resource =when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        diceimage.setImageResource(random_resource)

    }


}