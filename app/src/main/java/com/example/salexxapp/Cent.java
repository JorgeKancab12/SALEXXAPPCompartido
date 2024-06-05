package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cent extends AppCompatActivity {
    Button btn_21Q;
    Button btn_Club;
    Button btn_Candy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cent);

        //btn21questions
        btn_21Q=(Button)findViewById(R.id.btn_21Q);
        btn_21Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_21Q = new Intent(Cent.this, Questions_21.class);
                startActivity(btn_21Q);
            }
        });

        //btnInDaClub

        btn_Club=(Button)findViewById(R.id.btn_Club);
        btn_Club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Club = new Intent(Cent.this, Club.class);
                startActivity(btn_Club);
            }
        });


        //btn_Candy
        btn_Candy=(Button)findViewById(R.id.btn_Candy);
        btn_Candy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Candy = new Intent(Cent.this, Candy.class);
                startActivity(btn_Candy);
            }
        });
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}