package com.example.alumni_portal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class reg_form extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_form);

        e1=findViewById(R.id.fname);
        e2=findViewById(R.id.lname);
        e3=findViewById(R.id.dob);
        e4.findViewById(R.id.place);
        b=findViewById(R.id.reg);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString().trim();
                String s2=e2.getText().toString().trim();
                String s3=e3.getText().toString().trim();
                String s4=e4.getText().toString().trim();

                if(s1.equals("")){
                    Toast.makeText(reg_form.this, "enter the first name", Toast.LENGTH_SHORT).show();
                }
                else if(s2.equals("")){
                    Toast.makeText(reg_form.this, "enter the last name", Toast.LENGTH_SHORT).show();
                }
                else if(s3.equals("")){
                    Toast.makeText(reg_form.this, "enter the passing out year", Toast.LENGTH_SHORT).show();
                }
                else if(s4.equals("")){
                    Toast.makeText(reg_form.this, "enter the place", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
