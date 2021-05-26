package com.example.detectcolor;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class EcranInfoCouleurs extends AppCompatActivity {

    private ImageButton retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran_info_couleurs);

        this.retour = (ImageButton)findViewById(R.id.BoutonRetour);

       retour.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent otherActivity = new Intent(getApplicationContext(), ResultatActivity.class);
               startActivity(otherActivity);
               finish();
           }
       });
    }
}