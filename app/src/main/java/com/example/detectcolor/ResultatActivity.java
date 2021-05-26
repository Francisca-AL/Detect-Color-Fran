package com.example.detectcolor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultatActivity extends AppCompatActivity {

    private ImageButton infoCouleur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultat);

        this.infoCouleur = (ImageButton)findViewById(R.id.infoCouleur);

        infoCouleur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), EcranInfoCouleurs.class);
                startActivity(otherActivity);
                finish();
            }
        });

    }
}