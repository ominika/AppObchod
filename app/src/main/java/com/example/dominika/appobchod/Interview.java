package com.example.dominika.appobchod;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Pattern;

public class Interview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interview);

        Button next = (Button) findViewById(R.id.button_add_alergy);
        assert next != null;
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Interview.this, ShowAllerginList.class);
                startActivity(intent);
            }
        });
    }

    public void ShowAllerginScreen(View w){
        Intent intent = new Intent(Interview.this, ShowAllerginList.class);
        startActivity(intent);
    }

    public void showAlert(View v) {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setMessage("Gratulacje lekarzu! Dodano pacjenta na oddział!").create();
        ad.setTitle("Komunikat");
        ad.show();
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
