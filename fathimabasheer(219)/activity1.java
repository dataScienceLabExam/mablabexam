package com.example.labxam;

import static com.example.labxam.R.id.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register = findViewById(R.id.b2);
        e1 = (EditText) findViewById(user);
        e2 = (EditText) findViewById(R.id.pass);
    }

    public void save(View view) {
        SharedPreferences sp = new SharedPreferences();
        getSharedPreferences();
        getSharedPreferences() {
            e1 = getText().tostring().trim();
            e2 = getText().tostring().trim();

        }

    }


    public void next(View view) {
        Intent crt=new Intent();
        startActivity(crt ,activity2.class);


    }




}