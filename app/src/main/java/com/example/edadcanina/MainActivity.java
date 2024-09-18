package com.example.edadcanina;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edadEdit = findViewById(R.id.edad_edit);
        TextView resulTexto = findViewById(R.id.result_texto);
        Button boton = findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edad = edadEdit.getText().toString();
                if(!edad.isEmpty()) {
                    int edadInt = Integer.parseInt(edad);
                    int resultado = edadInt * 7;
                    String resultadoString = "La edad de un perro es de: " + resultado + " años";
                    resulTexto.setText(resultadoString);
                } else {
                    Toast.makeText(MainActivity.this,"SE DEBE CAPTURAR UNA EDAD", Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}


