package com.example.dominika.appobchod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
/*
TODO: Musisz sobie dodać w widoku teraz dwa przyciski
ZAPISZ który przeleci przez wszystkie elementy, sprawdzi czy są selected i doda do bazy
DODAJ nowy allergen i okno wprowadzenia nowego alergeniu
 */
public class ShowAllerginList extends AppCompatActivity {

    private ListView list;
    String[] items;
    ArrayList<String> allergins = new ArrayList<String>();
    EditText editText;
    AllerginListViewItemAdapter adapter;
    int editTextLastLength;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_allergin_list);
        list = (ListView) findViewById(R.id.listView);
        editText = (EditText)findViewById(R.id.findAllerginTextEdit);
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
        items = new String[]{"Alergenik1", "Alegren2", "Pelargina", "Paracetamol", "Muuuuzyka"};
        allergins = new ArrayList<>(Arrays.asList(items));
        Collections.sort(allergins);
        //for(int i=0; i<9; i++)
        //data.add(new PatientListViewItem(i,cars[i]));
        adapter = new AllerginListViewItemAdapter(this, R.layout.allergin_list_view_item,  allergins);
        list.setAdapter(adapter);
    }

    public void searchItem(String textToSearch){
        if(editTextLastLength > textToSearch.length())
            initList();
        editTextLastLength = textToSearch.length();
        for(String item:items){
            if(!item.contains(textToSearch))
                allergins.remove(item);
        }

        adapter.notifyDataSetChanged();
    }
}
