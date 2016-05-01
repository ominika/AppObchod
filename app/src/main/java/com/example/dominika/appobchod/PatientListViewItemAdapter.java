package com.example.dominika.appobchod;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.Console;
import java.util.List;

/**
 * Created by Beata on 21.04.2016.
 * Jestem magiczną klasą, nie próbuj mnie zrozumieć ;)
 */
public class PatientListViewItemAdapter extends ArrayAdapter<String> {

    private int layout;

    public PatientListViewItemAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
        layout = resource;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        RowHolder myRowHolder = null;
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(layout,parent,false);
            RowHolder rowHolder = new RowHolder();
            rowHolder.patientName = (TextView) convertView.findViewById(R.id.list_item_text_view);
            rowHolder.setInvestigationButton = (Button) convertView.findViewById(R.id.list_item_SetInvestigationButton);
            rowHolder.setMedicamentButton = (Button) convertView.findViewById(R.id.list_item_SetMedicamentButton);
            rowHolder.setInvestigationButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(),"Buttpn was clicked for list item "+position, Toast.LENGTH_SHORT).show();
                }
            });
            convertView.setTag(rowHolder);
        }
        else{
            myRowHolder = (RowHolder) convertView.getTag();
            myRowHolder.patientName.setText(getItem(position));
        }
        return super.getView(position, convertView, parent);
    }

    public class RowHolder{
        //PatientListViewItem patientListViewItem;
        TextView patientName;
        Button setInvestigationButton;
        Button setMedicamentButton;
    }
}
