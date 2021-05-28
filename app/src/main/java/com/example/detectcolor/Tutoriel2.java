package com.example.detectcolor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tutoriel2 extends AppCompatActivity {

    private ImageButton suivant_bouton2;
    private Button passer_bouton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoriel2);
        getSupportActionBar().hide();


        this.suivant_bouton2 =  (ImageButton) findViewById(R.id.ButtonSuivant2);
        this.passer_bouton2 =  findViewById(R.id.passer2);

        suivant_bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity4 = new Intent(Tutoriel2.this, Tutoriel3.class);
                startActivity(activity4);
                finish();


            }
        });

        passer_bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity5 = new Intent(Tutoriel2.this, MainActivity.class);
                startActivity(activity5);
            }

        });


    }
}