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

public class customAdapter_part4 extends ArrayAdapter<String> {

    Context context;
    String[] countries;
    String[] capitals;
    int[] flags;

    customAdapter_part4(Activity context,String[] countries,String[] capitals,int[] flags)
    {
        super(context,R.layout.countryitem,countries);
        this.capitals = capitals;
        this.flags = flags;
        this.context = context;
        this.countries = countries;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.countryitem, parent, false);
        }
        ImageView iv = convertView.findViewById(R.id.cflag);
        TextView tv1 = convertView.findViewById(R.id.cname);
        TextView tv2 = convertView.findViewById(R.id.ccapital);

        iv.setImageResource(flags[position]);
        tv1.setText("Country :" + countries[position]);
        tv2.setText("Capital : "+capitals[position]);
        return convertView;
    }
}
