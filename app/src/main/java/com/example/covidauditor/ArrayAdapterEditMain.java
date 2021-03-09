package com.example.covidauditor;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ArrayAdapterEditMain extends ArrayAdapter<MainCheckItem> {

    public ArrayAdapterEditMain(Activity context, ArrayList<MainCheckItem> mainCheckItem) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, mainCheckItem);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_edit_main, parent, false);
        }

        MainCheckItem currentWord = getItem(position);

        TextView mainCheckItem = (TextView) listItemView.findViewById(R.id.MainCheckItem);
        mainCheckItem.setText(currentWord.getMainCheckItem());

        Switch on_off = (Switch) listItemView.findViewById(R.id.on_off);
        on_off.setChecked(true);


        return listItemView;

    }
}
