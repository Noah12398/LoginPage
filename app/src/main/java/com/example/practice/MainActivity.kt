package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var Login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the Login button
        Login = findViewById<Button>(R.id.button)
        val context = this

        // Set an OnClickListener on the Login button
        Login.setOnClickListener {
            val intent = Intent(context, Second::class.java)
            context.startActivity(intent) // Start the Second activity
        }
    }
}
