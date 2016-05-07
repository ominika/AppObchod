package com.example.dominika.appobchod;

/**
 * Created by Dominika on 07.05.2016.
 */
public class Element {
    String name;
    String id;
    boolean checked = false;


    public Element(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
