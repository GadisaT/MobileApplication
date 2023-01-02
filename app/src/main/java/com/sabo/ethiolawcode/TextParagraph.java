package com.sabo.ethiolawcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TextParagraph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_paragraph);
        TextView text;
            text=findViewById(R.id.txt1);
            String boqonna= getIntent().getStringExtra("Chapter");
            text.setText(boqonna);
        }
    }
