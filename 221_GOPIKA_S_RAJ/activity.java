package com.example.myapplication;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private EditText uname,email,phone,age,pwd,ed;
    private RadioGroup gn;
    private Spinner dg;
    private Button b;
    String user,mail,phn,ag,pswd,sp;
    int gndr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText) findViewById(R.id.name);
        email=(EditText) findViewById(R.id.email);
        phone=(EditText) findViewById(R.id.phone);
        age=(EditText) findViewById(R.id.age);
        pwd=(EditText) findViewById(R.id.pwd);
        //gn=(RadioGroup) findViewById(R.id.gender);
        ed=(EditText) findViewById(R.id.edu);
        //dg=(Spinner) findViewById(R.id.edu);
        b=(Button) findViewById(R.id.reg);

        List<String> items=new ArrayList<>();
        items.add(0,"Select your degree");
        items.add("MCA");
        items.add("BCA");
        items.add("MSc");
        items.add("Bsc");


        ArrayAdapter<String> dataAdapter;
        dataAdapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item,items);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dg.setAdapter(dataAdapter);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                user=uname.getText().toString().trim();
                mail=email.getText().toString().trim();
                phn=phone.getText().toString().trim();
                ag=age.getText().toString().trim();
                pswd=pwd.getText().toString().trim();
                sp=dg.getSelectedItem().toString().trim();
                gndr=gn.getCheckedRadioButtonId();

                if(user.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your username", Toast.LENGTH_SHORT).show();
                }
                else if(mail.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your email", Toast.LENGTH_SHORT).show();
                }
                else if(phn.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your phone number", Toast.LENGTH_SHORT).show();
                }
                else if(ag.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your age", Toast.LENGTH_SHORT).show();
                }
                else if(gndr==-1)
                {
                    Toast.makeText(MainActivity.this, "Enter your gender", Toast.LENGTH_SHORT).show();
                }
                else if(sp.equals("Select your degree"))
                {
                    Toast.makeText(MainActivity.this, "Enter your degree", Toast.LENGTH_SHORT).show();
                }
                else if(pswd.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter your password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                }




            }
        });


    }


}