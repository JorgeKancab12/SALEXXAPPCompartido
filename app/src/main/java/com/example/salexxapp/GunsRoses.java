package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GunsRoses extends AppCompatActivity {
    Button btn_November;
    Button btn_Cry;
    Button btn_Paradise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guns_roses);

        //btn_November
        btn_November=(Button)findViewById(R.id.btn_November);
        btn_November.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_November = new Intent(GunsRoses.this, November.class);
                startActivity(btn_November);
            }
        });

        //btn_Cry

        btn_Cry=(Button)findViewById(R.id.btn_Cry);
        btn_Cry.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                Intent btn_Cry = new Intent(GunsRoses.this, GunsCry.class);
                startActivity(btn_Cry);
            }
        });


        //btn_Paradise
        btn_Paradise=(Button)findViewById(R.id.btn_Paradise);
        btn_Paradise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Paradise = new Intent(GunsRoses.this, GunsParadise.class);
                startActivity(btn_Paradise);
            }
        });
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}