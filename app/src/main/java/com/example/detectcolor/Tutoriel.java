package com.example.detectcolor;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Tutoriel extends AppCompatActivity {

    private ImageButton suivant_bouton1;
    private Button passer_bouton1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoriel);
        getSupportActionBar().hide();


        this.suivant_bouton1 =  (ImageButton) findViewById(R.id.ButtonSuivant);
        this.passer_bouton1 =  findViewById(R.id.passer);

        suivant_bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity4 = new Intent(Tutoriel.this, Tutoriel2.class);
                startActivity(activity4);
                finish();


            }
        });

        passer_bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity5 = new Intent(Tutoriel.this, MainActivity.class);
                startActivity(activity5);
            }

        });



    }


}

