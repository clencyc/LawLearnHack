package com.example.lawlearning.intents

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lawlearning.R
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView

class Intent_two : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent_two)

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars= insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize YouTubePlayerViews
        val youTubePlayerView: YouTubePlayerView = findViewById(R.id.youtube_player_view)
        val youTubePlayerView1: YouTubePlayerView = findViewById(R.id.youtube_player_view1)
        val youTubePlayerView2: YouTubePlayerView = findViewById(R.id.youtube_player_view2)

        // Add lifecycle observers for proper resource management
        lifecycle.addObserver(youTubePlayerView)
        lifecycle.addObserver(youTubePlayerView1)
        lifecycle.addObserver(youTubePlayerView2)

        // Load videos into each player
        val videoId = "TafvHxXFzUM" // Use a constant for the video ID
        val startSeconds = 30f // Use a constant for the start time

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(videoId, startSeconds)
            }
        })

        youTubePlayerView1.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(videoId, startSeconds)
            }
        })

        youTubePlayerView2.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(videoId, startSeconds)
            }
        })
    }
}