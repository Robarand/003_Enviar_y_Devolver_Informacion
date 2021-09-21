package com.example.a003_enviar_y_devolver_informacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // 1. Atributos para las vistas
    private Button btnActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity2 = findViewById(R.id.btnActivity2Main);

        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity2 = new Intent(MainActivity.this, MainActivity2.class);
                activity2.putExtra("TEXTO", "Esto es un texto");
                Bundle mochila = new Bundle();
                mochila.putString("CADENA", "Esto es un string");
                mochila.putFloat("FLOAT",12.3f);
                activity2.putExtras(mochila);

                startActivity(activity2);
            }
        });
    }
}