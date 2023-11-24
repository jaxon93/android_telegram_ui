package com.example.telegram_appearance_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.telegram_appearance_java.R;
import com.example.telegram_appearance_java.model.Theme;

import java.util.ArrayList;

public class ThemesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Theme> themes;

    public ThemesAdapter(Context context, ArrayList<Theme> themes) {
        this.context = context;
        this.themes = themes;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.theme_item, parent, false);
        return new MessageViewHolder(view);
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        ImageView imgBack;
        ImageView img1;
        ImageView img2;
        ImageView img3;

        public MessageViewHolder(View view) {
            super(view);
            imgBack = view.findViewById(R.id.imgBack);
            img1 = view.findViewById(R.id.img1);
            img2 = view.findViewById(R.id.img2);
            img3 = view.findViewById(R.id.img3);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Theme theme = themes.get(position);
        if (holder instanceof MessageViewHolder) {
            MessageViewHolder messageViewHolder = (MessageViewHolder) holder;

            messageViewHolder.imgBack.setImageResource(theme.getImgBack());
            messageViewHolder.img1.setImageResource(theme.getImg1());
            messageViewHolder.img2.setImageResource(theme.getImg2());
            messageViewHolder.img3.setImageResource(theme.getImg3());
        }
    }

    @Override
    public int getItemCount() {
        return themes.size();
    }
}
