package com.example.miappmaterialdesign;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;

public class mascotas_ranking extends AppCompatActivity {


    private RecyclerView listaMascotas;
    public Mascota_ranking_adapter adapter;
    ArrayList<Mascota> mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_ranking);
        Toolbar ActBar = (Toolbar) findViewById(R.id.ActBar);
        setSupportActionBar(ActBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasRank);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializaListaMascotas();

        inicializaAdaptador();
    }

    public void inicializaAdaptador() {
        adapter = new Mascota_ranking_adapter(mascotas, this);
        listaMascotas.setAdapter(adapter);
    }

    public void inicializaListaMascotas() {
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.perro1, "Toby",50));
        mascotas.add(new Mascota(R.drawable.perro2, "Uma",2));
        mascotas.add(new Mascota(R.drawable.perro3, "Bako",38));
        mascotas.add(new Mascota(R.drawable.perro4, "Hugo", 5));
        mascotas.add(new Mascota(R.drawable.perro5, "Tango",22));
    }
}