package com.sabo.ethiolawcode;
import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EnglishChapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;

    public EnglishChapter(Activity context, String[] maintitle) {
        super(context, R.layout.activity_english_chapter, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_english_chapter, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.titlecode);

        titleText.setText(maintitle[position]);

        return rowView;

    };
}