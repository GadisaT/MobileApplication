package com.sabo.ethiolawcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EnglishListChapter extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_list_chapter);

        lv = findViewById(R.id.listview);


        String[] e1 = getResources().getStringArray(R.array.e1);
        String[] de1 = getResources().getStringArray(R.array.de1);

        String[] e2 = getResources().getStringArray(R.array.e2);
        String[] de2 = getResources().getStringArray(R.array.de2);

        String[] e3 = getResources().getStringArray(R.array.e3);
        String[] de3 = getResources().getStringArray(R.array.de3);

        String[] e4 = getResources().getStringArray(R.array.e4);
        String[] de4 = getResources().getStringArray(R.array.de4);

        String[] e5 = getResources().getStringArray(R.array.e5);
        String[] de5 = getResources().getStringArray(R.array.de5);

        String[] e6 = getResources().getStringArray(R.array.e6);
        String[] de6 = getResources().getStringArray(R.array.de6);

        String[] e7 = getResources().getStringArray(R.array.e7);
        String[] de7 = getResources().getStringArray(R.array.de7);

        String[] e8 = getResources().getStringArray(R.array.e8);
        String[] de8 = getResources().getStringArray(R.array.de8);

        Intent i1 = getIntent();
        int val = i1.getIntExtra("position", 0);

        if (val == 0) {
            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, e1);
            lv.setAdapter(adapter1);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = de1[i];
                    Intent intent = new Intent(EnglishListChapter.this, Englishparagraph.class);
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
                    Intent intent = new Intent(EnglishListChapter.this, Englishparagraph.class);
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
                    Intent intent = new Intent(EnglishListChapter.this, Englishparagraph.class);
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
                    Intent intent = new Intent(EnglishListChapter.this, Englishparagraph.class);
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
                    Intent intent = new Intent(EnglishListChapter.this, Englishparagraph.class);
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
                    Intent intent = new Intent(EnglishListChapter.this, Englishparagraph.class);
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
                    Intent intent = new Intent(EnglishListChapter.this, Englishparagraph.class);
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
                    Intent intent = new Intent(EnglishListChapter.this, Englishparagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
    }
}