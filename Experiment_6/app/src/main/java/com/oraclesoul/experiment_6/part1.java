package com.oraclesoul.experiment_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class part1 extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part1);

        listView = findViewById(R.id.list);
        String[] india_states = getResources().getStringArray(R.array.india_states);
        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<String>(part1.this,R.layout.listitem ,india_states);
        listView.setAdapter(arrayAdapter);
    }
}