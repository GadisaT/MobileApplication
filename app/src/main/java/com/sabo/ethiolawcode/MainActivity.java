package com.sabo.ethiolawcode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
//                Toast.makeText(this, "Home item selected", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
                return true;
            case  R.id.itemlanguage:
//                Toast.makeText(this, "Language item selected", Toast.LENGTH_SHORT).show();
                return true;
            case  R.id.itemsetting:
//                Toast.makeText(this, "setting item selected", Toast.LENGTH_SHORT).show();
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