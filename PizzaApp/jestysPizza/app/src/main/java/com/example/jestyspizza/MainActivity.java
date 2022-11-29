package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarSesion(View v) {

        Intent intent = new Intent(this, IniciarSesion.class);
        startActivity(intent);
    }
    public void registrarUser (View v){
        Intent intent = new Intent(this, Registrarse.class);
        startActivity(intent);

    }
    public void pedirOnline (View v){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}