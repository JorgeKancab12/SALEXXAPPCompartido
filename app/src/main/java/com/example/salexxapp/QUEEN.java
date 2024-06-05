package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QUEEN extends AppCompatActivity {
    Button btn_BF;
    Button btn_TL;
    Button btn_MN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queen);
        //btn_BF
        btn_BF=(Button)findViewById(R.id.btn_BF);
        btn_BF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_BF = new Intent(QUEEN.this, BreakFree.class);
                startActivity(btn_BF);
            }
        });

        //btn_TL

        btn_TL=(Button)findViewById(R.id.btn_TL);
        btn_TL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_TL = new Intent(QUEEN.this, ToLove.class);
                startActivity(btn_TL);
            }
        });


        //btn_MN
        btn_MN=(Button)findViewById(R.id.btn_MN);
        btn_MN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_MN = new Intent(QUEEN.this, MeNow.class);
                startActivity(btn_MN);
            }
        });
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}