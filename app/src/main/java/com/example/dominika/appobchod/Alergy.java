package com.example.dominika.appobchod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Alergy extends AppCompatActivity {

    private Button bt;
    private ListView lv;
    private ArrayList<String> strArr;
    private ArrayAdapter<String> adapter;
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alergy);

        bt = (Button) findViewById(R.id.button);
        lv = (ListView) findViewById(R.id.listView);
        et = (EditText) findViewById(R.id.editText);
        strArr = new ArrayList<String>();

        for (int i = 0; i < 2; i++) {
            strArr.add("Alergen: " + i);
        }
        adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, strArr);
        lv.setAdapter(adapter);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                strArr.add(et.getText().toString());
                adapter.notifyDataSetChanged();
                et.getText().clear();
            }

        });
    }
}
