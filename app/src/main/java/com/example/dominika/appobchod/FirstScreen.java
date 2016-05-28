package com.example.dominika.appobchod;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
/*
        Button next2 = (Button) findViewById(R.id.nurse);
        assert next2 != null;
        next2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //setContentView(R.layout.activity_show_patient_list_2);
                Intent intent = new Intent(FirstScreen.this, ShowAllerginList.class);
                startActivity(intent);
            }
        });*/
    }
    public void DoctorButtonOnClick(View view)
    {
        Intent intent = new Intent(FirstScreen.this, Interview.class);
        startActivity(intent);
    }

    public void NurseButtonOnClick(View view)
    {
        Intent intent = new Intent(FirstScreen.this, ShowPatientList.class);
        startActivity(intent);
    }

    public void TechnicalButtonOnClick(View view)
    {
        Intent intent = new Intent(FirstScreen.this, ShowAllerginList.class);
        startActivity(intent);
    }
}
