package com.example.aplicacionieca.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplicacionieca.R;

import java.util.ArrayList;

public class SessionAdapter extends RecyclerView.Adapter<SessionAdapter.ViewHolder> {

    private final ArrayList<SessionModel> sessionModels;

    public SessionAdapter(ArrayList<SessionModel> sessionModels, Context context) {
        this.sessionModels = sessionModels;
    }

    @NonNull
    @Override
    public SessionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cards, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SessionAdapter.ViewHolder holder, int position) {
        SessionModel model = sessionModels.get(position);
        holder.imageView.setImageResource(model.getImage());
        holder.title.setText(model.getTitle());
        holder.description.setText(model.getDescription());
    }

    @Override
    public int getItemCount() {
        return sessionModels.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView imageView;
        private TextView title, description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_card);
            title = itemView.findViewById(R.id.title_card);
            description = itemView.findViewById(R.id.description_card);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            //Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
