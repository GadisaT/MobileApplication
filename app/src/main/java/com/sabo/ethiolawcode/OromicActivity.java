package com.sabo.ethiolawcode;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;


import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;

import com.google.android.material.navigation.NavigationView;

import java.util.Map;
import java.util.Set;

public class OromicActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ListView list;

    String[] maintitle ={
            "Seera Siviilii","Seera deemsa falmii siviilii",
            "Seera yakkaa","Seera deemsa falmii yakkaa",
            "Koodii daldalaa","Koodii maatii fooyya’e","Seera Hojjetaa",
            "Adeemsa bulchiinsaa",
    };

  private DrawerLayout drawerLayout;
   SharedPreferences preferences;
   int NightMode;
   SharedPreferences sharedPreferences;
   SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oromic);

        sharedPreferences=getSharedPreferences("SharedPrefs",MODE_PRIVATE);
        NightMode=sharedPreferences.getInt("NightModeInt",1);
        AppCompatDelegate.setDefaultNightMode(NightMode);



         drawerLayout=findViewById(R.id.drawerLayout);
        Toolbar toolbar=findViewById(R.id.toolbar);

        NavigationView navigationView=findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();


        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.menu_open,R.string.menu_close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        if(savedInstanceState==null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }


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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Home()).commit();
                break;
            case R.id.nav_search:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Searchclass()).commit();
                break;
            case R.id.nav_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Settings()).commit();
                break;
            case R.id.nav_language:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Language()).commit();
                break;
            case R.id.nav_mode:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new TextAppearance()).commit();
                break;

            case R.id.nav_share:
                Intent intent=new Intent(this,SendActivity.class);
                startActivity(intent);
                break;
        }


        drawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {

            super.onBackPressed();
        }
    }
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        NightMode=AppCompatDelegate.getDefaultNightMode();

        sharedPreferences=getSharedPreferences("SharedPrefs",MODE_PRIVATE);
        editor=sharedPreferences.edit();

        editor.putInt("NightModeInt",NightMode);
        editor.apply();
    }
}