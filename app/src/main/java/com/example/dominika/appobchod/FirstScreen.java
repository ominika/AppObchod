package com.example.dominika.appobchod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
    }

    public void showInterview(View v) {
        //setContentView(R.layout.activity_interview);
        Intent intent = new Intent(FirstScreen.this, Interview.class);
        startActivity(intent);
    }
}