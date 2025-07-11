package com.example.preworkhelloworld

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var switchImg: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        changeNuggetImg()
        val button = findViewById<Button>(R.id.helloButton)
        setupButton(button)
    }


    private fun setupButton(button: Button) {
        button.setOnClickListener {
            Toast.makeText(this, "Hello back!", Toast.LENGTH_SHORT).show()
            Log.v("Hello World", "Button Clicked!")

            if (switchImg) {
                changeNuggetImg()
                switchImg = false
            } else {
                changeNuggetImgBack()
                switchImg = true

            }
        }
    }

    private fun changeNuggetImg() {
        val imageView = findViewById<ImageView>(R.id.nuggetImg)
        imageView.setImageResource(R.drawable.ls20250710204245)

    }

    private fun changeNuggetImgBack() {
        val imageView = findViewById<ImageView>(R.id.nuggetImg)
        imageView.setImageResource(R.drawable.img_20250710_203847)

    }
}