package com.example.dominika.appobchod;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ShowPatientList extends AppCompatActivity {

    private ListView list;
    ArrayList<String> patients = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_patient_list);
        list = (ListView) findViewById(R.id.listView);


        patients.add("Dominika Muzyka");
        patients.add("Beata Szturemska");
        patients.add("Jan Nowak");
        patients.add("Agnieszka Krzemińska");
        patients.add("Paweł Chodzieski");
        patients.add("Jędrzej Gołębiewski");
        patients.add("Agata Kowalska");
        patients.add("Piotr Ratajczak");
        patients.add("Albert Einstein");
        patients.add("Patryk Gliszczyński");
        patients.add("Małgorzata Janicka");

        //for(int i=0; i<9; i++)
            //data.add(new PatientListViewItem(i,cars[i]));

        list.setAdapter(new PatientListViewItemAdapter(this, R.layout.patient_listview_item, patients));
    }
}
