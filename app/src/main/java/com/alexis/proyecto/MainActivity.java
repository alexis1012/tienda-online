package com.alexis.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button crear, iniciar;
    private EditText usuario;
    private EditText contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crear = (Button)findViewById(R.id.crear);
        iniciar = (Button)findViewById(R.id.iniciar);
        usuario = (EditText)findViewById(R.id.usuario);
        contraseña = (EditText)findViewById(R.id.contreseña);
        SharedPreferences preferences1 = getSharedPreferences("datos", Context.MODE_PRIVATE);
        usuario.setText( preferences1.getString("nombre","")   );
        if(preferences1.contains("nombre")) {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
            finish();
        }

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
                SharedPreferences preferences1 = getSharedPreferences("datos", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences1.edit();
                String datos = usuario.getText().toString();
                String Cont = contraseña.getText().toString();

                editor.putString("nombre",datos);
                editor.putString("contrasena",Cont);
                editor.commit();

                //Toast.makeText(this, "Bienvenido Tienda", Toast.LENGTH_LONG).show();
                Intent inicio = new Intent(MainActivity.this, MainActivity14.class);
                startActivity(inicio);
            }
        });
    }
}