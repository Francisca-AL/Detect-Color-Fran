package com.example.detectcolor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Tutoriel3 extends AppCompatActivity {

    private ImageButton suivant_bouton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoriel3);
        getSupportActionBar().hide();

        this.suivant_bouton3 =  (ImageButton) findViewById(R.id.ButtonSuivant3);

        suivant_bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity4 = new Intent(Tutoriel3.this, MainActivity.class);
                startActivity(activity4);


            }
        });




    }
}