package com.example.jameel.app_0_assignmentintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView) findViewById(R.id.txtViewDisplay);
        Intent intent = getIntent();
        String name = intent.getStringExtra("myName");
        textView.setText(name);
    }
}