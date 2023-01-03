package com.sabo.ethiolawcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listChapter extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_chapter);

        lv = findViewById(R.id.listview);


        String[] c1 = getResources().getStringArray(R.array.c1);
        String[] dc1 = getResources().getStringArray(R.array.detailsc1);

        String[] c2 = getResources().getStringArray(R.array.c2);
        String[] dc2 = getResources().getStringArray(R.array.detailsc2);

        String[] c3 = getResources().getStringArray(R.array.c3);
        String[] dc3 = getResources().getStringArray(R.array.detailsc3);

        String[] c4 = getResources().getStringArray(R.array.c4);
        String[] dc4 = getResources().getStringArray(R.array.detailsc4);

        String[] c5 = getResources().getStringArray(R.array.c5);
        String[] dc5 = getResources().getStringArray(R.array.detailsc5);

        String[] c6 = getResources().getStringArray(R.array.c6);
        String[] dc6 = getResources().getStringArray(R.array.detailsc6);

        String[] c7 = getResources().getStringArray(R.array.c7);
        String[] dc7 = getResources().getStringArray(R.array.detailsc7);

        String[] c8 = getResources().getStringArray(R.array.c8);
        String[] dc8 = getResources().getStringArray(R.array.detailsc8);

        Intent i1 = getIntent();
        int val = i1.getIntExtra("position", 0);

        if (val == 0) {
            ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, c1);
            lv.setAdapter(adapter1);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dc1[i];
                    Intent intent = new Intent(listChapter.this, TextParagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        } else if (val == 1) {
            ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, c2);
            lv.setAdapter(adapter2);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dc2[i];
                    Intent intent = new Intent(listChapter.this, TextParagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        } else if (val == 2) {

            ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, c3);
            lv.setAdapter(adapter3);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dc3[i];
                    Intent intent = new Intent(listChapter.this, TextParagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        } else if (val == 3) {
            ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, c4);
            lv.setAdapter(adapter4);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dc4[i];
                    Intent intent = new Intent(listChapter.this, TextParagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 4) {
            ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, c5);
            lv.setAdapter(adapter5);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dc5[i];
                    Intent intent = new Intent(listChapter.this, TextParagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 5) {

            ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, c6);
            lv.setAdapter(adapter6);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dc6[i];
                    Intent intent = new Intent(listChapter.this, TextParagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 6) {

            ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, c7);
            lv.setAdapter(adapter7);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dc7[i];
                    Intent intent = new Intent(listChapter.this, TextParagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
        else if (val == 7) {

            ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, c8);
            lv.setAdapter(adapter8);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String chapter = dc8[i];
                    Intent intent = new Intent(listChapter.this, TextParagraph.class);
                    intent.putExtra("Chapter", chapter);

                    startActivity(intent);
                }
            });
        }
    }
}