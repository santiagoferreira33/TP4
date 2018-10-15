package com.example.asus_rog.tp4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Actividad2   extends AppCompatActivity implements View.OnClickListener {


    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);


        boton = (Button) findViewById(R.id.botonAcelga);
        boton.setOnClickListener(this);

        boton = (Button) findViewById(R.id.botonCalabaza);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonCerdo);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonVaca);
        boton.setOnClickListener(this);

        boton = (Button) findViewById(R.id.botonLeche);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonPan);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonPastas);
        boton.setOnClickListener(this);

        boton = (Button) findViewById(R.id.botonPapas);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonTomate);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonUvas);
        boton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.botonAcelga:
                Toast.makeText(getApplicationContext(),"Verduras" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonCalabaza:
                Toast.makeText(getApplicationContext(),"Verduras" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonCerdo:
                Toast.makeText(getApplicationContext(),"Carne" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonVaca:
                Toast.makeText(getApplicationContext(), "Carne", Toast.LENGTH_LONG).show();
                break;

            case R.id.botonLeche:
                Toast.makeText(getApplicationContext(),"Lacteo" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonPan:
                Toast.makeText(getApplicationContext(),"Carbohidrato" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonPastas:
                Toast.makeText(getApplicationContext(), "Carbohidrato", Toast.LENGTH_LONG).show();
                break;

            case R.id.botonPapas:
                Toast.makeText(getApplicationContext(),"Verduras" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonTomate:
                Toast.makeText(getApplicationContext(),"Vegetales" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonUvas:
                Toast.makeText(getApplicationContext(),"Fruta", Toast.LENGTH_LONG).show();
                break;
        }
    }


















}
