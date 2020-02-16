package com.example.pcodjo.td3;

public class JeuVideo {
    String Nomjeu;
    Integer Prix;

    public JeuVideo(String nom,int prix)
    {
        Nomjeu=nom;
        Prix=prix;
    }

    public String getNomjeu() {
        return Nomjeu;
    }

    public void setNomjeu(String nomjeu) {
        Nomjeu = nomjeu;
    }

    public int getPrix() {
        return Prix;
    }

    public void setPrix(int prix) {
        Prix = prix;
    }
}
