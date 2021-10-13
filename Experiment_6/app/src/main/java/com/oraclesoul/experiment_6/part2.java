package com.oraclesoul.experiment_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class part2 extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);

        listView = findViewById(R.id.part2list);
        String[] androidVersions = getResources().getStringArray(R.array.androidVersions);
        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(part2.this,R.layout.listitem,androidVersions);
        listView.setAdapter(arrayAdapter);
    }
}