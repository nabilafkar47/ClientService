package com.nabil.datamahasiswa;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView tvNrp, tvNama, tvEmail, tvJurusan;
    CardView cardView;
    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        tvNrp = itemView.findViewById(R.id.tvNrp);
        tvNama = itemView.findViewById(R.id.tvNama);
        tvEmail = itemView.findViewById(R.id.tvEmail);
        tvJurusan = itemView.findViewById(R.id.tvJurusan);
        cardView = itemView.findViewById(R.id.main_container);

    }
}
