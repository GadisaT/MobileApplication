package com.sabo.ethiolawcode;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;


import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class AmharicActivity extends AppCompatActivity {

DrawerLayout drawerLayout;
NavigationView navigationView;
Toolbar toolbar;
ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
       if(drawerToggle.onOptionsItemSelected(item)){
           return true;
       }
        return super.onOptionsItemSelected(item);
    }

    ListView list;

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

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationview);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.menu_open, R.string.menu_close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch ((item.getItemId())) {

                    case R.id.nav_home:
                        Log.i("MENU_DRAWER_TAG", "Home item is selected");
                        break;
                    case R.id.nav_language:
                        Log.i("MENU_DRAWER_TAG", "Language item is selected");
                        break;
                    case R.id.nav_search:
                        Log.i("MENU_DRAWER_TAG", "Search item is selected");
                        break;
                    case R.id.nav_settings:
                        Log.i("MENU_DRAWER_TAG", "Settings item is selected");
                        break;
                    case R.id.nav_history:
                        Log.i("MENU_DRAWER_TAG", "History item is selected");
                        break;
                    case R.id.nav_share:
                        Log.i("MENU_DRAWER_TAG", "Share item is selected");
                        break;
                }


                return false;
            }
        });


        AhmaricChapter adapter=new AhmaricChapter(this, maintitle);
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
}