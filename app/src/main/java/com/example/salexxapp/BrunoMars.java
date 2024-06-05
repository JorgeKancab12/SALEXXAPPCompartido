package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BrunoMars extends AppCompatActivity {
    Button btn_TLZ;
    Button btn_Heaven;
    Button btn_Marry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bruno_mars);

        //btn_TLZ
        btn_TLZ = (Button) findViewById(R.id.btn_TLZ);
        btn_TLZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_TLZ = new Intent(BrunoMars.this, BMLazy.class);
                startActivity(btn_TLZ);
            }
        });

        //btn_Heaven
        btn_Heaven = (Button) findViewById(R.id.btn_Heaven);
        btn_Heaven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Heaven = new Intent(BrunoMars.this, BMLocked.class);
                startActivity(btn_Heaven);
            }
        });

        //btn_Marry
        btn_Marry = (Button) findViewById(R.id.btn_Marry);
        btn_Marry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Marry = new Intent(BrunoMars.this, BMMarryYou.class);
                startActivity(btn_Marry);
            }
        });
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}