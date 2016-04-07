package com.example.yessy.lisview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    ListaAdapter adapter;



    String[] titulo = new String[]{
            "YOGA",
            "JUGUETONA",

            "EXPLORADORA",
            "TIMIDA",
    };

    int[] imagenes = {
            R.drawable.dog,
            R.drawable.sasha,
            R.drawable.doki,
            R.drawable.jachy
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lista = (ListView) findViewById(R.id.listView1);
        adapter = new ListaAdapter(this, titulo, imagenes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent pos1=new Intent(MainActivity.this,OnList.class);
                        startActivity(pos1);
                        Toast.makeText(getApplicationContext(), "Cargar", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Intent pos2=new Intent(MainActivity.this,OnList1.class);
                        startActivity(pos2);
                        Toast.makeText(getApplicationContext(), "posicion" + position, Toast.LENGTH_SHORT).show();
                        break;

                }


            }
        });




    }
}