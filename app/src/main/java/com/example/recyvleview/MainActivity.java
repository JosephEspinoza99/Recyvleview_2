package com.example.recyvleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] datos =
                new
                        String[]{"Opcion 1","Opcion 2","Opcion 3","Opcion 4","Opcion 5"};
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);
        Spinner Opciones = (Spinner) findViewById(R.id.opciones);
         adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item
        );
         Opciones.setAdapter(adaptador);
         Opciones.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView Estado=findViewById(R.id.estado);
        Estado.setText("Seleccionado"+" "+adapterView.getItemAtPosition(i));

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
     public void BtSiguiente (View view) {
         Intent intent = new Intent(MainActivity.this, MainActivity2.class);
         startActivity(intent);

     }

}