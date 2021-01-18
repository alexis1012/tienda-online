package com.alexis.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {
    Spinner lista;
    String[] datos = {"Seleciona el color", "Blanco", "Azul", "Amabar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        lista = (Spinner) findViewById(R.id.lista2);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adaptador);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 1:
                        Toast to = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 2:
                        Toast to1 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 3:
                        Toast to2 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}