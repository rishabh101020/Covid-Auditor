package com.example.covidauditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    private View vw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<MainCheckItem> mci = new ArrayList<MainCheckItem>();

        mci.add(new MainCheckItem("General Measures"));
        mci.add(new MainCheckItem("Personal Measures"));
        mci.add(new MainCheckItem("Measure During Classes & Mess "));
        mci.add(new MainCheckItem("Transportation"));
        mci.add(new MainCheckItem("Quarantine Facilities"));

//        mci.add(new MainCheckItem("A"));
//        mci.add(new MainCheckItem("B"));
//        mci.add(new MainCheckItem("C"));
//        mci.add(new MainCheckItem("D"));
//        mci.add(new MainCheckItem("E"));

        ArrayAdapterMainCheckItem itemsAdapter = new ArrayAdapterMainCheckItem(this, mci);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                int position = itemsAdapter.getPosition(words);

//                ImageView playImg1 = findViewById(R.id.playImg);
//                playImg1.setImageResource(android.R.drawable.ic_media_play);

                Intent InActivityGM = new Intent(MainActivity.this, inActivityGM.class);
                startActivity(InActivityGM);
            }

        });
    }

    public void Edit(View view){

        Intent EditMain = new Intent(MainActivity.this, EditMain.class);
        startActivity(EditMain);
    }
}