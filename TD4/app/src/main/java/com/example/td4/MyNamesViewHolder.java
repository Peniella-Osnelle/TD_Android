package com.example.td4;

import android.view.View;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class MyNamesViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTV;
    private TextView loginTV;
    private TextView idTV;


    public MyNamesViewHolder(@NonNull View itemView) {
        super(itemView);

        nameTV=itemView.findViewById(R.id.name);
        loginTV = itemView.findViewById(R.id.login);
        idTV = itemView.findViewById(R.id.id);
    }
    void
    display(RepoList owner) {
        nameTV.setText(owner.getName());
        loginTV.setText(owner.getOwner().getLogin());
    }
}
