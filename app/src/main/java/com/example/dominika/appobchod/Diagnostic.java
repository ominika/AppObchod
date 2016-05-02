package com.example.dominika.appobchod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Diagnostic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnostic);

        Button setInvestigationButton = (Button) findViewById(R.id.SetInvestigationButton);
        assert setInvestigationButton != null;
        setInvestigationButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                setInvestigationOnClick();
            }
        });
    }

    public void setInvestigationOnClick(){
        Switch mySwitch = (Switch) findViewById(R.id.CITOSwitch);
        mySwitch.setChecked(false);
        //TODO: Add Investigation to database
    }
}
