package com.oraclesoul.experiment_6;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class customAdapter_part3 extends ArrayAdapter<String> {
     Context context;
     String[] fruitNames;
     int[] imgs;

    customAdapter_part3(Activity  context, String[] fruitNames , int[] imgs)
    {
        super(context,R.layout.fruititem,fruitNames);
        this.context = context;
        this.fruitNames = fruitNames;
        this.imgs = imgs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fruititem, parent, false);
        }
        TextView tv = convertView.findViewById(R.id.fname);
        ImageView iv = convertView.findViewById(R.id.fimg);

        tv.setText(fruitNames[position]);
        iv.setImageResource(imgs[position]);
        return convertView;
    }
}
