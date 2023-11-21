package com.example.android_telegram_ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_telegram_ui.R
import com.example.android_telegram_ui.model.Chat
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context, var items: ArrayList<Chat>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent, false)
        return MessageViewHolder(view)
    }

    class MessageViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var tv_message: TextView
        var tv_time: TextView
        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
            tv_message = view.findViewById(R.id.tv_message)
            tv_time = view.findViewById(R.id.tv_time)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]
        if(holder is MessageViewHolder) {
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_message = holder.tv_message
            var tv_time = holder.tv_time

            iv_profile.setImageResource(chat.profile)
            tv_fullname.text = chat.fullname
            tv_message.text = chat.message
            tv_time.text = chat.time
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}