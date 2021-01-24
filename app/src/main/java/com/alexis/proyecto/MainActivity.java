package com.alexis.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button crear, iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crear = (Button)findViewById(R.id.crear);
        iniciar = (Button)findViewById(R.id.iniciar);

        crear.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v){

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        }
        });
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent inicio = new Intent(MainActivity.this, MainActivity14.class);
                startActivity(inicio);
            }
        });

    }
}