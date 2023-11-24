package com.example.telegram_contacts_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.telegram_contacts_java.R;
import com.example.telegram_contacts_java.model.Contact;
import com.google.android.material.imageview.ShapeableImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int IS_BUTTON_TRUE = 1;
    private static final int IS_BUTTON_FALSE = 0;

    private Context context;
    private ArrayList<Contact> items;

    public ContactAdapter(Context context, ArrayList<Contact> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        return items.get(position).isButton() ? IS_BUTTON_TRUE : IS_BUTTON_FALSE;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        if (viewType == IS_BUTTON_TRUE) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact_button_view, parent, false);
        } else {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact_view, parent, false);
        }
        return new MessageViewHolder(view);
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_profile;
        TextView tv_fullname;

        public MessageViewHolder(View view) {
            super(view);
            iv_profile = view.findViewById(R.id.iv_profile);
            tv_fullname = view.findViewById(R.id.tv_fullname);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Contact contact = items.get(position);
        if (holder instanceof MessageViewHolder) {
            MessageViewHolder messageViewHolder = (MessageViewHolder) holder;

            messageViewHolder.iv_profile.setImageResource(contact.getProfile());
            messageViewHolder.tv_fullname.setText(contact.getFullname());
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
