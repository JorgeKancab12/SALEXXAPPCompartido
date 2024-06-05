package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.salexxapp.Fragments.inicioFragment;
import com.example.salexxapp.Interfaces.IComunicaFragment;

public class MainActivity extends AppCompatActivity implements IComunicaFragment, inicioFragment.OnFragmentInteractionListener{

    Fragment fragmentInicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentInicio=new inicioFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments, fragmentInicio).commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri){

    }

    @Override
    public void IniciarJuego() {

        Intent intent=new Intent(this, CantarActivity.class);
        startActivity(intent);
    }

    @Override
    public void IniciarYoutube() {
        Intent intent=new Intent(this, YoutubeActivity.class);
        startActivity(intent);
    }

    @Override
    public void IniciarDia() {
        Intent intent=new Intent(this, DiaActivity.class);
        startActivity(intent);
    }

    @Override
    public void IniciarVocabulario() {
        Intent intent=new Intent(this, VocabularyActivity.class);
        startActivity(intent);
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}