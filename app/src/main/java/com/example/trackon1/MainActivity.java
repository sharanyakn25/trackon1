package com.example.trackon1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner_select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner_select = findViewById(R.id.spinner_select);

        String[] Bus_num = getResources().getStringArray(R.array.Bus_Number);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,Bus_num);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_select.setAdapter(adapter);
    }
}