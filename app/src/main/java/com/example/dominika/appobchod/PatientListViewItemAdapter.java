package com.example.dominika.appobchod;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Beata on 21.04.2016.
 * Jestem magiczną klasą, nie próbuj mnie zrozumieć ;)
 */
public class PatientListViewItemAdapter extends ArrayAdapter<PatientListViewItem> {
    Context context;
    int layoutResourceId;
    PatientListViewItem data[] = null;

    public PatientListViewItemAdapter(Context context, int layoutResourceId, PatientListViewItem[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RowBeanHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new RowBeanHolder();
            holder.txtTitle = (TextView)row.findViewById(R.id.danepacjenta);

            row.setTag(holder);
        }
        else
        {
            holder = (RowBeanHolder)row.getTag();
        }

        PatientListViewItem object = data[position];
        holder.txtTitle.setText(object.title);

        return row;
    }

    static class RowBeanHolder
    {
        TextView txtTitle;
    }
}

