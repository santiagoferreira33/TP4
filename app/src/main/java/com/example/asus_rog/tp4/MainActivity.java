package com.example.asus_rog.tp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.botonAceite);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonAcelga);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonArroz);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonAzucar);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonCacao);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonCalabaza);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonCerdo);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonVaca);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonCerveza);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonHamburguesa);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonLeche);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonPan);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonPastas);
        boton.setOnClickListener(this);
        boton = (Button) findViewById(R.id.botonPizza);
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
            case R.id.botonAceite:
                Toast.makeText(getApplicationContext(), R.string.aceite_valor, Toast.LENGTH_LONG).show();
                    break;
            case R.id.botonAcelga:
                Toast.makeText(getApplicationContext(), R.string.acelga_valor, Toast.LENGTH_LONG).show();
                    break;
            case R.id.botonArroz:
                Toast.makeText(getApplicationContext(), R.string.arroz_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonAzucar:
                Toast.makeText(getApplicationContext(), R.string.azucar_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonCacao:
                Toast.makeText(getApplicationContext(), R.string.cacao_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonCalabaza:
                Toast.makeText(getApplicationContext(), R.string.calabaza_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonCerdo:
                Toast.makeText(getApplicationContext(), R.string.cerdo_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonVaca:
                Toast.makeText(getApplicationContext(), R.string.vaca_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonCerveza:
                Toast.makeText(getApplicationContext(), R.string.cerveza_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonHamburguesa:
                Toast.makeText(getApplicationContext(), R.string.hamburguesa_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonLeche:
                Toast.makeText(getApplicationContext(), R.string.leche_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonPan:
                Toast.makeText(getApplicationContext(), R.string.pan_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonPastas:
                Toast.makeText(getApplicationContext(), R.string.pastas_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonPizza:
                Toast.makeText(getApplicationContext(), R.string.pizza_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonPapas:
                Toast.makeText(getApplicationContext(), R.string.papas_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonTomate:
                Toast.makeText(getApplicationContext(), R.string.tomate_valor, Toast.LENGTH_LONG).show();
                break;
            case R.id.botonUvas:
                Toast.makeText(getApplicationContext(), R.string.uvas_valor, Toast.LENGTH_LONG).show();
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
                Intent i = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i);
                return true;
            case R.id.actividad2:
                //LLAMAR A LA ACTIVIDAD 2                              //Actividad 2.class
                Intent i2 = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i2);
                return true;
            case R.id.actividad3:
                //LLAMAR A LA ACTIVIDAD 3                              //Actividad 3.class
                Intent i3 = new Intent(MainActivity.this, MainActivity.class);
                startActivity(i3);
                return true;
            default:
                return super.onOptionsItemSelected(opcion_menu);
        }
    }
}
