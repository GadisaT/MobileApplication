package com.sabo.ethiolawcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class boqonnota extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boqonnota);

        lv = findViewById(R.id.listview);


        String[] kode1 = getResources().getStringArray(R.array.kode1);
        String[] dubbisa1 = getResources().getStringArray(R.array.dubbisa1);

        String[] kode2 = getResources().getStringArray(R.array.kode2);
        String[] dubbisa2 = getResources().getStringArray(R.array.dubbisa2);

        String[] kode3 = getResources().getStringArray(R.array.kode3);
        String[] dubbisa3 = getResources().getStringArray(R.array.dubbisa3);

        String[] kode4 = getResources().getStringArray(R.array.kode4);
        String[] duubisa4 = getResources().getStringArray(R.array.dubbisa4);

        String[] kode5 = getResources().getStringArray(R.array.kode5);
        String[] dubbisa5 = getResources().getStringArray(R.array.dubbisa5);

        String[] kode6 = getResources().getStringArray(R.array.kode6);
        String[] dubbisa6 = getResources().getStringArray(R.array.dubbisa6);

        String[] kode7 = getResources().getStringArray(R.array.kode7);
        String[] dubbisa7 = getResources().getStringArray(R.array.dubbisa7);

        String[] kode8 = getResources().getStringArray(R.array.kode8);
        String[] dubbisa8 = getResources().getStringArray(R.array.dubbisa8);

        Intent i1 = getIntent();
        int val = i1.getIntExtra("position", 0);

        if (val == 0) {
            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, kode1);
            lv.setAdapter(adapter1);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dubbisa1[i];
                    Intent intent = new Intent(boqonnota.this, paragraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        } else if (val == 1) {
            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, kode2);
            lv.setAdapter(adapter2);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dubbisa2[i];
                    Intent intent = new Intent(boqonnota.this, paragraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        } else if (val == 2) {

            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, kode3);
            lv.setAdapter(adapter3);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dubbisa3[i];
                    Intent intent = new Intent(boqonnota.this,paragraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        } else if (val == 3) {
            ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, kode4);
            lv.setAdapter(adapter4);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = duubisa4[i];
                    Intent intent = new Intent(boqonnota.this, paragraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 4) {
            ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, kode5);
            lv.setAdapter(adapter5);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dubbisa5[i];
                    Intent intent = new Intent(boqonnota.this, paragraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 5) {

            ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, kode6);
            lv.setAdapter(adapter6);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dubbisa6[i];
                    Intent intent = new Intent(boqonnota.this, paragraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 6) {

            ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, kode7);
            lv.setAdapter(adapter7);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dubbisa7[i];
                    Intent intent = new Intent(boqonnota.this, paragraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 7) {

            ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, kode8);
            lv.setAdapter(adapter8);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dubbisa8[i];
                    Intent intent = new Intent(boqonnota.this, paragraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
    }
}