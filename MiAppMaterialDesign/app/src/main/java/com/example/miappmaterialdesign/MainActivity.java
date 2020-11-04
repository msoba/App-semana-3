package com.example.miappmaterialdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<Mascota> pets;
    private RecyclerView listaMascotas;
    public Mascota_adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar ActBar = (Toolbar) findViewById(R.id.ActBar);
        setSupportActionBar(ActBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializaListaMascotas();

        inicializaAdaptador();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent i = new Intent(this, mascotas_ranking.class);
        startActivity(i);
        return super.onOptionsItemSelected(item);
    }

    public void inicializaAdaptador() {
        adapter = new Mascota_adapter(pets, this);
        listaMascotas.setAdapter(adapter);
    }

    public void inicializaListaMascotas() {
        pets = new ArrayList<Mascota>();
        pets.add(new Mascota(R.drawable.perro1, "Toby"));
        pets.add(new Mascota(R.drawable.perro2, "Uma"));
        pets.add(new Mascota(R.drawable.perro3, "Bako"));
        pets.add(new Mascota(R.drawable.perro4, "Hugo"));
        pets.add(new Mascota(R.drawable.perro5, "Tango"));
        pets.add(new Mascota(R.drawable.perro6, "Pepe"));
        pets.add(new Mascota(R.drawable.perro7, "Lisa"));

    }
}