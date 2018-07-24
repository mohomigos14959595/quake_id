package com.example.sazgar.earthquake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list1=(ListView)findViewById(R.id.listview);
        EarthquakeAdapter adapter=new EarthquakeAdapter(this,Utils.getEarthquakeFromJson());
        list1.setAdapter(adapter);
    }
}
