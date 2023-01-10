package com.sabo.ethiolawcode;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.SearchView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;


import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class AmharicActivity extends AppCompatActivity {



    ListView list;
    AhmaricChapter adapter;
    String[] maintitle ={
            "የሲቪል ኮድ","የሲቪል ሂደት ኮድ",
            "የወንጀል ኮድ","የወንጀል ሂደት ኮድ",
            "የንግድ ኮድ","የተሻሻለ የቤተሰብ ኮድ","የሠራተኛ ኮድ",
            "አስተዳደራዊ ሂደት",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amharic);

        final DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        adapter=new AhmaricChapter(this, maintitle);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item

                    Intent intent=new Intent(AmharicActivity.this,listChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);

                }

                else if(position == 1) {
                    Intent intent=new Intent(AmharicActivity.this,listChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }

                else if(position == 2) {

                    Intent intent=new Intent(AmharicActivity.this,listChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 3) {

                    Intent intent=new Intent(AmharicActivity.this,listChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 4) {

                    Intent intent=new Intent(AmharicActivity.this,listChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 5) {

                    Intent intent=new Intent(AmharicActivity.this,listChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 6) {

                    Intent intent=new Intent(AmharicActivity.this,listChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);

                }
                else if(position == 7) {

                    Intent intent=new Intent(AmharicActivity.this,listChapter.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search,menu);
        MenuItem menuItem= menu.findItem(R.id.search);
        SearchView searchView=(SearchView) menuItem.getActionView();
        searchView.getQueryHint();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}