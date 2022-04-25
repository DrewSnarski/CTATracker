package com.example.ctatracker;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class LineStations extends AppCompatActivity {
   private int mPosition;
   private DataSource mDataSource;
   public int track;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mListView = findViewById(R.id.listView);
        mListView.setAdapter(new StationList(this));
        Intent i = getIntent();
        mPosition = i.getIntExtra("position", 0);
        mDataSource = new DataSource();
        setTrack(mPosition);

         mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
         public void onItemClick(AdapterView arg0, View arg1, int position,long arg3) {
         Intent i = new Intent(LineStations.this, Arrivals.class);
         i.putExtra("lineColor", track);
         i.putExtra("station", position);
            //Log.i("The Line in pg 2", String.valueOf(track));
            //Log.i("The Stop in pg 2", String.valueOf(position));

         startActivity(i);
        }
         });

    }
    public int setTrack (int t){
        track=t;return track;
    }
             public class StationList extends BaseAdapter {
                @Override
                public int getCount() {
                    if(track==0) return mDataSource.getDataSourceREDLength();
                    else if(track==1) return mDataSource.getDataSourceBLUELength();
                    else if(track==2) return mDataSource.getDataSourceBROWNLength();
                    else if(track==3) return mDataSource.getDataSourceGREENLength();
                    else if(track==4) return mDataSource.getDataSourceORANGELength();
                    else if(track==5) return mDataSource.getDataSourcePINKLength();
                    else if(track==6) return mDataSource.getDataSourcePURLength();
                    else return mDataSource.getDataSourceYELLength();
                }

                @Override
                public Object getItem(int position) {
                    return position;
                }

                @Override
                public long getItemId(int position) {
                    return position;
                }

                @SuppressLint("ResourceAsColor")
                @Override
                public View getView(int position, View convertView, ViewGroup parent) {
                    TextView line;
                    if (convertView == null) {
                        convertView = mInflator.inflate(R.layout.list, parent, false);
                    }
                    line = convertView.findViewById(R.id.textView);
                    if(track==0){
                        line.setText(mDataSource.getRedStations().get(position));
                        convertView.setBackgroundResource(R.color.RL);}
                    else if(track==1){
                        line.setText(mDataSource.getBlueStations().get(position));
                        convertView.setBackgroundResource(R.color.BL);}
                    else if(track==2){
                        line.setText(mDataSource.getBrownStations().get(position));
                        convertView.setBackgroundResource(R.color.BRL);}
                    else if(track==3){
                        line.setText(mDataSource.getGreenStations().get(position));
                        convertView.setBackgroundResource(R.color.GL);}
                    else if(track==4){
                        line.setText(mDataSource.getOrangeStations().get(position));
                        convertView.setBackgroundResource(R.color.OL);}
                    else if(track==5){
                        line.setText(mDataSource.getPinkStations().get(position));
                        convertView.setBackgroundResource(R.color.PNL);}
                    else if(track==6){
                    line.setText(mDataSource.getPurpleStations().get(position));
                    convertView.setBackgroundResource(R.color.PUL);}
                    else{
                        line.setText(mDataSource.getYellowStations().get(position));
                    convertView.setBackgroundResource(R.color.YL);}
                    return convertView;
                }

                private Context mContext;
                private LayoutInflater mInflator;
                private DataSource mDataSource;

                public StationList(Context c) {
                    mContext = c;
                    mInflator = (LayoutInflater)
                            mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    mDataSource = new DataSource();
                }
            }



}
