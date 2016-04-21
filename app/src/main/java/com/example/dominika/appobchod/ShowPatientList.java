package com.example.dominika.appobchod;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowPatientList extends AppCompatActivity {

    private ListView list;
    private ArrayAdapter<String> adapter;
    Context context;
    int layoutResourceId;
    PatientListViewItem data[] = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_patient_list);

        list = (ListView) findViewById(R.id.listView);

        String cars[] = {"Dominika Muzyka", "Beata Szturemska", "Jan Nowak", "Agnieszka Krzemińska", "Paweł Chodzieski", "Jędrzej Gołębiewski", "Agata Kowalska", "Piotr Ratajczak", "Albert Einstein"};

        PatientListViewItem RowBean_data[] = new PatientListViewItem[9];
        for(int i=0; i<9; i++)
            RowBean_data[i] = (new PatientListViewItem(cars[i]));

        PatientListViewItemAdapter adapter = new PatientListViewItemAdapter(this, R.layout.patient_listview_item, RowBean_data);

        list.setAdapter(adapter);
    }
}
