package com.junsaga.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.junsaga.myapplication.R;
import com.junsaga.myapplication.model.Address;
import com.junsaga.myapplication.model.AddressList;

import java.util.ArrayList;

public class MapAdapter extends RecyclerView.Adapter<MapAdapter.ViewHolder> {

    Context context;
    ArrayList<Address> AddressArrayList;

    public MapAdapter(Context context, ArrayList<Address> addressArrayList) {
        this.context = context;
        this.AddressArrayList = addressArrayList;
    }

    @NonNull
    @Override
    public MapAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.place_row, parent, false);
        return new MapAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MapAdapter.ViewHolder holder, int position) {
        Address address = AddressArrayList.get(position);
    }

    @Override
    public int getItemCount() {
        return AddressArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName;
        TextView txtVicinity;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtVicinity = itemView.findViewById(R.id.txtVicinity);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
