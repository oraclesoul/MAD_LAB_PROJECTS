package com.oraclesoul.experiment_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Part2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);

        List<String> sizes =  new ArrayList<String>();

        sizes.add("L");
        sizes.add("XL");
        sizes.add("XXL");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,sizes);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(dataAdapter);


        Button btn = (Button) findViewById(R.id.submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RadioGroup rg = (RadioGroup) findViewById(R.id.gender);
                String gender = ((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText().toString();

                String size = ((Spinner)findViewById(R.id.spinner)).getSelectedItem().toString();
                double height = Double.parseDouble(((EditText)findViewById(R.id.height)).getText().toString());
                int price = 0;
                if(gender.equals("Male"))
                {
                    switch (size.length())
                    {
                        case 1:price=300; break;
                        case 2:price=400; break;
                        default: price=500; break;
                    }
                }else
                {
                    switch (size.length())
                    {
                        case 1:price=500; break;
                        case 2:price=700; break;
                        default: price=900; break;
                    }
                }
                double amount = price * height;
                TextView tv = (TextView) findViewById(R.id.price);
                tv.setText(String.valueOf(amount));
            }
        });
        {

        }

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}