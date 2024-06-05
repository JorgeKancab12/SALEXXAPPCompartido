package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class conditionals2 extends AppCompatActivity {
    private Button _btnPDF;
    String _url = "https://drive.google.com/file/d/1622qJsm921Fw8VAQKZYNYsvNVPIA4XLl/view?usp=sharing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditionals2);

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
