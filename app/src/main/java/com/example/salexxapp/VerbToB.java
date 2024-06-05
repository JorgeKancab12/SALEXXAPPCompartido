package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerbToB extends AppCompatActivity {
    Button btnSIGUIENTE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verb_to_b);
        //btnSIGUIENTE
        btnSIGUIENTE = (Button) findViewById(R.id.btnSIGUIENTE);
        btnSIGUIENTE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnSIGUIENTE = new Intent(VerbToB.this, VerbTB2.class);
                startActivity(btnSIGUIENTE);
            }
        });

    }

    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}