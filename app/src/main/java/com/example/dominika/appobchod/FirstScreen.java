package com.example.dominika.appobchod;

import android.content.Intent;
import android.content.res.AssetManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class FirstScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        Button next = (Button) findViewById(R.id.doctor);
        assert next != null;
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setContentView(R.layout.doctor_1_ll);
            }
        });
    }

    public void DoctorButtonOnClick(View view)
    {
        Intent intent = new Intent(FirstScreen.this, ShowPatientList.class);
        startActivity(intent);
    }

    public void order(View v) {
        String xx = "";

        try {
            AssetManager am = getAssets();
            InputStream is = am.open("patient_hospital.xls");
            Workbook wb = Workbook.getWorkbook(is);
            Sheet s = wb.getSheet(0);
            int row = s.getRows();
            int col = s.getColumns();

            for (int i = 0; i<row; i++) {
                for (int j = 0; j<col; j++) {
                    Cell c = s.getCell(j,i);
                    xx += "\t" + c.getContents();
                }
                xx += "\n";
            }
            display(xx);
        } catch (Exception e) {

        }
    }
    public void display(String value) {
        TextView x = (TextView) findViewById(R.id.patients_hospital);
        x.setText(value);
    }

    public void addPatient(View v) {
        setContentView(R.layout.add_patient);
    }

    public void showAlert(View v) {
        AlertDialog.Builder ad = new AlertDialog.Builder(this);
        ad.setMessage("Gratulacje lekarzu! Dodano pacjenta na oddział!").create();
        ad.setTitle("Komunikat");
        ad.show();
    }

    public void comeBack(View v) {
        setContentView(R.layout.doctor_1_ll);
    }
}