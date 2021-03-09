package com.example.covidauditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EditMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_main);

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

        ArrayAdapterEditMain itemsAdapter = new ArrayAdapterEditMain(this, mci);

        ListView listView = (ListView) findViewById(R.id.listMainEdit);
        listView.setAdapter(itemsAdapter);


    }

    public void Save(View view){

    }
}