package com.example.ctatracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Calendar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class Arrivals extends AppCompatActivity {
    private ListView stops;
    private String LC;
    private int lineColor;
    private int station;
    String NWHead;
    String SEHead;
    private DataSource mDataSource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stops=findViewById(R.id.listView);
        Intent i = getIntent();
        mDataSource = new DataSource();
        lineColor = i.getIntExtra("lineColor", 0);
        station = i.getIntExtra("station", 0);
        //Log.i("The Line in pg 3", String.valueOf(lineColor));
       //Log.i("The Stop in pg 3", String.valueOf(station));
        new AsyncDataClass().execute();
    }//End OnCreate

    private class AsyncDataClass extends AsyncTask<String, Void, String> {
        HttpsURLConnection urlConnection;
        String APIURL;
        @Override
        protected String doInBackground(String...params) {
            StringBuilder jsonResult = new StringBuilder();
            try {
                if (lineColor==0) { //Red Line
                   // NWHead.setText("Service toward Howard");
                  //  SEHead.setText("Service toward 95th/Dan Ryan");
                    LC="Red Line #";
                    if (station == 0) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40900"); }
                    else if (station == 0) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41190"); }
                    else if (station == 1) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40100"); }
                    else if (station == 2) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41300"); }
                    else if (station == 3) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40760"); }
                    else if (station == 4) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40880"); }
                    else if (station == 5) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41380"); }
                    else if (station == 6) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41200"); }
                    else if (station == 7) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40540"); }
                    else if (station == 8) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40080"); }
                    else if (station == 9) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41420"); }
                    else if (station == 10) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41320"); }
                    else if (station == 11) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41220"); }
                    else if (station == 12) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40650"); }
                    else if (station == 13) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40630"); }
                    else if (station == 14) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41450"); }
                    else if (station == 15) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40330"); }
                    else if (station == 16) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41660"); }
                    else if (station == 17) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41090"); }
                    else if (station == 18) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40450"); }
                    else if (station == 19) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41490"); }
                    else if (station == 20) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41400"); }
                    else if (station == 21) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41000"); }
                    else if (station == 22) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40190"); }
                    else if (station == 23) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41230"); }
                    else if (station == 24) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41170"); }
                    else if (station == 25) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40910"); }
                    else if (station == 26) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40990"); }
                    else if (station == 27) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40240"); }
                    else if (station == 28) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41430"); }
                    else { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40450"); }

                }
                else if (lineColor==1) { //Blue Line
                   // NWHead.setText("Service toward O'Hare");
                   // SEHead.setText("Service toward Forest Park");
                    LC="Blue Line #";
                    if (station == 0) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40890"); }
                    else if (station == 1) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40820"); }
                    else if (station == 2) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40230"); }
                    else if (station == 3) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40750"); }
                    else if (station == 4) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41280"); }
                    else if (station == 5) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41330"); }
                    else if (station == 6) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40550"); }
                    else if (station == 7) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41240"); }
                    else if (station == 8) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40060"); }
                    else if (station == 9) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41020"); }
                    else if (station == 10) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40570"); }
                    else if (station == 11) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40670"); }
                    else if (station == 12) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40590"); }
                    else if (station == 13) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40320"); }
                    else if (station == 14) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41410"); }
                    else if (station == 15) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40490"); }
                    else if (station == 16) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40380"); }
                    else if (station == 17) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40370"); }
                    else if (station == 18) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40790"); }
                    else if (station == 19) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40070"); }
                    else if (station == 20) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41340"); }
                    else if (station == 21) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40430"); }
                    else if (station == 22) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40350"); }
                    else if (station == 23) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40470"); }
                    else if (station == 24) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40810"); }
                    else if (station == 25) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40220"); }
                    else if (station == 26) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40250"); }
                    else if (station == 27) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40920"); }
                    else if (station == 28) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40970"); }
                    else if (station == 29) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40010"); }
                    else if (station == 30) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40180"); }
                    else if (station == 31) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40980"); }
                    else { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40390"); }
                }
                else if (lineColor==2) { //Brown Line
                   // NWHead.setText("Service toward Kimball");
                   // SEHead.setText("Service toward Loop");
                    LC="Brown Line #";
                    if (station == 0) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41290"); }
                    else if (station == 1) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41180"); }
                    else if (station == 2) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40870"); }
                    else if (station == 3) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41010"); }
                    else if (station == 4) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41480"); }
                    else if (station == 5) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40090"); }
                    else if (station == 6) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41500"); }
                    else if (station == 7) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41460"); }
                    else if (station == 8) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41440"); }
                    else if (station == 9) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41310"); }
                    else if (station == 10) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40360"); }
                    else if (station == 11) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41320"); }
                    else if (station == 12) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41210"); }
                    else if (station == 13) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40530"); }
                    else if (station == 14) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41220"); }
                    else if (station == 15) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40660"); }
                    else if (station == 16) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40800"); }
                    else if (station == 17) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40710"); }
                    else if (station == 18) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40460"); }
                    else if (station == 19) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40730"); }
                    else if (station == 20) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40040"); }
                    else if (station == 21) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40160"); }
                    else if (station == 22) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40850"); }
                    else if (station == 23) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40680"); }
                    else if (station == 24) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41700"); }
                    else if (station == 25) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40260"); }
                    else { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40380"); }

                }
                else if (lineColor==3) { //Green Line
                    //NWHead.setText("Service toward Harlem/Lake");
                    //SEHead.setText("Service toward 63rd St");
                    LC="Green Line #";
                    if (station == 0) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40020"); }
                    else if (station == 1) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41350"); }
                    else if (station == 2) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40610"); }
                    else if (station == 3) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41260"); }
                    else if (station == 4) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40280"); }
                    else if (station == 5) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40700"); }
                    else if (station == 6) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40480"); }
                    else if (station == 7) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40030"); }
                    else if (station == 8) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41670"); }
                    else if (station == 9) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41070"); }
                    else if (station == 10) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41360"); }
                    else if (station == 11) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40170"); }
                    else if (station == 12) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41510"); }
                    else if (station == 13) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41160"); }
                    else if (station == 14) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40380"); }
                    else if (station == 15) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40260"); }
                    else if (station == 16) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41700"); }
                    else if (station == 17) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40680"); }
                    else if (station == 18) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41400"); }
                    else if (station == 19) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41690"); }
                    else if (station == 20) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41120"); }
                    else if (station == 21) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40300"); }
                    else if (station == 22) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41270"); }
                    else if (station == 23) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41080"); }
                    else if (station == 24) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40130"); }
                    else if (station == 25) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40510"); }
                    else if (station == 26) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40940"); }
                    else if (station == 27) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40290"); }
                    else if (station == 28) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41140"); }
                    else { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40720"); }

                }
                else if (lineColor==4) { //Orange Line
                   // NWHead.setText("Service toward Loop");
                   // SEHead.setText("Service toward Midway");
                    LC="Orange Line #";
                    if (station == 0) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40930"); }
                    else if (station == 1) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40960"); }
                    else if (station == 2) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40310"); }
                    else if (station == 3) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40120"); }
                    else if (station == 4) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41060"); }
                    else if (station == 5) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41130"); }
                    else if (station == 6) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41400"); }
                    else if (station == 7) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40850"); }
                    else if (station == 8) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40160"); }
                    else if (station == 9) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40040"); }
                    else if (station == 10) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40730"); }
                    else if (station == 11) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40380"); }
                    else if (station == 12) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40260"); }
                    else if (station == 13) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41700"); }
                    else { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40680"); }

                }
                else if (lineColor==5) { //Pink Line
                    LC="Pink Line #";
                    //NWHead.setText("Service toward Loop");
                    //SEHead.setText("Service toward 54th/Cermak");
                    if (station == 0) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40580"); }
                    else if (station == 1) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40420"); }
                    else if (station == 2) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40600"); }
                    else if (station == 3) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40780"); }
                    else if (station == 4) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41040"); }
                    else if (station == 5) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40440"); }
                    else if (station == 6) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40740"); }
                    else if (station == 7) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40210"); }
                    else if (station == 8) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40830"); }
                    else if (station == 9) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41030"); }
                    else if (station == 10) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40170"); }
                    else if (station == 11) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41510"); }
                    else if (station == 12) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41160"); }
                    else if (station == 13) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40380"); }
                    else if (station == 14) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40260"); }
                    else if (station == 15) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41700"); }
                    else if (station == 16) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40680"); }
                    else if (station == 17) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40850"); }
                    else if (station == 18) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40160"); }
                    else if (station == 19) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40040"); }
                    else { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40730"); }

                }
                else if (lineColor == 6) { //Purple Line
                    //NWHead.setText("Service toward Linden");
                    //SEHead.setText("Service toward Howard, Loop");
                    LC="Purple Line #";
                    if (station == 0) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41050"); }
                    else if (station == 1) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41250"); }
                    else if (station == 2) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40400"); }
                    else if (station == 3) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40520"); }
                    else if (station == 4) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40050"); }
                    else if (station == 5) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40690"); }
                    else if (station == 6) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40270"); }
                    else if (station == 7) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40840"); }
                    else if (station == 8) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40900"); }
                    else if (station == 9) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40540"); }
                    else if (station == 10) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41320"); }
                    else if (station == 11) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41210"); }
                    else if (station == 12) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40530"); }
                    else if (station == 13) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41220"); }
                    else if (station == 14) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40660"); }
                    else if (station == 15) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40800"); }
                    else if (station == 16) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40710"); }
                    else if (station == 17) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40460"); }
                    else if (station == 18) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40380"); }
                    else if (station == 19) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40260"); }
                    else if (station == 20) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41700"); }
                    else if (station == 21) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40680"); }
                    else if (station == 22) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40850"); }
                    else if (station == 23) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40160"); }
                    else if (station == 24) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40040"); }
                    else { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40730"); }
                } else { //Yellow Line
                    //NWHead.setText("Service toward Dempster-Skokie");
                    //SEHead.setText("Service toward Howard");
                    LC="Yellow Line #";
                    if (station == 0) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40140"); }
                    else if (station == 1) { APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41680"); }
                    else{ APIURL = ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=40900"); }

                }
                 URL url = new URL(APIURL);
                //URL url = new URL ("https://lapi.transitchicago.com/api/1.0/ttarrivals.aspx?key=55c7c1816b414f289f942796bf9b309f&outputType=JSON&mapid=41680");
                //Log.i("URL", APIURL);
                urlConnection = (HttpsURLConnection)
                        url.openConnection();
                InputStream in = new
                        BufferedInputStream(urlConnection.getInputStream());

                BufferedReader reader = new BufferedReader(new
                        InputStreamReader(in));
                String line;
                while ((line = reader.readLine()) != null) {
                    jsonResult.append(line);
                }
                System.out.println("Returned Json url object " +
                        jsonResult.toString());

            } catch (Exception e) {System.out.println("Err: " + e);}
            finally { urlConnection.disconnect(); }
            return jsonResult.toString();
        }//End DoInBackground
        @Override
        protected void onPreExecute() {  }
        @Override
        protected void onPostExecute(String result) {
            System.out.println("Result on post execute: " + result);
            List<ItemObject> parsedObject = returnParsedJsonObject(result);
            CustomAdapter jsonCustomAdapter = new CustomAdapter(Arrivals.this, parsedObject);
            stops.setAdapter(jsonCustomAdapter);


        }
    }//End AsyncData
    private List<ItemObject> returnParsedJsonObject(String result){
        List<ItemObject> jsonObject = new ArrayList<ItemObject>();
        JSONObject resultObject = null;
        JSONArray jsonArray = null;
        ItemObject newItemObject = null; //interior object holder
        try {
            resultObject = new JSONObject(result);
            System.out.println("Preparsed JSON object " + resultObject.toString());
            // set up json Array to be parsed
            jsonArray = resultObject.optJSONArray("ctatt/eta");
            String name = resultObject.getString("ctatt");
            String arr[] = name.split("\\\"staId\\\"");
            System.out.println(arr[1].substring(0));
            String spl1[] = arr[1].split("\\\"rn\\\":\\\"");
            String spl1a[] = spl1[1].split("\\\"");
            System.out.println("spl1a "+spl1a[0]);
            String spl2[] = arr[1].split("\\\"destNm\\\":\\\"");
            String spl2a[] = spl2[1].split("\\\"");
            System.out.println("spl2a "+spl2a[0]);
            String spl3[] = arr[1].split("\\\"arrT\\\":\\\"");
            String spl3a[] = spl3[1].split("T");
            String spl3b[] = spl3a[1].split("\\\"");
            System.out.println("spl3b "+spl3b[0]);
            //arr = name.split("\\\"stpId\\\"");
            //System.out.println(arr[1].substring(0));
            //way to split string between certain chars? All data is between { }
            //recursive string splits????

        } catch (JSONException e) { e.printStackTrace(); }
        //for(int i = 0; i < jsonArray.length(); i++){
            JSONObject jsonChildNode = null;
            //String name = resultObject.getString("ctatt");
            //String arr[] = name.split("\\\"staId\\\"");

            try { jsonChildNode = jsonArray.getJSONObject(jsonArray.length());
                //get all data from stream
                String stopstaId = jsonChildNode.getString("staId");
                String stopstpId = jsonChildNode.getString("stpId");
                String stopstaNm = jsonChildNode.getString("staNm");
                String stopstpDe = jsonChildNode.getString("stpDe");
                String stoprn = jsonChildNode.getString("rn");
                String stoprt = jsonChildNode.getString("rt");
                String stopdestNm = jsonChildNode.getString("destNm");
                String stoparrT = jsonChildNode.getString("arrT");
                String stopisApp = jsonChildNode.getString("isApp");
                newItemObject = new ItemObject(stopstaId, stopstpId, stopstaNm, stopstpDe, stoprn, stoprt, stopdestNm, stoparrT, stopisApp);
                jsonObject.add(newItemObject);
            } catch (JSONException e) { e.printStackTrace(); }
        //}
        return jsonObject;
    } //End List

    public class times extends BaseAdapter {
        private LayoutInflater lInflater;
        private List<ItemObject> listStorage;
        public times(Context context, List<ItemObject>  customizedListView) {
            lInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            listStorage = customizedListView;
        }
        @Override
        public int getCount() { return listStorage.size(); }
        @Override
        public Object getItem(int position) { return position; }
        @Override
        public long getItemId(int position) { return position; }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView destination;
            TextView trainnum;
            TextView minsout;
            TextView header;
            TextView headerSE;
            if (convertView == null) { convertView = lInflater.inflate(R.layout.list, parent, false); }
            destination=convertView.findViewById(R.id.destView);
            trainnum=convertView.findViewById(R.id.trainNoView);
            minsout=convertView.findViewById(R.id.timeView);
            header=convertView.findViewById(R.id.headerView);
            headerSE=convertView.findViewById(R.id.headerViewSE);
            header.setText(NWHead);
            headerSE.setText(SEHead);
            destination.setText(listStorage.get(position).getDestNm());
            trainnum.setText(LC+listStorage.get(position).getRn()+" to");
            minsout.setText(listStorage.get(position).getArrT());
            Log.i("Data ",listStorage.get(position).getDestNm());
            //if((listStorage.get(position).getIsApp()).equals("1"))minsout.setText("Due");
            /*else{
                //Get current time in 24HR format and subtract that from arrT
                //Sample arrT - "2022-04-25T14:57:51" substring
                String arrt = listStorage.get(position).getArrT().substring(11);

                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String str = sdf.format(new Date());
                //java.text.DateFormat df = new java.text.SimpleDateFormat("hh:mm:ss");
                //java.util.Date date1 = df.parse("18:40:10");
               // java.util.Date date2 = df.parse("19:05:15");
                //long diff = date2.getTime() - date1.getTime();
                long min = 0;
                long difference ;
                try {
                    Date date1 = sdf.parse(str);
                    Date date2 = sdf.parse(arrT);

                    difference = (date2.getTime() - date1.getTime()) / 1000;
                    long hours = difference % (24 * 3600) / 3600; // Calculating Hours
                    long minute = difference % 3600 / 60; // Calculating minutes if there is any minutes difference
                    min = minute + (hours * 60); // This will be our final minutes. Multiplying by 60 as 1 hour contains 60 mins
                } catch (Throwable e) {
                    e.printStackTrace();
                }


                //long total_time = end_date.getTime() - start_date.getTime();
                int d;
                minsout.setText();
            }*/


            return convertView;
        }
    }//End times BaseAdapter



    }//End Arrivals






/*if purple lc=6
    if central stop=1
        API call
        if stpid==north
            show time
        else
            show time
    else if noyes stop=2
        API call
        if stpid==north
        else*/