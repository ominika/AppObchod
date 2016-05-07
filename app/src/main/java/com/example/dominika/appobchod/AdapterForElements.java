package com.example.dominika.appobchod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dominika on 07.05.2016.
 */
public class AdapterForElements extends ArrayAdapter <Element> {

    private List<Element> elementList;
    private Context context;


    public AdapterForElements(List<Element> elementList, Context context) {
        super(context, R.layout.single_list_view, elementList);
        this.elementList = elementList;
        this.context = context;
    }

    private static class ElementHolder {
        public TextView elementName;
        public TextView elementId;
        public CheckBox chkbox;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        ElementHolder holder = new ElementHolder();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.single_list_view, null);
            holder.elementName = (TextView) v.findViewById(R.id.name);
            holder.elementId = (TextView) v.findViewById(R.id.id);
            holder.chkbox = (CheckBox) v.findViewById(R.id.chk_box);

            //holder.chkbox.setOnCheckedChangeListener((Interview) context);
        } else {
            holder = (ElementHolder) v.getTag();
        }

        Element e = elementList.get(position);
        holder.elementName.setText(e.getName());
        holder.elementId.setText(e.getId());
        holder.chkbox.setChecked(e.isChecked());
        holder.chkbox.setTag(e);

        return v;
    }
}
