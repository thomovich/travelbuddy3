package com.example.travelbuddy3.Main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.travelbuddy3.R;
import com.example.travelbuddy3.View.MapFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    private ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fragmenthandler("MapFragment");
        setContentView(R.layout.activity_main);
        chipNavigationBar = findViewById(R.id.bottom_nav_menu);
        bottomMenu();

    }

    void Fragmenthandler(String fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        String classpath = "com.example.travelbuddy3.View." + fragment;
        try {
            Class<?> cls = Class.forName(classpath);
            fragmentManager.beginTransaction().setReorderingAllowed(true).replace(R.id.fragment_container, (Class<? extends Fragment>) cls,null).commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void bottomMenu() {

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {


                try {
                    switch (i) {
                        case R.id.HomeFragment:
                            Fragmenthandler("HomeFragment");
                            break;
                        case R.id.MapFragment:
                            Fragmenthandler("MapFragment");
                            break;
                        case R.id.AboutFragment:
                            Fragmenthandler("AboutFragment");
                            break;
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }


            }
        });
    }
}