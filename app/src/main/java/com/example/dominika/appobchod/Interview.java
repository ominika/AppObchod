package com.example.dominika.appobchod;

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

        listenClicks();
    }

    private void listenClicks() {
        Button add_alergy = (Button) findViewById(R.id.button_add_alergy);
        Button add_med = (Button) findViewById(R.id.button_add_med);
        Button add_disease = (Button) findViewById(R.id.button_add_disease);
        assert add_alergy != null;
        assert add_med != null;
        assert add_disease != null;

        add_alergy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setContentView(R.layout.activity_alergy);
            }
        });

        add_med.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setContentView(R.layout.activity_alergy);
            }
        });

        add_disease.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setContentView(R.layout.activity_alergy);
            }
        });


    }

    //TODO walidacja pesel
    /*private boolean isValidPesel(View v) {
        boolean check = false;
        EditText psl = (EditText) findViewById(R.id.patientPESEL);
        String pesel = psl.getText().toString();

        if(pesel.matches("[0-9]{11}$")) {
            if(pesel.length() < 6 || pesel.length() > 13) {
                check = false;
                Log.e("Validation","Not Valid PESEL");
            }
            else {
                check = true;
            }
        }
        else {
            check=false;
        }
        return check;
    }*/
}
