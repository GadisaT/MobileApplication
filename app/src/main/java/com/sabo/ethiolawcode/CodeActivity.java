package com.sabo.ethiolawcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CodeActivity extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code1);
        String[] content1 = getResources().getStringArray(R.array.code1Content);
        final String[] detail1 = getResources().getStringArray(R.array.code1deteil);

        String[] content2 = getResources().getStringArray(R.array.code2Content);
        final String[] detail2 = getResources().getStringArray(R.array.code2deteil);

        String[] content3 = getResources().getStringArray(R.array.code3Content);
        final String[] detail3 = getResources().getStringArray(R.array.code3deteil);

        String[] content4 = getResources().getStringArray(R.array.code4Content);
        final String[] detail4 = getResources().getStringArray(R.array.code4deteil);

        String[] content5 = getResources().getStringArray(R.array.code5Content);
        final String[] detail5 = getResources().getStringArray(R.array.code5deteil);

        String[] content6 = getResources().getStringArray(R.array.code6Content);
        final String[] detail6 = getResources().getStringArray(R.array.code6deteil);

        String[] content7 = getResources().getStringArray(R.array.code7Content);
        final String[] detail7 = getResources().getStringArray(R.array.code7deteil);

        String[] content8 = getResources().getStringArray(R.array.code8Content);
        final String[] detail8 = getResources().getStringArray(R.array.code8deteil);

        listView = findViewById(R.id.listview0);
        Integer val = getIntent().getIntExtra("position", 0);
        if (val == 0){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, content1);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String det = detail1[i];
                Intent intent2 = new Intent(CodeActivity.this, CodeDetailActivity.class);
                intent2.putExtra("detail", det);
                startActivity(intent2);
            }
        });
    }
       else if (val == 1){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, content2);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String det = detail2[i];
                    Intent intent2 = new Intent(CodeActivity.this, CodeDetailActivity.class);
                    intent2.putExtra("detail", det);
                    startActivity(intent2);
                }
            });
        }

        else if (val == 2){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, content3);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String det = detail3[i];
                    Intent intent2 = new Intent(CodeActivity.this, CodeDetailActivity.class);
                    intent2.putExtra("detail", det);
                    startActivity(intent2);
                }
            });
        }

        else if (val == 3){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, content4);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String det = detail4[i];
                    Intent intent2 = new Intent(CodeActivity.this, CodeDetailActivity.class);
                    intent2.putExtra("detail", det);
                    startActivity(intent2);
                }
            });
        }

        else if (val == 4){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, content5);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String det = detail5[i];
                    Intent intent2 = new Intent(CodeActivity.this, CodeDetailActivity.class);
                    intent2.putExtra("detail", det);
                    startActivity(intent2);
                }
            });
        }

        else if (val == 5){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, content6);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String det = detail6[i];
                    Intent intent2 = new Intent(CodeActivity.this, CodeDetailActivity.class);
                    intent2.putExtra("detail", det);
                    startActivity(intent2);
                }
            });
        }

        else if (val == 6){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, content7);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String det = detail7[i];
                    Intent intent2 = new Intent(CodeActivity.this, CodeDetailActivity.class);
                    intent2.putExtra("detail", det);
                    startActivity(intent2);
                }
            });
        }

        else if (val == 7){
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, content8);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String det = detail8[i];
                    Intent intent2 = new Intent(CodeActivity.this, CodeDetailActivity.class);
                    intent2.putExtra("detail", det);
                    startActivity(intent2);
                }
            });
        }



    }
}