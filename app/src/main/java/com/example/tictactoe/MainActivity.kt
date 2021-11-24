package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var pirveli: EditText
    private lateinit var meore: EditText
    private lateinit var start: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val player1 = intent?.extras?.getString("pirveli", "Player One:")
        val player2 = intent?.extras?.getString("pirveli", "Player Two:")


        pirveli = findViewById(R.id.pirveli)
        meore = findViewById(R.id.meore)
        start = findViewById(R.id.start)



        start.setOnClickListener {

            val pirveli : String = pirveli.text.toString()
            val meore : String = meore.text.toString()


            val intent = Intent(this, MainActivity2::class.java  )
            intent.putExtra("NAME", pirveli)
            intent.putExtra("NAME", meore)
            startActivity(intent)

        }

    }




}