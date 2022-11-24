package com.ajil.fansclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText club_name,country,place,nteam,player,slogan,name,age,email,phone,password;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        club_name = findViewById(R.id.name);
        country = findViewById(R.id.country);
        place = findViewById(R.id.place);
        nteam = findViewById(R.id.nteam);
        player = findViewById(R.id.player);
        slogan = findViewById(R.id.slogan);
        name = findViewById(R.id.n);
        age = findViewById(R.id.age);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.Phone);
        password = findViewById(R.id.Password);
        b = findViewById(R.id.button);
    }
    public void onClick(View view){
        if(club_name.getText().toString()==""){
            Toast.makeText(this, "Enter the ClubName", Toast.LENGTH_SHORT).show();
        }
        else if(country.getText().toString()==""){
            Toast.makeText(this, "Enter your country", Toast.LENGTH_SHORT).show();
        }
        else if(place.getText().toString()==""){
            Toast.makeText(this, "Enter your place", Toast.LENGTH_SHORT).show();
        }
        else if(nteam.getText().toString()==""){
            Toast.makeText(this, "Enter your favorite national team", Toast.LENGTH_SHORT).show();
        }
        else if(player.getText().toString()==""){
            Toast.makeText(this, "Enter your favorite player", Toast.LENGTH_SHORT).show();
        }
        else if(name.getText().toString()==""){
            Toast.makeText(this, "Enter your name", Toast.LENGTH_SHORT).show();
        }
        else if(age.getText().toString()==""){
            Toast.makeText(this, "Enter your age", Toast.LENGTH_SHORT).show();
        }
        else if(email.getText().toString()==""){
            Toast.makeText(this, "Enter your email", Toast.LENGTH_SHORT).show();
        }
        else if(phone.getText().toString()==""){
            Toast.makeText(this, "Enter your phone numer", Toast.LENGTH_SHORT).show();
        }
        else if(password.getText().toString()==""){
            Toast.makeText(this, "Enter your password", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();
        }
            //Intent intent=new Intent(this,option_menu.class);
            //startActivity(intent);
        }
    }

