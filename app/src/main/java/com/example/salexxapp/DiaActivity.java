package com.example.salexxapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DiaActivity extends AppCompatActivity {

    ImageView ivRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia);
    }

    public void startGame(View view) {
        // In startGame() method, create an Intent to launch StartGame Activity
        Intent intent = new Intent(DiaActivity.this, StartGame.class);
        startActivity(intent);
        // Finish MainActivity
        finish();
    }
    public void gamePark(View view) {
        // In startGame() method, create an Intent to launch StartGame Activity
        Intent intent = new Intent(DiaActivity.this, gamePark.class);
        startActivity(intent);
        // Finish MainActivity
        finish();
    }

    public void gameSchool(View view) {
        // In startGame() method, create an Intent to launch StartGame Activity
        Intent intent = new Intent(DiaActivity.this, gameSchool.class);
        startActivity(intent);
        // Finish MainActivity
        finish();
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}