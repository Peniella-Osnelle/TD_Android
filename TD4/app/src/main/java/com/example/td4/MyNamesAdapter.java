package com.example.td4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyNamesAdapter  extends RecyclerView.Adapter<MyNamesViewHolder>{

    private List<RepoList> mesOwners;
    public MyNamesAdapter(List<RepoList> mesOwners) {
        this.mesOwners = mesOwners;
    }
    @NonNull
    @Override
    public MyNamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_owner, parent, false);
        return new MyNamesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyNamesViewHolder holder, int position) {
        holder.display(mesOwners.get(position));
    }

    @Override
    public int getItemCount() {

        return mesOwners.size();
    }
}

