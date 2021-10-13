package com.oraclesoul.experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }
    public void launchPart1(View view)
    {
        Intent part1Intent = new Intent(getApplicationContext(),part1.class);
        startActivity(part1Intent);
    }

    public void launchPart2(View view)
    {
        Intent part2Intent = new Intent(getApplicationContext(),part2.class);
        startActivity(part2Intent);
    }
    public void launchPart3(View view)
    {
        Intent part3Intent = new Intent(getApplicationContext(),part3.class);
        startActivity(part3Intent);
    }

    public void launchPart4(View view)
    {
        Intent part4Intent = new Intent(getApplicationContext(),part4.class);
        startActivity(part4Intent);
    }
    public void launchPart5(View view)
    {
        Intent part5Intent = new Intent(getApplicationContext(),part5.class);
        startActivity(part5Intent);
    }

}