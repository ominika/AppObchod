package com.example.dominika.appobchod;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ShowPatientList extends AppCompatActivity {

    private ListView list;
    List<PatientListViewItem> data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_patient_list);
        list = (ListView) findViewById(R.id.listView);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Dominika Muzyka");
        cars.add("Beata Szturemska");
       /* {
                ,
                ,
                "Jan Nowak",
                "Agnieszka Krzemińska",
                "Paweł Chodzieski",
                "Jędrzej Gołębiewski",
                "Agata Kowalska",
                "Piotr Ratajczak",
                "Albert Einstein",
                "Patryk Gliszczyński",
                "Małgorzata Janicka"};*/
        //System.out.println("TUUUUUUUUUUU");
        //for(int i=0; i<9; i++)
            //data.add(new PatientListViewItem(i,cars[i]));

        //adapter = new PatientListViewItemAdapter(ShowPatientList.this, R.layout.patient_listview_item, data);
        list.setAdapter(new PatientListViewItemAdapter(this, R.layout.patient_listview_item, cars));
    }
}
