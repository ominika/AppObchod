package com.example.dominika.appobchod;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Interview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);

        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setMessage("Utworzono interview").create();
        ad.setTitle("Komunikat");
        ad.show();
    }

    public void showList2(View v) {
        Intent intent = new Intent(Interview.this, Alergy.class);
        startActivity(intent);
    }

    private void showAlert(View v) {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setMessage("Kliknieto").create();
        ad.setTitle("Komunikat");
        ad.show();
    }

    //TODO walidacja pesel
}
