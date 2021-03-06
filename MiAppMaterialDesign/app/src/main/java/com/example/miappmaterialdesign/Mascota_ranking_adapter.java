package com.example.miappmaterialdesign;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Mascota_ranking_adapter extends RecyclerView.Adapter<Mascota_ranking_adapter.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;

    public Mascota_ranking_adapter(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card_mascota, parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.img1.setImageResource(mascota.getImagen());
        mascotaViewHolder.tvTarjeta.setText(mascota.getNombre());
        mascotaViewHolder.tvRank.setText(Integer.toString(mascota.getPuntaje()));
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private final ImageView img1;
        private final TextView tvTarjeta;
        private final TextView tvRank;
        private ImageButton btLike;
        private ImageButton btRank;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);

            img1 = (ImageView) itemView.findViewById(R.id.img1);
            tvTarjeta = (TextView) itemView.findViewById(R.id.tvTarjeta);
            tvRank = (TextView) itemView.findViewById(R.id.tvRank);
            btLike = (ImageButton) itemView.findViewById(R.id.btLike);
            btRank = (ImageButton) itemView.findViewById(R.id.btRank);
        }
    }

}
