package com.examples.smorcuende.ciclo_vida_app;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

/**
 * Vamos a comprobar mediante el Log
 * por dónde se pasa en el ciclo de vida de una Activity según las acciones que iniciemos
 */
public class MainActivity extends Activity {

    private final String myTag ="CicloDeVida";

    // Tag para controlar los mensajes del Log

    // Métodos sobreescritos de Activity ordenador por orden cronológico de ejecución:

    // Los de comienzo:
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(myTag, "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(myTag, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(myTag, "onResume()");
    }




    // No siempre se tiene que pasar por aquí
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(myTag, "onRestart()");
    }



    // Los de cierre:
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(myTag, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(myTag, "onStop()");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(myTag, "onDestroy()");

    }



    // Botón que pulsamos cuando vamos atrás
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
