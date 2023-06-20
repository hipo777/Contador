package org.matematicasfacil.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMostrar = findViewById(R.id.button1);
        Button btnContar = findViewById(R.id.button2);
        TextView textView = findViewById(R.id.textView);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Bienvenido al contador", Toast.LENGTH_SHORT).show();
            }
        });

        btnContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el número actual del TextView
                int numero = Integer.parseInt(textView.getText().toString());
                numero++;

                // Actualizar el TextView con el nuevo número
                textView.setText(String.valueOf(numero));
            }
        });
    }
}