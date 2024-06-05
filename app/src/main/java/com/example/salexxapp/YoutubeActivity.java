package com.example.salexxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YoutubeActivity extends AppCompatActivity {
    Button btn_ing;
    Button btn_ToBe;
    Button btb_adj;
    Button btn_SigYou;
    Button btn_aux;
    Button btn_conec;
    Button btn_verbs, btn_superAndComp,btn_Cond, btn_Pronoun,btn_Modal,btn_PresntCont, btn_PresntPerfect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        //btn_PresntCont
        btn_PresntCont=(Button)findViewById(R.id.btn_PresntCont);
        btn_PresntCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_PresntCont = new Intent(YoutubeActivity.this, YouTubePresentCont.class);
                startActivity(btn_PresntCont);
            }
        });
        //btn_PresntPerfect
        btn_PresntPerfect=(Button)findViewById(R.id.btn_PresntPerfect);
        btn_PresntPerfect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_PresntPerfect = new Intent(YoutubeActivity.this, YouTubePresentPerfect.class);
                startActivity(btn_PresntPerfect);
            }
        });
        //btn_Modal
        btn_Modal=(Button)findViewById(R.id.btn_Modal);
        btn_Modal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Modal = new Intent(YoutubeActivity.this, YouTubeModalVerbs.class);
                startActivity(btn_Modal);
            }
        });
        //btn_Pronoun
        btn_Pronoun=(Button)findViewById(R.id.btn_Pronoun);
        btn_Pronoun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Pronoun = new Intent(YoutubeActivity.this, YouTubePronouns.class);
                startActivity(btn_Pronoun);
            }
        });
        //btn_Cond
        btn_Cond=(Button)findViewById(R.id.btn_Cond);
        btn_Cond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_Cond = new Intent(YoutubeActivity.this, YouTubeConditionals.class);
                startActivity(btn_Cond);
            }
        });
        //btn_superAndComp
        btn_superAndComp=(Button)findViewById(R.id.btn_superAndComp);
        btn_superAndComp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_superAndComp = new Intent(YoutubeActivity.this, YouTubeSuperAndComp.class);
                startActivity(btn_superAndComp);
            }
        });

        //btn_verbs
        btn_verbs=(Button)findViewById(R.id.btn_verbs);
        btn_verbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_verbs = new Intent(YoutubeActivity.this, YouTubeVerb.class);
                startActivity(btn_verbs);
            }
        });
        //btn_ing
        btn_ing=(Button)findViewById(R.id.btn_ing);
        btn_ing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_ing = new Intent(YoutubeActivity.this, Gerundio.class);
                startActivity(btn_ing);
            }
        });
        //btn_SigYou

        btn_SigYou=(Button)findViewById(R.id.btn_SigYou);
        btn_SigYou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_SigYou = new Intent(YoutubeActivity.this, YouTube2.class);
                startActivity(btn_SigYou);
            }
        });

        btn_ToBe=(Button)findViewById(R.id.btn_ToBe);
        btn_ToBe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_ToBe = new Intent(YoutubeActivity.this, VerbToBe.class);
                startActivity(btn_ToBe);
            }
        });

        btb_adj=(Button)findViewById(R.id.btb_adj);
        btb_adj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_adj = new Intent(YoutubeActivity.this, adjetives.class);
                startActivity(btn_adj);
            }
        });

        btn_aux=(Button)findViewById(R.id.btn_aux);
        btn_aux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_aux = new Intent(YoutubeActivity.this, Auxiliars.class);
                startActivity(btn_aux);
            }
        });

    btn_conec=(Button)findViewById(R.id.btn_conec);
        btn_conec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn_conec = new Intent(YoutubeActivity.this,Conectors.class);
                startActivity(btn_conec);
            }
        });


    }
    public void exit(View view) {
        // Call finish() method to finish GameOver Activity
        finish();
    }
}