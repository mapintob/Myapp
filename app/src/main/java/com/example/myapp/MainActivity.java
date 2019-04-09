package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int resultado = verificar();
        Toast.makeText(this, "Bienvenido al curso Android: "+resultado, Toast.LENGTH_SHORT).show();
        Persona p = new Persona("juan");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();    	Toast.makeText(this,"onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"onStop",Toast.LENGTH_SHORT).show();
    }


    private int verificar(){
        int nro1 = 5;
        int nro2 = 10;
        int nro3 = 20;

        if(nro1>nro2) {
            return 0;
        }else{
            if(nro3>nro1) {
                return nro3;
            }else{
                return nro1;
            }
        }
    }
    public class Persona {
        public String nombre;

        Persona(String nombre){
            this.nombre = nombre;
        }
    }

}
