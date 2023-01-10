package com.sabo.ethiolawcode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button amharic,oromicbtn,englishbtn;
   TextView textView,language,search,setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amharic = findViewById(R.id.amharicbtn);
        oromicbtn = findViewById(R.id.oromobtn);

        englishbtn = findViewById(R.id.englishbtn);
        englishbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EnglishActivity.class);
                startActivity(intent);

            }

        });

        amharic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AmharicActivity.class);
                startActivity(intent);

            }

        });
        oromicbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OromicActivity.class);
                startActivity(intent);

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionmenu,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case  R.id.itemhome:

                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
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