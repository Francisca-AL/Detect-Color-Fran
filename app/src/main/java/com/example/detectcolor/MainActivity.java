package com.example.detectcolor;

import android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.tittles);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Blue_AB)));



        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem Item) {
                    Fragment selectedFragment =  null;

                    switch (Item.getItemId()){
                        case R.id.nav_home :
                            selectedFragment = new HomeFragment() ;
                            break;

                        case R.id.nav_search :
                            selectedFragment = new SearchFragment();
                            getSupportActionBar().setCustomView(R.layout.param_actionbar);
                            break;

                        case R.id.nav_settings :
                            selectedFragment = new SettingsFragment();
                            getSupportActionBar().setCustomView(R.layout.settings_actionbar);
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();


                    return true;
                }
            };

}

/*
super. : permet de faire hériter du constructeur de la classe
donc ça passe les infos d'une classe à une autre

setContentView : permet d'afficher le design de l'app

*/