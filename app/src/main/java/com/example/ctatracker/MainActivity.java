package com.example.ctatracker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

public class LLinesList extends BaseAdapter {

    @Override
    public int getCount() {return mDataSource.getDataSource1Length(); }

    @Override
    public Object getItem(int position) {  return position;  }

    @Override
    public long getItemId(int position) {  return position;   }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int position, View convertView, ViewGroup
            parent)
    {
        ImageView thumbnail;
        TextView line;
        View LC;

        if(convertView == null) {
            convertView = mInflator.inflate(R.layout.list,
                    parent,false);
        }

        thumbnail = convertView.findViewById(R.id.thumb);
        thumbnail.setImageResource(mDataSource.getTrains().get(position));
        line = convertView.findViewById(R.id.textView);
        line.setText(mDataSource.getLines().get(position));
        if(position==0) convertView.setBackgroundResource(R.color.RL);
        if(position==1) convertView.setBackgroundResource(R.color.BL);
        if(position==2) convertView.setBackgroundResource(R.color.BRL);
        if(position==3) convertView.setBackgroundResource(R.color.GL);
        if(position==4) convertView.setBackgroundResource(R.color.OL);
        if(position==5) convertView.setBackgroundResource(R.color.PNL);
        if(position==6) convertView.setBackgroundResource(R.color.PUL);
        if(position==7) convertView.setBackgroundResource(R.color.YL);

        return convertView;
    }



    private Context mContext;
    private LayoutInflater mInflator;
    private DataSource mDataSource;

    public LLinesList(Context c) {
        mContext = c;
        mInflator = (LayoutInflater)
                mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mDataSource = new DataSource();
    }


}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mListView = findViewById(R.id.listView);
        mListView.setAdapter(new LLinesList(this));

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView arg0, View arg1, int position,long arg3) {
                Intent i = new Intent(MainActivity.this, LineStations.class);
                i.putExtra("position", position);
                startActivity(i);
                //Log.i("The Line in pg 1", String.valueOf(position));

            }
        });

    }



}