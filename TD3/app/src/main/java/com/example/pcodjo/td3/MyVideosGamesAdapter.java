package com.example.pcodjo.td3;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pcodjo.td3.JeuVideo;
import com.example.pcodjo.td3.MyVideoGamesViewHolder;
import com.example.pcodjo.td3.R;

import java.util.List;

public class MyVideosGamesAdapter extends RecyclerView.Adapter<MyVideoGamesViewHolder> {

    private List<JeuVideo> mesJeux;
    public MyVideosGamesAdapter(List<JeuVideo> mesJeux) {
        this.mesJeux = mesJeux;
    }
    @NonNull
    @Override
    public MyVideoGamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_jeu_video, parent, false);
        return new MyVideoGamesViewHolder(view);
    }
    @Override
    public void onBindViewHolder
            (@NonNull MyVideoGamesViewHolder holder, int position) {
        holder.display(mesJeux.get(position));
    }
    @Override
    public int getItemCount() {
        return mesJeux.size();
    }
}
