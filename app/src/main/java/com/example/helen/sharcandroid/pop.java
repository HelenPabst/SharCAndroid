package com.example.helen.sharcandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Helen on 4/7/2018.
 */

public class pop extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int) (height*.6));
    }

    public void closeWindow(View view)
    {
        //TODO: close popup and add animal to records
    }

    public void cancelAdd(View view)
    {
        //TODO: cancel adding an animal
    }

    public void addMore(View view)
    {
        //TODO: add another animal
    }

    public void addToList(View view)
    {
        //TODO: Add an animal to the list

        /*
        TextView addAnimal = (TextView)findViewById(R.id.addAnimal);
        addAnimal.setVisibility(view.VISIBLE);

        Intent intent = new Intent(pop.this, SharkRecords.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        */
    }

}
