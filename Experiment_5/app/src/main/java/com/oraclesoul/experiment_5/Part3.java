package com.oraclesoul.experiment_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Part3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part3);

        // event handler
        Button btn = (Button) findViewById(R.id.rollDice);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tv = (TextView) findViewById(R.id.generatednum);
                int ranNum = (int)(Math.random()*10)%6 + 1;
                tv.setText(String.valueOf(ranNum));
            }
        });

    }

////     onclick
//    public void generateRandomNum(View view)
//    {
//        TextView tv = (TextView) findViewById(R.id.generatednum);
//        int ranNum = (int)(Math.random()*10)%6 + 1;
//        tv.setText(String.valueOf(ranNum));
//    }

}