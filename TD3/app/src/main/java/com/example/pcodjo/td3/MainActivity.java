package com.example.pcodjo.td3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CREER ICI UNE LISTE DE JEUX VIDEO NOMMEE mesJeux ET REMPLISSEZ LA DE JeuxVideo
       List<JeuVideo> mesJeux=new ArrayList<>();
       JeuVideo jeu1=new JeuVideo("PS4", 1200);
       mesJeux.add(jeu1);
       JeuVideo jeu2=new JeuVideo("PS2", 1000);
       mesJeux.add(jeu2);
       JeuVideo jeu3=new JeuVideo("Nitendo", 600);
       mesJeux.add(jeu3);



        RecyclerView myRecyclerView = findViewById(R.id.myRecyclerView);
        myRecyclerView.setLayoutManager(new LinearLayoutManager (this));
        myRecyclerView.setAdapter(new MyVideosGamesAdapter(mesJeux));
    }
}
