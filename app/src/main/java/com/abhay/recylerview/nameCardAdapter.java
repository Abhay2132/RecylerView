package com.abhay.recylerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class nameCardAdapter extends RecyclerView.Adapter<nameViewHolder>{

    List<nameData> names;
    Context context;
    ClickListener listener;

    public nameCardAdapter(List<nameData> names, Context context, ClickListener listener) {
        this.names = names;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public nameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View name_view = inflater.inflate(R.layout.name_card, parent, false);
        nameViewHolder nameHolder = new nameViewHolder(name_view);

        return nameHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull nameViewHolder holder, int position) {
        final int index = holder.getAdapterPosition();
        final String naam = names.get(position).name;
        holder.name.setText(naam);
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.click(naam);
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
