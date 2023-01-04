package com.sabo.ethiolawcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EnglishlistChapter extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_list_chapter);

        lv = findViewById(R.id.listview);


        String[] e1 = getResources().getStringArray(R.array.code1Content);
        String[] de1 = getResources().getStringArray(R.array.code1deteil);

        String[] e2 = getResources().getStringArray(R.array.code2Content);
        String[] de2 = getResources().getStringArray(R.array.code2deteil);

        String[] e3 = getResources().getStringArray(R.array.code3Content);
        String[] de3 = getResources().getStringArray(R.array.code3deteil);

        String[] e4 = getResources().getStringArray(R.array.code4Content);
        String[] de4 = getResources().getStringArray(R.array.code4deteil);

        String[] e5 = getResources().getStringArray(R.array.code5Content);
        String[] de5 = getResources().getStringArray(R.array.code5deteil);

        String[] e6 = getResources().getStringArray(R.array.code6Content);
        String[] de6 = getResources().getStringArray(R.array.code6deteil);

        String[] e7 = getResources().getStringArray(R.array.code7Content);
        String[] de7 = getResources().getStringArray(R.array.code7deteil);

        String[] e8 = getResources().getStringArray(R.array.code8Content);
        String[] de8 = getResources().getStringArray(R.array.code8deteil);

        Intent i1 = getIntent();
        int val = i1.getIntExtra("position", 0);

        if (val == 0) {
            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, e1);
            lv.setAdapter(adapter1);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = de1[i];
                    Intent intent = new Intent(EnglishlistChapter.this, Englishparagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        } else if (val == 1) {
            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, e2);
            lv.setAdapter(adapter2);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = de2[i];
                    Intent intent = new Intent(EnglishlistChapter.this, Englishparagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        } else if (val == 2) {

            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, e3);
            lv.setAdapter(adapter3);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = de3[i];
                    Intent intent = new Intent(EnglishlistChapter.this, Englishparagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        } else if (val == 3) {
            ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, e4);
            lv.setAdapter(adapter4);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = de4[i];
                    Intent intent = new Intent(EnglishlistChapter.this, Englishparagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 4) {
            ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, e5);
            lv.setAdapter(adapter5);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = de5[i];
                    Intent intent = new Intent(EnglishlistChapter.this, Englishparagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 5) {

            ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, e6);
            lv.setAdapter(adapter6);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = de6[i];
                    Intent intent = new Intent(EnglishlistChapter.this, Englishparagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 6) {

            ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, e7);
            lv.setAdapter(adapter7);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = de7[i];
                    Intent intent = new Intent(EnglishlistChapter.this, Englishparagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 7) {

            ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, e8);
            lv.setAdapter(adapter8);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = de8[i];
                    Intent intent = new Intent(EnglishlistChapter.this, Englishparagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
    }
}