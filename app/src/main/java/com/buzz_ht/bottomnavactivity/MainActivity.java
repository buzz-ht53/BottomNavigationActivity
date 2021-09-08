package com.buzz_ht.bottomnavactivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.buzz_ht.bottomnavactivity.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = new Fragment();

                switch (item.getItemId()) {
                    case R.id.nav1:
                        selectedFragment = new Fragment1();
                        break;
                    case R.id.nav2:
                        selectedFragment = new Fragement2();
                        break;
                    case R.id.nav3:
                        selectedFragment = new Fragment3();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.ll, selectedFragment).commit();


                return true;
            }
        });


    }

}