package com.bookfinder.bookfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class postandadd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postandadd);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
