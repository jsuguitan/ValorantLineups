package com.example.valorantlineups

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class StartScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_screen)


            val button = findViewById<Button>(R.id.map_button)
            button.setOnClickListener{
                val intent = Intent(this, MapSelectionScreen::class.java)
                startActivity(intent)
            }
        }

    }
}