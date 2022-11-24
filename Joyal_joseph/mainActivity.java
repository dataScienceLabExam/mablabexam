package com.example.alumniportal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button button =findViewById(R.id.btn1);
       EditText ed1=findViewById(R.id.usrn);
       EditText ed2=findViewById(R.id.pass);
        String user=ed1.getText().toString();
        String pass=ed2.getText().toString();
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                   if(user.equals("joyal")&&pass.equals("12345")) {
                       Intent in = new Intent(getApplicationContext(), MainActivity2.class);
                       startActivity(in);
                       Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                   }
                   else
                   {
                       Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_SHORT).show();
                   }
           }
       });
    }
}
