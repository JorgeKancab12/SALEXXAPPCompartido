package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VocabularyActivity extends AppCompatActivity {
    Button btn_verb;
    Button btn_adjetives;
    Button btn_com;
    Button btn_cond;
    Button btn_ToBe;
    Button btn_pron;
    Button btn_Conectors;
    Button btn_ModalVerbs;
    Button btn_auxliars;
    Button btn_PresentCont;
    Button btn_PresentPerf;
    Button btn_gerundio;
    Button btn_superlatives;
    Button btn_relativepronouns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);
        //btn_verb
        btn_verb=(Button)findViewById(R.id.btn_verb);
        btn_verb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_verb = new Intent(VocabularyActivity.this, verbos.class);
                startActivity(btn_verb);
            }
        });
// btn_adjetives
        btn_adjetives=(Button)findViewById(R.id.btn_adjetives);
        btn_adjetives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_adjetives = new Intent(VocabularyActivity.this, adjetivos.class);
                startActivity(btn_adjetives);
            }
        });
        //btn_com
        btn_com=(Button)findViewById(R.id.btn_com);
        btn_com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_com = new Intent(VocabularyActivity.this, comparatives.class);
                startActivity(btn_com);
            }
        });

        //btn_cond
        btn_cond=(Button)findViewById(R.id.btn_cond);
        btn_cond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_cond = new Intent(VocabularyActivity.this, conditionals.class);
                startActivity(btn_cond);
            }
        });
        //btn_ToBe
        btn_ToBe=(Button)findViewById(R.id.btn_ToBe);
        btn_ToBe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_ToBe = new Intent(VocabularyActivity.this, VerbToB.class);
                startActivity(btn_ToBe);
            }
        });

        //btn_pron
        btn_pron=(Button)findViewById(R.id.btn_pron);
        btn_pron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_pron = new Intent(VocabularyActivity.this, Pronouns.class);
                startActivity(btn_pron);
            }
        });

        //btn_Conectors
        btn_Conectors=(Button)findViewById(R.id.btn_Conectors);
        btn_Conectors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Conectors = new Intent(VocabularyActivity.this, ConectorsG.class);
                startActivity(btn_Conectors);
            }
        });

         //btn_ModalVerbs
        btn_ModalVerbs=(Button)findViewById(R.id.btn_ModalVerbs);
        btn_ModalVerbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_ModalVerbs = new Intent(VocabularyActivity.this, ModalVerbsG.class);
                startActivity(btn_ModalVerbs);
            }
        });
        //btn_auxliars
        btn_auxliars=(Button)findViewById(R.id.btn_auxliars);
        btn_auxliars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_auxliars = new Intent(VocabularyActivity.this, AuxiliarsG.class);
                startActivity(btn_auxliars);
            }
        });
        //btn_PresentCont
        btn_PresentCont=(Button)findViewById(R.id.btn_PresentCont);
        btn_PresentCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_PresentCont = new Intent(VocabularyActivity.this, PresContG.class);
                startActivity(btn_PresentCont);
            }
        });
        //btn_PresentPerf
        btn_PresentPerf=(Button)findViewById(R.id.btn_PresentPerf);
        btn_PresentPerf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_PresentPerf = new Intent(VocabularyActivity.this, PresPerfG.class);
                startActivity(btn_PresentPerf);
            }
        });
        //btn_gerundio
        btn_gerundio=(Button)findViewById(R.id.btn_gerundio);
        btn_gerundio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_gerundio = new Intent(VocabularyActivity.this, GramGerundio.class);
                startActivity(btn_gerundio);
            }
        });
        //btn_superlatives
        btn_superlatives=(Button)findViewById(R.id.btn_superlatives);
        btn_superlatives.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_superlatives = new Intent(VocabularyActivity.this, Superlatives.class);
                startActivity(btn_superlatives);
            }
        });
        //btn_relativepronouns
        btn_relativepronouns=(Button)findViewById(R.id.btn_relativepronouns);
        btn_relativepronouns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_relativepronouns = new Intent(VocabularyActivity.this, GramRelativePronouns.class);
                startActivity(btn_relativepronouns);
            }
        });
    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}