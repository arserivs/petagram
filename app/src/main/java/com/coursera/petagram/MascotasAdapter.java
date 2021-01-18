package com.coursera.petagram;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MascotasAdapter extends RecyclerView.Adapter<MascotasAdapter.MascotasViewHolder>{

    Activity activity ;
    ArrayList<Mascota> mascotas ;

    public MascotasAdapter(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas ;
        this.activity = activity ;
    }

    @NonNull
    @Override
    public MascotasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas, parent, false) ;
        return new MascotasViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotasViewHolder holder, int position) {

        Mascota mascota = mascotas.get(position) ;
        holder.imgFoto.setImageResource(mascota.getFoto());
        holder.txtNombre.setText(mascota.getNombre());
        holder.txtSumaLikes.setText(String.valueOf(mascota.getLikes()));

        holder.imgHuesoLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mascota.sumarLike();
                holder.txtSumaLikes.setText(String.valueOf(mascota.getLikes()));
                holder.imgHuesoLike.setVisibility(View.GONE);
                holder.imgHuesoLikeAzul.setVisibility(View.VISIBLE);

            }
        });
;
        holder.imgHuesoLikeAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mascota.restarLike();
                holder.txtSumaLikes.setText(String.valueOf(mascota.getLikes()));
                holder.imgHuesoLikeAzul.setVisibility(View.GONE);
                holder.imgHuesoLike.setVisibility(View.VISIBLE);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotasViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto ;
        private ImageView imgHuesoLike ;
        private ImageView imgHuesoLikeAzul ;
        private TextView txtNombre ;
        private TextView txtSumaLikes ;

        public MascotasViewHolder(View itemView) {
            super(itemView) ;
            imgFoto = itemView.findViewById(R.id.cardview_mascotas_img) ;
            imgHuesoLike = itemView.findViewById(R.id.cardview_mascotas_hueso_like) ;
            imgHuesoLikeAzul = itemView.findViewById(R.id.cardview_mascotas_hueso_like_azul) ;
            txtNombre = itemView.findViewById(R.id.cardview_mascotas_nombre) ;
            txtSumaLikes = itemView.findViewById(R.id.cardview_mascotas_likes) ;
        }
    }
}
