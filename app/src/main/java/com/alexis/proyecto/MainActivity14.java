package com.alexis.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity14 extends AppCompatActivity {

    Button buho, fococ6, focos8, tiramultiled, led_pellizco, direneon, direled, direilu, tiraled, multipelliz, ojoangel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        buho = (Button)findViewById(R.id.buho);
        fococ6 = (Button)findViewById(R.id.fococ6);
        focos8 = (Button)findViewById(R.id.focos8);
        tiramultiled = (Button)findViewById(R.id.tiramultiled);
        led_pellizco = (Button)findViewById(R.id.led_pellizco);
        direneon = (Button)findViewById(R.id.direneon);
        direled = (Button)findViewById(R.id.direled);
        direilu = (Button)findViewById(R.id.direilu);
        tiraled = (Button)findViewById(R.id.tiraled);
        multipelliz = (Button)findViewById(R.id.multipelliz);
        ojoangel = (Button)findViewById(R.id.ojoangel);

        buho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity8.class);
                startActivity(intent);
            }
        });
        focos8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity13.class);
                startActivity(intent);
            }
        });
        fococ6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity12.class);
                startActivity(intent);
            }
        });
        tiramultiled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity11.class);
                startActivity(intent);
            }
        });
        led_pellizco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity10.class);
                startActivity(intent);
            }
        });
        direneon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity3.class);
                startActivity(intent);
            }
        });
        direled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity4.class);
                startActivity(intent);
            }
        });
        direilu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity5.class);
                startActivity(intent);
            }
        });
        tiraled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity6.class);
                startActivity(intent);
            }
        });
        multipelliz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity7.class);
                startActivity(intent);
            }
        });
        ojoangel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(MainActivity14.this, MainActivity9.class);
                startActivity(intent);
            }
        });
    }
}