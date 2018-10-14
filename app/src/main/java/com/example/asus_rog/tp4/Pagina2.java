package com.example.asus_rog.tp4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Pagina2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina2);

        WebView view = (WebView) findViewById(R.id.webView2);
        view.getSettings().setJavaScriptEnabled(true); //permite que algunas paginas funcionen bien
        view.getSettings().setBuiltInZoomControls(true); //permite el zoom si la pagina no es responsive
        view.loadUrl("http://www.objetivobienestar.com/nueva-piramide-alimenticia_11360_102.html");

        //metodo que permite navegar dentro del webview sin abrir el navegador
        view.setWebViewClient(new WebViewClient(){
            public boolean shouldOverriceUrlLoading(WebView view, String url){
                return false; //permite que la pagina se refresque en el webview
            }


        });
    }
    @Override public boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(R.menu.menu_activity, mimenu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem opcion_menu){

        switch (opcion_menu.getItemId()) {
            case R.id.actividad1:
                //LLAMAR A LA ACTIVIDAD 1
                Intent i = new Intent(Pagina2.this, MainActivity.class);
                startActivity(i);
                return true;
            case R.id.actividad2:
                //LLAMAR A LA ACTIVIDAD 2                              //Actividad 2.class
                Intent i2 = new Intent(Pagina2.this, MainActivity.class);
                startActivity(i2);
                return true;
            case R.id.actividad3:
                //LLAMAR A LA ACTIVIDAD 3                              //Actividad 3.class
                Intent i3 = new Intent(Pagina2.this, Actividad3.class);
                startActivity(i3);
                return true;
            default:
                return super.onOptionsItemSelected(opcion_menu);
        }
    }
}
