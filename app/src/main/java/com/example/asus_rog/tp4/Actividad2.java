package com.example.asus_rog.tp4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Actividad2 extends AppCompatActivity implements View.OnClickListener {


    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);


        boton = (Button) findViewById(R.id.botonAcelga2);
        boton.setOnClickListener(this);

        boton = (Button) findViewById(R.id.botonCalabaza2);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonCerdo2);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonVaca2);
        boton.setOnClickListener(this);

        boton = (Button) findViewById(R.id.botonLeche2);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonPan2);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonPastas2);
        boton.setOnClickListener(this);

        boton = (Button) findViewById(R.id.botonPapas2);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonTomate2);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonUvas2);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.botonAcelga2:
                Toast.makeText(getApplicationContext(),"Verduras" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonCalabaza2:
                Toast.makeText(getApplicationContext(),"Verduras" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonCerdo2:
                Toast.makeText(getApplicationContext(),"Carne" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonVaca2:
                Toast.makeText(getApplicationContext(), "Carne", Toast.LENGTH_LONG).show();
                break;

            case R.id.botonLeche2:
                Toast.makeText(getApplicationContext(),"Lacteo" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonPan2:
                Toast.makeText(getApplicationContext(),"Carbohidrato" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonPastas2:
                Toast.makeText(getApplicationContext(), "Carbohidrato", Toast.LENGTH_LONG).show();
                break;

            case R.id.botonPapas2:
                Toast.makeText(getApplicationContext(),"Verduras" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonTomate2:
                Toast.makeText(getApplicationContext(),"Vegetales" , Toast.LENGTH_LONG).show();
                break;
            case R.id.botonUvas2:
                Toast.makeText(getApplicationContext(),"Fruta", Toast.LENGTH_LONG).show();
                break;
        }
    }
    @Override public boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_activity, mimenu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem opcion_menu){

        switch (opcion_menu.getItemId()) {
            case R.id.actividad1:
                //LLAMAR A LA ACTIVIDAD 1
                Intent i = new Intent(Actividad2.this, MainActivity.class);
                startActivity(i);
                return true;
            case R.id.actividad2:
                //LLAMAR A LA ACTIVIDAD 2                              //Actividad 2.class
                Intent i2 = new Intent(Actividad2.this, Actividad2.class);
                startActivity(i2);
                return true;
            case R.id.actividad3:
                //LLAMAR A LA ACTIVIDAD 3                              //Actividad 3.class
                Intent i3 = new Intent(Actividad2.this, Actividad3.class);
                startActivity(i3);
                return true;
            default:
                return super.onOptionsItemSelected(opcion_menu);
        }
    }
}
