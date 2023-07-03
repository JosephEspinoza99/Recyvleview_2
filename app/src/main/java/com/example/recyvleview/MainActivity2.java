package com.example.recyvleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final String[] datos =
                new
                        String[]{"Joseph Espinoza","Maria Jaramillo","Bia Espinoza","Dominic Espinoza","Domina Espinoza"};
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        datos);
        ListView lstOpciones =
                (ListView)findViewById(R.id.lista);
        lstOpciones.setAdapter(adaptador2);
        lstOpciones.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView Estado=findViewById(R.id.seleccion);
        Estado.setText("Seleccionado"+" "+adapterView.getItemAtPosition(i));
    }
    public void BtSiguiente (View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivity(intent);

    }

}