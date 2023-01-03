package com.sabo.ethiolawcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CodeDetailActivity extends AppCompatActivity {
TextView dtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_detail_layout);
        dtext=findViewById(R.id.dtext);
        String details=getIntent().getStringExtra("detail");
        dtext.setText(details);

    }
}