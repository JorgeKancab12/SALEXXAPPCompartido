package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheBeatles extends AppCompatActivity {
    Button btn_HJ;
    Button btn_TB;
    Button btn_DBM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_beatles);

        //btn_HJ
        btn_HJ=(Button)findViewById(R.id.btn_HJ);
        btn_HJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_HJ = new Intent(TheBeatles.this, HeyJude.class);
                startActivity(btn_HJ);
            }
        });

        //btn_TB

        btn_TB=(Button)findViewById(R.id.btn_TB);
        btn_TB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_TB = new Intent(TheBeatles.this, ThisBoy.class);
                startActivity(btn_TB);
            }
        });


        //btn_DBM
        btn_DBM=(Button)findViewById(R.id.btn_DBM);
        btn_DBM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_DBM = new Intent(TheBeatles.this, DontBotherMe.class);
                startActivity(btn_DBM);
            }
        });
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }

}