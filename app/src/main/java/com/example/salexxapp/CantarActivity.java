package com.example.salexxapp;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.salexxapp.ui.main.SectionsPagerAdapter;
import com.example.salexxapp.databinding.ActivityCantar3Binding;

public class CantarActivity extends AppCompatActivity {
    Button btn_K_50Cent;
    Button btn_Guns;
    Button btn_TheBeatles;
    Button btn_Queen;
    Button btn_Cold;
    Button btn_BM;

    private ActivityCantar3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCantar3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

//btn 50 cent
        btn_K_50Cent=(Button)findViewById(R.id.btn_K_50Cent);
        btn_K_50Cent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_K_50Cent = new Intent(CantarActivity.this, Cent.class);
                startActivity(btn_K_50Cent);
            }
        });


        //btn GUNS ROSES
        btn_Guns=(Button)findViewById(R.id.btn_Guns);
        btn_Guns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Guns = new Intent(CantarActivity.this, GunsRoses.class);
                startActivity(btn_Guns);
            }
        });
        //btn_TheBeatles
        btn_TheBeatles=(Button)findViewById(R.id.btn_TheBeatles);
        btn_TheBeatles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_TheBeatles = new Intent(CantarActivity.this, TheBeatles.class);
                startActivity(btn_TheBeatles);
            }
        });
        //btn_Queen
        btn_Queen=(Button)findViewById(R.id.btn_Queen);
        btn_Queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Queen = new Intent(CantarActivity.this, QUEEN.class);
                startActivity(btn_Queen);
            }
        });
//btn_Cold

        btn_Cold=(Button)findViewById(R.id.btn_Cold);
        btn_Cold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Cold = new Intent(CantarActivity.this, ColdPlay.class);
                startActivity(btn_Cold);
            }
        });
        //Button btn_BM;
        btn_BM=(Button)findViewById(R.id.btn_BM);
        btn_BM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_BM = new Intent(CantarActivity.this, BrunoMars.class);
                startActivity(btn_BM);
            }
        });
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}