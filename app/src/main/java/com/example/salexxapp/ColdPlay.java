package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColdPlay extends AppCompatActivity {
    Button btn_Yellow;
    Button btn_VLV;
    Button btn_FY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold_play);
        //btn_Yellow
        btn_Yellow=(Button)findViewById(R.id.btn_Yellow);
        btn_Yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Yellow = new Intent(ColdPlay.this, Yellow.class);
                startActivity(btn_Yellow);
            }
        });
        //btn_VLV
        btn_VLV=(Button)findViewById(R.id.btn_VLV);
        btn_VLV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_VLV = new Intent(ColdPlay.this, ViveLaVida.class);
                startActivity(btn_VLV);
            }
        });
        //btn_FY
        btn_FY=(Button)findViewById(R.id.btn_FY);
        btn_FY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_FY = new Intent(ColdPlay.this, FixYou.class);
                startActivity(btn_FY);
            }
        });
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}