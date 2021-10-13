package com.oraclesoul.experiment_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchPart1(View view)
    {
        Intent p1Intent = new Intent(getApplicationContext(),Part1.class);
        startActivity(p1Intent);
    }

    public void launchPart2(View view)
    {
        Intent p2Intent = new Intent(getApplicationContext(),Part2.class);
        startActivity(p2Intent);
    }

    public void launchPart3(View view)
    {
        Intent p3Intent = new Intent(getApplicationContext(),Part3.class);
        startActivity(p3Intent);
    }
}