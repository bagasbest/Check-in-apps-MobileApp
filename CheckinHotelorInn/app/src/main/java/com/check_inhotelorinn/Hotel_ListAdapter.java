package com.check_inhotelorinn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class Hotel_ListAdapter extends RecyclerView.Adapter<Hotel_ListAdapter.ListViewHolder> {
    private ArrayList<Hotel_Constructor> HotelList;



    public Hotel_ListAdapter (ArrayList<Hotel_Constructor> list){
        this.HotelList = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hotel, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Hotel_ListAdapter.ListViewHolder holder, final int position) {
        Hotel_Constructor hc = HotelList.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hc.getFoto())
                .apply(new RequestOptions().override(88,88))
                .into(holder.gambar);
        holder.tvNama.setText(hc.getNama());
        holder.tvDetail.setText(hc.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(HotelList.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return HotelList.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvDetail;
        ImageView gambar;

        ListViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.img_item_photo);
            tvNama = itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
        }
    }

    private OnItemClickCallback onItemClickCallback;

    public void SetOnItemClickCallback (OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public interface OnItemClickCallback{
        void onItemClicked(Hotel_Constructor hc);
    }
}
