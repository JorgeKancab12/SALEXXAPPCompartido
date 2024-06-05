package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YouTube2 extends AppCompatActivity {
    Button btn_RP,btn_sup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube2);
        //btn_RP
        btn_RP=(Button)findViewById(R.id.btn_RP);
        btn_RP.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_RP = new Intent(YouTube2.this, RelativePronoun.class);
                startActivity(btn_RP);
            }
        });

        //btn_sup
        btn_sup=(Button)findViewById(R.id.btn_sup);
        btn_sup.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_sup = new Intent(YouTube2.this, Superlativos.class);
                startActivity(btn_sup);
            }
        });

    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}