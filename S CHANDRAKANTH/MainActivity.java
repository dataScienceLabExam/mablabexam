package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name,place,pname,phone,pwd,email,age;
    private RadioGroup gn;
    private Button b;
    String uname,uplace,upname,mail,phn,ag,pass;
    int gndr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.a);
        place=(EditText) findViewById(R.id.b);
        pname=(EditText) findViewById(R.id.c);
        phone=(EditText) findViewById(R.id.d);
        gn=(RadioGroup) findViewById(R.id.ge);
        pwd=(EditText) findViewById(R.id.e);
        email=(EditText) findViewById(R.id.f);
        age=(EditText) findViewById(R.id.h);
        b=(Button) findViewById(R.id.bt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                uname=name.getText().toString().trim();
                uplace=place.getText().toString().trim();
                upname=pname.getText().toString().trim();
                mail=email.getText().toString().trim();
                phn=phone.getText().toString().trim();
                ag=age.getText().toString().trim();
                pass=pwd.getText().toString().trim();
                gndr=gn.getCheckedRadioButtonId();


                if(uname.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Name of the fans club", Toast.LENGTH_SHORT).show();
                }
                else if (uplace.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Place of the club", Toast.LENGTH_SHORT).show();
                }
                else if (upname.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Player name", Toast.LENGTH_SHORT).show();
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
                else if(pass.equals(""))
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
