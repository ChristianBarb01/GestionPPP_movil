package com.example.movilprepracticasprofesional;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

@SuppressLint("WrongViewCast")
public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        loginbutton= findViewById(R.id.loginbutton);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("wosita") && password.getText().toString().equals("12345")){
                    Intent vntmenustudiante=new Intent(MainActivity.this,bienvenida.class);
                    startActivity(vntmenustudiante);
                }else if(username.getText().toString().equals("cordinador") && password.getText().toString().equals("12345")){
                    Toast.makeText(MainActivity.this, "Cordinador", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();


                }

               /* if(username.getText().toString().equals("cordinador") && password.getText().toString().equals("12345")){
                    Toast.makeText(MainActivity.this, "Cordinador", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
                }*/

              /*  if(username.getText().toString().equals("empresa") && password.getText().toString().equals("12345")){
                    Intent vntmenustudiante=new Intent(MainActivity.this,bienvenida.class);
                    startActivity(vntmenustudiante);
                }else{
                    Toast.makeText(MainActivity.this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
                }*/
            }
        });

    }

    public void logueado(View view) {
        


    }


}