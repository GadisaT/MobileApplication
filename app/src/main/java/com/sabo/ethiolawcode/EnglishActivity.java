package com.sabo.ethiolawcode;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class EnglishActivity extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "EthioLawCode","CIVIL PROCEDURAL CODE",
            "CRIMINAL CODE","CRIMINAL CODE",
            "CRIMINAL CODE","CRIMINAL CODE","CRIMINAL CODE",
            "CRIMINAL CODE",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amharic);

        EnglishChapter adapter=new EnglishChapter(this, maintitle);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item

                    Intent intent=new Intent(EnglishActivity.this,EnglishListChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);

                }

                else if(position == 1) {
                    Intent intent=new Intent(EnglishActivity.this,EnglishListChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }

                else if(position == 2) {

                    Intent intent=new Intent(EnglishActivity.this,EnglishListChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 3) {

                    Intent intent=new Intent(EnglishActivity.this,EnglishListChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 4) {

                    Intent intent=new Intent(EnglishActivity.this,EnglishListChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 5) {

                    Intent intent=new Intent(EnglishActivity.this,EnglishListChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 6) {

                    Intent intent=new Intent(EnglishActivity.this,EnglishListChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);

                }
                else if(position == 7) {

                    Intent intent=new Intent(EnglishActivity.this,EnglishListChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }

            }
        });
    }
}