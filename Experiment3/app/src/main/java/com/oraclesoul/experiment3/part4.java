package com.oraclesoul.experiment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class part4 extends AppCompatActivity {

    GridView grid;

    int[] icons =
            {
                    R.drawable.a,
                    R.drawable.b,
                    R.drawable.c,
                    R.drawable.d,
                    R.drawable.e,
                    R.drawable.f,
                    R.drawable.g,
                    R.drawable.h,
                    R.drawable.i
            };

    String[] name = {"HTML","JAVA","JSP","PHP","PYTHON","SQL","ANDROID","ANGULAR","C++"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4);

        grid = (GridView) findViewById(R.id.datagrid);
        grid.setAdapter(new gridAdapter( name,icons , getApplicationContext()));
    }
}