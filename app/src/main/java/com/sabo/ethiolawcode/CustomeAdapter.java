package com.sabo.ethiolawcode;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomeAdapter extends ArrayAdapter {
    Activity context;
    String[ ] playersname;
    public CustomeAdapter(Activity context,String[] playersname){
        super(context,R.layout.code_layout,playersname);
        this.context = context;
        this.playersname=playersname;
    }

    public View getView(int pos, View view, ViewGroup vg) {

        LayoutInflater inflater = context.getLayoutInflater();
        View row =  inflater.inflate(R.layout.code_layout, null, true);
        TextView tvplayersName = row.findViewById(R.id.name);
        tvplayersName.setText(playersname[pos]);
        return row;

    }

}
