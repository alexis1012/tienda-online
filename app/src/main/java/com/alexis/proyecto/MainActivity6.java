package com.alexis.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    Spinner lista1;
    String[] datos = {"Seleciona el color","BLANCO NEUTRAL" , "BLANCO CALIDO" , "ROJO" , "AZUL" , "AMBAR" , "NARANJA" , "ROSA" , "MORADO" , "VERDE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        lista1 = (Spinner)findViewById(R.id.lista);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datos);
        lista1.setAdapter(adaptador);

        lista1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 1:
                        Toast to = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 2:
                        Toast to1 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 3:
                        Toast to2 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 4:
                        Toast to3 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 5:
                        Toast to4 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 6:
                        Toast to5 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 7:
                        Toast to6 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 8:
                        Toast to7 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;
                    case 9:
                        Toast to8 = Toast.makeText(getApplicationContext(), datos[i], Toast.LENGTH_LONG);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}