package com.example.sazgar.earthquake;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import static android.R.id.list;

public class Utils {



    private static final String JSON_DATA = "[{\"id\":\"open\"}," +
            "{\"id\":\"opennew\"}," +
            "{\"id\":\"zoomin\"}," +
            "{\"id\":\"zoomout\"}," +
            "{\"id\":\"originalview\"}," +
            "{\"id\":\"quality\"}," +
            "{\"id\":\"pause\"}," +
            "{\"id\":\"mute\"}," +
            "{\"id\":\"find\"}," +
            "{\"id\":\"findagain\"}," +
            "{\"id\":\"copy\"}," +
            "{\"id\":\"copyagain\"}," +
            "{\"id\":\"copysvg\"}," +
            "{\"id\":\"viewsvg\"}," +
            "{\"id\":\"viewsourse\"}," +
            "{\"id\":\"save as\"}," +
            "{\"id\":\"help\"}," +
            "{\"id\":\"about\"}]";



    public static List<Earthquake> getEarthquakeFromJson(){



        List<Earthquake> result = new ArrayList<>();



        try {

            JSONArray root = new JSONArray(JSON_DATA);



            for (int i = 0; i < root.length(); i++) {

                JSONObject quake = new JSONObject(root.getJSONObject(i).toString());

                String id = quake.getString("id");




                Earthquake earthquake = new Earthquake(id);

                result.add(earthquake);

            }



        } catch (JSONException e) {

            e.printStackTrace();

        }



        return result;



    }

}