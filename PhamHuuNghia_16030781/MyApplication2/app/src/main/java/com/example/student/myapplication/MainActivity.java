package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Spiner>image_details = getListData();
        final ListView listView = findViewById(R.id.listview);
        listView.setAdapter(new SpinerAdapter(this,image_details));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Object o = listView.getItemAtPosition(position);
                Spiner spiner = (Spiner) o ;
                Toast.makeText(MainActivity.this,"Selected : "+""+spiner,Toast.LENGTH_LONG).show();

            }
        });
    }
    private List<Spiner> getListData(){
        List<Spiner>list = new ArrayList<Spiner>();
        Spiner Beckham = new Spiner("Beckham","Beckham","FlagAmerica",1975);
        Spiner Ronaldo = new Spiner("Ronaldo","Beckham","FlagAmerica",1984);
        Spiner Messi = new Spiner("Messi","Beckham","FlagAmerica",1987);
        list.add(Beckham);
        list.add(Ronaldo);
        list.add(Messi);
        return list;

    }
}
