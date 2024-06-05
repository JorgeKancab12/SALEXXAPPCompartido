package com.example.salexxapp;

import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class comparatives extends AppCompatActivity {
    private Button _btnPDF;
    String _url = "https://drive.google.com/file/d/1ZrLnSmdxl1hVd8emsKv2p9GelOhjOiM7/view?usp=sharing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparatives);

        _btnPDF = findViewById(R.id.btnPDF);
        _btnPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);

            }
        });
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}

