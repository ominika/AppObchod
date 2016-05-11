package com.example.dominika.appobchod;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShowPatientList extends AppCompatActivity {

    private ListView list;
    String[] items;
    ArrayList<String> patients = new ArrayList<String>();
    EditText editText;
    PatientListViewItemAdapter adapter;
    int editTextLastLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_patient_list);
        list = (ListView) findViewById(R.id.listView);
        editText = (EditText)findViewById(R.id.findPatientTextEdit);
        editTextLastLength = 0;

        initList();

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().equals(""))
                    initList();
                else
                    searchItem(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void initList()
    {
        items = new String[]{"Dominika Muzyka",     "Beata Szturemska",     "Jan Nowak",        "Patryk Gliszczyński",      "Małgorzata Janicka",
                             "Marek Muzyka",        "Patrycja Nowakowska"};
        patients = new ArrayList<>(Arrays.asList(items));
        //for(int i=0; i<9; i++)
        //data.add(new PatientListViewItem(i,cars[i]));
        adapter = new PatientListViewItemAdapter(this, R.layout.patient_listview_item, patients);
        list.setAdapter(adapter);
    }

    public void searchItem(String textToSearch){
        if(editTextLastLength > textToSearch.length())
            initList();
        editTextLastLength = textToSearch.length();
        for(String item:items){
            if(!item.toLowerCase().contains(textToSearch.toLowerCase()))
                patients.remove(item);
        }

        adapter.notifyDataSetChanged();
    }

    public void AddNewPatient(View view)
    {
        Intent intent = new Intent(ShowPatientList.this, Interview.class);
        startActivity(intent);
    }
}
