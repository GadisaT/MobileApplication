package com.sabo.ethiolawcode;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class OromicActivity extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Seera Siviilii","Seera deemsa falmii siviilii",
            "Seera yakkaa","Seera deemsa falmii yakkaa",
            "Koodii daldalaa","Koodii maatii fooyya’e","Seera Hojjetaa",
            "Adeemsa bulchiinsaa",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oromic);

        final DrawerLayout drawerLayout = findViewById(R.id.oromicdrawable);
        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        OromicChapter adapter=new OromicChapter(this, maintitle);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item

                    Intent intent=new Intent(OromicActivity.this,boqonnota.class);
                    intent.putExtra("position",position);
                    startActivity(intent);

                }

                else if(position == 1) {
                    Intent intent=new Intent(OromicActivity.this,boqonnota.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }

                else if(position == 2) {

                    Intent intent=new Intent(OromicActivity.this,boqonnota.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 3) {

                    Intent intent=new Intent(OromicActivity.this,boqonnota.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 4) {

                    Intent intent=new Intent(OromicActivity.this,boqonnota.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 5) {

                    Intent intent=new Intent(OromicActivity.this,boqonnota.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 6) {

                    Intent intent=new Intent(OromicActivity.this,boqonnota.class);
                    intent.putExtra("position",position);
                    startActivity(intent);

                }
                else if(position == 7) {

                    Intent intent=new Intent(OromicActivity.this,boqonnota.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }

            }
        });
    }
}