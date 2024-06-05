package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

//importar para enlazar youtube

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class Questions_21 extends YouTubeBaseActivity {
    YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions21);
        youTubePlayerView = findViewById(R.id.youtube_player_view);

        YouTubePlayer.OnInitializedListener listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("GC3c8T54WxM");
                youTubePlayer.play();
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

                Toast.makeText(getApplicationContext(),
                        "Initialization Failed",
                        Toast.LENGTH_SHORT).show();
            }
        };
        youTubePlayerView.initialize("AIzaSyBg47ugKQImcKtEPdFf0K-RrJF4c34sboA",listener);
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}