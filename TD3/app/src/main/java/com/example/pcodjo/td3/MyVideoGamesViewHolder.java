package com.example.pcodjo.td3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.pcodjo.td3.JeuVideo;
import com.example.pcodjo.td3.R;

public class MyVideoGamesViewHolder extends RecyclerView.ViewHolder{
    private TextView mNameTV;
    private TextView mPriceTV;

    public MyVideoGamesViewHolder(@NonNull View itemView) {
        super(itemView);
        mNameTV = itemView.findViewById(R.id.name);
        mPriceTV = itemView.findViewById(R.id.price);
    }
    void
    display(JeuVideo jeuVideo) {
        mNameTV.setText(jeuVideo.getNomjeu());
        mPriceTV.setText(jeuVideo.getPrix() + "$");
    }
}
