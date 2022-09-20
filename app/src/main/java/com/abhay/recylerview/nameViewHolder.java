package com.abhay.recylerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class nameViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    View view;
    public nameViewHolder(@NonNull View itemView) {
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
        view = itemView;
    }
}
