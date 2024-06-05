package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class verbos extends AppCompatActivity {


    private Button _btnPDF,btnQuizVERB;
    String _url = "https://drive.google.com/file/d/1yWj5Qz6qZ7U_qiSnogFL8iMDfvfB3A-2/view";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbos2);
        //borrar el nombre de la clase
        getActionBar().hide();

        //btn para generar pdf
        _btnPDF = findViewById(R.id.btnPDF);
        _btnPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(_url);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);

            }
        });
        //btnQuizVERB
        btnQuizVERB=(Button)findViewById(R.id.btnQuizVERB);
        btnQuizVERB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btnQuizVERB = new Intent(verbos.this, gameVerb.class);
                startActivity(btnQuizVERB);
            }
        });


    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}
