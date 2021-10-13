package com.oraclesoul.experiment_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ListView;

public class part3 extends AppCompatActivity {

    String[] fruitsNames = {"Apple","banana","grapes","orange","stawberry","watermelon"};
    int[] imgs = {R.drawable.apple ,R.drawable.bananas , R.drawable.grapes , R.drawable.orange , R.drawable.strawberry , R.drawable.watermelon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3);

        customAdapter_part3 customAdapter = new customAdapter_part3(this,fruitsNames,imgs);
        ListView listView = findViewById(R.id.part3list);
        listView.setAdapter(customAdapter);
    }
}
