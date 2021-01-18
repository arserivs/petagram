package com.coursera.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayoutManager llm = new LinearLayoutManager(this) ;
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        RecyclerView listaMascotas = findViewById(R.id.main_recyclerview) ;
        listaMascotas.setLayoutManager(llm);

        ArrayList<Mascota> mascotas = new ArrayList<Mascota>() {{
            add(new Mascota(R.drawable.perro1, "Rambo", 2)) ;
            add(new Mascota(R.drawable.perro2, "Terry", 0)) ;
            add(new Mascota(R.drawable.perro7, "Arya", 10)) ;
            add(new Mascota(R.drawable.perro3, "Spike", 1)) ;
            add(new Mascota(R.drawable.perro4, "Lucky", 5)) ;
            add(new Mascota(R.drawable.perro5, "Laika", 9)) ;
            add(new Mascota(R.drawable.perro6, "Bobby", 0)) ;
        }};

        MascotasAdapter adaptador = new MascotasAdapter(mascotas, this) ;
        listaMascotas.setAdapter(adaptador);


    }
}