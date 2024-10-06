package com.example.practice

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var videoView: VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message2=intent.getStringExtra("Extra")
        // Initialize the TextView
        textView = findViewById(R.id.loggedin)
        button= findViewById(R.id.button2)
        videoView = findViewById(R.id.videoView)
        // Set the message to the TextView
        val message = "You are Logged in: $message2"
        textView.text = message
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent) // Start the Second activity
        }
        val videopath="android.resource://"+packageName+"/"+R.raw.rickroll
        val uri= Uri.parse(videopath)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
        videoView.setOnPreparedListener { mediaPlayer: MediaPlayer ->
            mediaPlayer.isLooping = true  // Optional: Loop the video
            videoView.start()              // Start the video with sound
        }
    }
}

