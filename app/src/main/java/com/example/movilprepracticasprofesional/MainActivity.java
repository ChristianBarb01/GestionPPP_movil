package com.example.movilprepracticasprofesional;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

@SuppressLint("WrongViewCast")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickButton(View view) {
        Intent vtn2= new Intent(this, bienvenida.class );
        startActivity(vtn2);
    }
  //  Button myButton;{myButton = findViewById(R.id.iconImageView);}




}