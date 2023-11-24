package com.example.telegram_main_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.telegram_main_java.R;
import com.example.telegram_main_java.model.Chat;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Chat> items;

    public ChatAdapter(Context context, ArrayList<Chat> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_view, parent, false);
        return new MessageViewHolder(view);
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_profile;
        TextView tv_fullname, tv_message, tv_time;

        public MessageViewHolder(View view) {
            super(view);
            iv_profile = view.findViewById(R.id.iv_profile);
            tv_fullname = view.findViewById(R.id.tv_fullname);
            tv_message = view.findViewById(R.id.tv_message);
            tv_time = view.findViewById(R.id.tv_time);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof MessageViewHolder) {
            MessageViewHolder messageViewHolder = (MessageViewHolder) holder;
            Chat chat = items.get(position);

            messageViewHolder.iv_profile.setImageResource(chat.getProfile());
            messageViewHolder.tv_fullname.setText(chat.getFullname());
            messageViewHolder.tv_message.setText(chat.getMessage());
            messageViewHolder.tv_time.setText(chat.getTime());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
