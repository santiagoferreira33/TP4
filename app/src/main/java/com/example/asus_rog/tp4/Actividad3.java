package com.example.asus_rog.tp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Actividad3 extends AppCompatActivity {
    public Button webview1;
    public Button webview2;

    public void init(){

        webview1 = (Button)findViewById(R.id.webview1);
        webview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent redir = new Intent(Actividad3.this,Pagina1.class);
                startActivity(redir);
            }
        });

        webview2 = (Button)findViewById(R.id.webview2);
        webview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent redir2 = new Intent(Actividad3.this,Pagina2.class);
                startActivity(redir2);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
        init();
    }

    @Override public boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_activity, mimenu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem opcion_menu){

        switch (opcion_menu.getItemId()) {
            case R.id.actividad1:
                //LLAMAR A LA ACTIVIDAD 1
                Intent i = new Intent(Actividad3.this, MainActivity.class);
                startActivity(i);
                return true;
            case R.id.actividad2:
                //LLAMAR A LA ACTIVIDAD 2                              //Actividad 2.class
                Intent i2 = new Intent(Actividad3.this, MainActivity.class);
                startActivity(i2);
                return true;
            case R.id.actividad3:
                //LLAMAR A LA ACTIVIDAD 3                              //Actividad 3.class
                Intent i3 = new Intent(Actividad3.this, Actividad3.class);
                startActivity(i3);
                return true;
            default:
                return super.onOptionsItemSelected(opcion_menu);
        }
    }
}
