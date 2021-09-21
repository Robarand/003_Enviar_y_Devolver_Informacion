package com.example.a003_enviar_y_devolver_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Todas las actividades (salvo la del launcher) tienen acceso al Intent que la creo
        Intent intent = getIntent();
        String extra = intent.getStringExtra("TEXTO");
        Bundle bundle = intent.getExtras();
        if (bundle != null){
            String cadena = bundle.getString("CADENA");
            Float decimal = bundle.getFloat("FLOAT");

            Toast.makeText(this, cadena, Toast.LENGTH_SHORT).show();
        }
    }
}