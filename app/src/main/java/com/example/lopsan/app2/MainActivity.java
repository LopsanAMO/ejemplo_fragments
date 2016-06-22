package com.example.lopsan.app2;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.lopsan.app2.fragments.HorizontalTrueFragment;
import com.example.lopsan.app2.fragments.VerticalTrueFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Configuration confi = getResources().getConfiguration();
        if(confi.orientation == Configuration.ORIENTATION_PORTRAIT){
            ft.replace(android.R.id.content, new VerticalTrueFragment());
        }
        else{
            ft.replace(android.R.id.content, new HorizontalTrueFragment());
        }

        ft.commit();
    }
}
