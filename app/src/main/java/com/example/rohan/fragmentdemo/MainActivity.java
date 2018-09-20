package com.example.rohan.fragmentdemo;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity  extends FragmentActivity implements
       Fragment1.OneFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.two_fragments, menu);
        return true;
    }
    @Override
    public void onButtonClick(String text) {
        Fragment2 textFragment = (Fragment2) getSupportFragmentManager()
                .findFragmentById(R.id.two_fragment);
        textFragment.changeTextProperties(text);
    }
        }