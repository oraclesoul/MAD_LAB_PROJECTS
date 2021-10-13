package com.oraclesoul.experiment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Mylog", "onCreate: OnCreate called");
        Toast.makeText(this, "onCreate Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Mylog", "onStart: Onstart called");
        Toast.makeText(this, "onStart Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Mylog", "onPause: OnPause called");
        Toast.makeText(this, "onPause Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Mylog", "onResume: OnResume called");
        Toast.makeText(this, "onResume Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Mylog", "onRestart: OnRestart called");
        Toast.makeText(this, "onRestart Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Mylog", "onStop: OnStop called");
        Toast.makeText(this, "onStop Called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Mylog", "onDestroy: OnDestroy called");
        Toast.makeText(this, "onDestroy Called", Toast.LENGTH_SHORT).show();
    }

    public void launchActivity(View view)
    {
        Intent newActivityIntent = new Intent(getApplicationContext(),activity2.class);
        startActivity(newActivityIntent);
    }

}