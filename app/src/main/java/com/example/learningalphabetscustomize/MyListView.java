package com.example.learningalphabetscustomize;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyListView extends ArrayAdapter {
    private final Activity context;
    private final String[] maintitle;
    private final String[] subtitle;
    private final Integer[] imgid;

    public MyListView(@NonNull Activity context, String[] maintitle, String[] subtitle, Integer[] imgid) {
        super(context, R.layout.customlayout, maintitle);
        this.context = context;
        this.maintitle = maintitle;
        this.subtitle = subtitle;
        this.imgid = imgid;
    }

    public View getView (int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View singleEntityView = inflater.inflate(R.layout.customlayout, null, true);
        TextView titleHeading = singleEntityView.findViewById(R.id.alphaView);
        TextView imgView = singleEntityView.findViewById(R.id.imageView);
        TextView picDetail = singleEntityView.findViewById(R.id.picName);

        titleHeading.setText(maintitle[position]);
        imgView.setImageResource(imgid[position]);
        return singleEntityView;
    }
}
