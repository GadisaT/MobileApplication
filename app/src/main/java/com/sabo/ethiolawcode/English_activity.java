package com.sabo.ethiolawcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class English_activity extends AppCompatActivity {
TextView tv1,tv2;
    ListView listview;
    String[] maintitle ={
            "EthioLawCode","CIVIL PROCEDURAL CODE",
            "CRIMINAL CODE","CRIMINAL CODE",
            "CRIMINAL CODE","CRIMINAL CODE","CRIMINAL CODE",
            "CRIMINAL CODE",
    };


    CustomeAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        listview=findViewById(R.id.english_main_layout);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.code_layout,R.id.name,maintitle);
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if(position == 0) {

                    Intent intent=new Intent(English_activity.this, CodeActivity.class);
                    intent.putExtra("position",position);
                    startActivity(intent);

                }

                else if(position == 1) {
                    Intent intent=new Intent(English_activity.this, CodeActivity.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }

                else if(position == 2) {

                    Intent intent=new Intent(English_activity.this, CodeActivity.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 3) {

                    Intent intent=new Intent(English_activity.this, CodeActivity.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 4) {

                    Intent intent=new Intent(English_activity.this, CodeActivity.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 5) {

                    Intent intent=new Intent(English_activity.this, CodeActivity.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }
                else if(position == 6) {

                    Intent intent=new Intent(English_activity.this, CodeActivity.class);
                    intent.putExtra("position",position);
                    startActivity(intent);

                }
                else if(position == 7) {

                    Intent intent=new Intent(English_activity.this, CodeActivity.class);
                    intent.putExtra("position",position);
                    startActivity(intent);
                }

            }
        });
    }
}


