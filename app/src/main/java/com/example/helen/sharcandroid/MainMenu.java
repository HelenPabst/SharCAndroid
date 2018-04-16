package com.example.helen.sharcandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        setTitle("Main Menu");
    }

    //Called when user taps "Start Sighting"
    public void start(View view)
    {
        Intent intent = new Intent(this, SharkRecords.class);
        startActivity(intent);
    }
}
