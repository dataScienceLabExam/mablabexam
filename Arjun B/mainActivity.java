package com.example.alumni_portal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText u,p;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        u=findViewById(R.id.user);
        p=findViewById(R.id.pass);
        b=findViewById(R.id.btn);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user=u.getText().toString().trim();
                String pass=p.getText().toString().trim();

                if(user.equals("")){
//                    Toast.makeText(MainActivity.this, "enter the user name", Toast.LENGTH_SHORT).show();
                    u.setError("enter the username");
                }
                if(pass.equals("")){
//                    Toast.makeText(MainActivity.this, "enter the password", Toast.LENGTH_SHORT).show();
                    p.setError("enter the password");
                }
                else{
                    Intent i=new Intent(getApplicationContext(),reg_form.class);
                    startActivity(i);
                }
            }
        });
    }
}
