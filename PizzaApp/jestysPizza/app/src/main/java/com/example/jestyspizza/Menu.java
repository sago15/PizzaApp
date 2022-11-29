package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void productos(View v) {

        Intent intent = new Intent(this, MenuProducto.class);
        startActivity(intent);
    }
    public void inicio(View v) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}