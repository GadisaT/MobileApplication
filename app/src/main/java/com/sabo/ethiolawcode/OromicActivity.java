package com.sabo.ethiolawcode;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;


import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;


public class OromicActivity extends AppCompatActivity {
    ListView list;
    OromicChapter adapter;
    String[] maintitle ={
            "Seera Siviilii","Seera deemsa falmii siviilii",
            "Seera yakkaa","Seera deemsa falmii yakkaa",
            "Koodii daldalaa","Koodii maatii fooyya’e","Seera Hojjetaa",
            "Adeemsa bulchiinsaa",
    };

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oromic);


        drawerLayout = findViewById(R.id.oromicdrawable);
        navigationView=findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home:
                        Intent intent=new Intent(OromicActivity.this,MainActivity.class);
                        startActivity(intent);
                        return true;
                    case R.id.nav_about:
                        Intent intent2=new Intent(OromicActivity.this,AboutUs.class);
                        startActivity(intent2);
//                    case R.id.nav_content:
//                        Intent intent3=new Intent(OromicActivity.this,OromicActivity.class);
//                        startActivity(intent3);

                        return true;
                    case R.id.nav_share:
                        Intent intents= new Intent(Intent.ACTION_SEND);
                        intents.setType("text/plain");
                        intents.putExtra(Intent.EXTRA_SUBJECT,"check out this cool application");
                        intents.putExtra(Intent.EXTRA_TEXT,"your application is link here");
                        startActivity(Intent.createChooser(intents,"Share via"));
                        return true;
                    case R.id.nav_close:
                        moveTaskToBack(true);
                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                        return true;
                }
                return false;
            }
        });

        final DrawerLayout drawerLayout = findViewById(R.id.oromicdrawable);
        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        adapter=new OromicChapter(this, maintitle);
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