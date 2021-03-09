package com.example.covidauditor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class inActivityGM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gm_activity_in);

        final ArrayList<InItem> ii = new ArrayList<InItem>();

        ii.add(new InItem("Professional  disinfecting  of the institution regularly"));
        ii.add(new InItem("Optimise working schedule for different groups to maintain minimum crowd"));
        ii.add(new InItem("Supply sufficient facilities for hand sanitizer : Alcohol-based versions should typically contain some combination of isopropyl alcohol, ethanol (ethyl alcohol), or n-propanol, with versions containing in the range 60% to 95% "));
        ii.add(new InItem("Body temperature measuring devices such as infrared thermometers can be considered"));
        ii.add(new InItem("Check that proper air circulation is not compromised"));

//        mci.add(new MainCheckItem("A"));
//        mci.add(new MainCheckItem("B"));
//        mci.add(new MainCheckItem("C"));
//        mci.add(new MainCheckItem("D"));
//        mci.add(new MainCheckItem("E"));

        ArrayAdapterInItem itemsAdapter = new ArrayAdapterInItem(this, ii);

        ListView listView = (ListView) findViewById(R.id.listIn);
        listView.setAdapter(itemsAdapter);

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
////                int position = itemsAdapter.getPosition(words);
//
////                ImageView playImg1 = findViewById(R.id.playImg);
////                playImg1.setImageResource(android.R.drawable.ic_media_play);
//
//                Intent InActivity = new Intent(MainActivity.this,InActivity.class);
//                startActivity(InActivity);
//            }
//
//        });
    }
}