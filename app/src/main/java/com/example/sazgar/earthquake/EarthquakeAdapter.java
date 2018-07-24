package com.example.sazgar.earthquake;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;




public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{
    public EarthquakeAdapter(@NonNull Context context, @NonNull List<Earthquake> data){
        super(context,0,data);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    if (convertView==null) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.listitem, parent, false);
    }
        Earthquake current=getItem(position);
        TextView textcity=(TextView)convertView.findViewById(R.id.textviewcity);
        textcity.setText(current.getid());
        return convertView;
    }
}
