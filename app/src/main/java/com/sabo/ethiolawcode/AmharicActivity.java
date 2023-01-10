package com.sabo.ethiolawcode;



import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.GravityCompat;


import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;


import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;


public class AmharicActivity extends AppCompatActivity {

    private Switch aSwitch;

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


        aSwitch=findViewById(R.id.switch_btn);
          aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if(isChecked){


                      getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                  }
                  else {

                      getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                  }
              }
          });



  final DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
  findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          drawerLayout.openDrawer(GravityCompat.START);
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