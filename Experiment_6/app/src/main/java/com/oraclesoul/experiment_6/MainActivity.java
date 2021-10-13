package com.oraclesoul.experiment_6;

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
     public  void lauchpart1(View view){
        Intent part1Intent = new Intent(getApplicationContext(),part1.class);
        startActivity(part1Intent);
    }

    public  void lauchpart2(View view){
        Intent part2Intent = new Intent(getApplicationContext(),part2.class);
        startActivity(part2Intent);
    }
    public  void lauchpart3(View view){
        Intent part3Intent = new Intent(getApplicationContext(),part3.class);
        startActivity(part3Intent);
    }
    public  void lauchpart4(View view){
        Intent part4Intent = new Intent(getApplicationContext(),part4.class);
        startActivity(part4Intent);
    }
}