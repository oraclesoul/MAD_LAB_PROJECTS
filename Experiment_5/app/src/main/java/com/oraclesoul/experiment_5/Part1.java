package com.oraclesoul.experiment_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Part1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part1);
    }




    public  void addition(View view)
    {
        TextView  res = findViewById(R.id.result);
         double num1 = Double.parseDouble(((EditText)findViewById(R.id.num1)).getText().toString());
         double num2 = Double.parseDouble(((EditText)findViewById(R.id.num2)).getText().toString());
        double result = num1 + num2;
        res.setText(String.valueOf(result));
    }

     public  void subtraction(View view)
    {
         TextView  res = findViewById(R.id.result);
         double num1 = Double.parseDouble(((EditText)findViewById(R.id.num1)).getText().toString());
         double num2 = Double.parseDouble(((EditText)findViewById(R.id.num2)).getText().toString());
        double result = num1 - num2;
        res.setText(String.valueOf(result));
    }

     public  void multiply(View view)
    {
        TextView  res = findViewById(R.id.result);
         double num1 = Double.parseDouble(((EditText)findViewById(R.id.num1)).getText().toString());
         double num2 = Double.parseDouble(((EditText)findViewById(R.id.num2)).getText().toString());
        double result = num1 * num2;
        res.setText(String.valueOf(result));
    }

     public  void divide(View view)
    {
        TextView  res = findViewById(R.id.result);
         double num1 = Double.parseDouble(((EditText)findViewById(R.id.num1)).getText().toString());
         double num2 = Double.parseDouble(((EditText)findViewById(R.id.num2)).getText().toString());
        double result = num1 / num2;
        res.setText(String.valueOf(result));
    }


}