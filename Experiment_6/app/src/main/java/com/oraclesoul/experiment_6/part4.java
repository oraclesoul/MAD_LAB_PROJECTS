package com.oraclesoul.experiment_6;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class part4 extends AppCompatActivity {

    String[] countries = {"Australia","China","France","India","Malaysia","United-Kingdom","United-States"};
    String[] capitals = {"Canberra","Beijing","Paris","Delhi","Kuala Lumpur","London","Washington, D.C."};
    int[] flags = {R.drawable.australia,R.drawable.china,R.drawable.france,R.drawable.india,R.drawable.malaysia,R.drawable.united_kingdom,R.drawable.united_states};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_part4);

        customAdapter_part4 customAdapter = new customAdapter_part4(part4.this, countries, capitals, flags);
        ListView listView = findViewById(R.id.part4list);

        listView.setAdapter(customAdapter);

    }
}