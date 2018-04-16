package com.example.helen.sharcandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;

public class SharkRecords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shark_records);
        setTitle("Animal Records");
    }

    public void addAnimal(View view)
    {
        //add pop-up for adding animals
        TextView add = (TextView)findViewById(R.id.clickadd);
        add.setVisibility(view.VISIBLE);

        startActivity(new Intent(SharkRecords.this, pop.class));
    }

    public void submitRecord(View view)
    {
        //add pop-up for adding animals
        TextView add = (TextView)findViewById(R.id.clicksubmit);
        add.setVisibility(view.VISIBLE);
    }

}
