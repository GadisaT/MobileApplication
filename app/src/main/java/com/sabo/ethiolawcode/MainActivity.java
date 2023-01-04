package com.sabo.ethiolawcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button amharic,oromic,english;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amharic = findViewById(R.id.amharicbtn);
        oromic = findViewById(R.id.oromobtn);
        english = findViewById(R.id.englishbtn);

        amharic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent amharic = new Intent(MainActivity.this, AmharicActivity.class);
                startActivity(amharic);

            }

        });
        oromic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oromo = new Intent(MainActivity.this, OromicActivity.class);
                startActivity(oromo);

            }

        });
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent english = new Intent(MainActivity.this, EnglishActivity.class);
                startActivity(english);

            }

        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case  R.id.itemhome:

                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                return true;
            case  R.id.itemlanguage:

                return true;
            case  R.id.itemsetting:

                return true;
            case  R.id.itemexit:
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}