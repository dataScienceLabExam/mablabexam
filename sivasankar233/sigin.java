package com.example.mcm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, timid;
    EditText s1;
    String s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextTextPersonName);
        timid =findViewById(R.id.editTextTextPersonName2);

    }

   // @Override
   // protected void onSaveInstanceState(@NonNull Bundle outState) {
    //    s1=name;
     //   SharedPreferences sharedPreferences=getSharedPreferences(String.valueOf(name), Context.MODE_PRIVATE);

    //    super.onSaveInstanceState(outState);
    //}

    public void change(View view){
        Intent in=new Intent(this,sigin.class);
        startActivity(in);

    }
}
