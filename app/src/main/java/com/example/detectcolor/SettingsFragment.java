package com.example.detectcolor;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;



public class SettingsFragment extends Fragment {

    private ImageButton tuto_bouton;
    private ImageButton modeAff_bouton;
    private ImageButton apropos_bouton;

    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_settings, container, false);


        tuto_bouton = view.findViewById(R.id.tuto_bouton);
        modeAff_bouton = view.findViewById(R.id.ModeAffi);
        apropos_bouton= view.findViewById(R.id.Apropos);

        tuto_bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity1 = new Intent(getActivity(), Tutoriel.class);
                startActivity(activity1);


            }
        });

        modeAff_bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity2 = new Intent(getActivity(), ModeAffichage.class);
                startActivity(activity2);
            }
        });

        apropos_bouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity3 = new Intent(getActivity(), Apropos.class);
                startActivity(activity3);
            }
        });


        return view;





    }


}
