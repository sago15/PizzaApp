package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }
    public void inicio (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}