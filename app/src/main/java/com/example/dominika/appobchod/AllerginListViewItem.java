package com.example.dominika.appobchod;

import java.io.Serializable;

/**
 * Created by Beata on 09.05.2016.
 */
public class AllerginListViewItem implements Serializable {
    private static final long serialVersionUID = -5435670920302756945L;

    public int id;
    public String name;

    public AllerginListViewItem() {

    }

    public AllerginListViewItem(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}