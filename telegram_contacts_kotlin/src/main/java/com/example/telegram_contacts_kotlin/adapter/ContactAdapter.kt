package com.example.telegram_contacts_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_contacts_kotlin.R
import com.example.telegram_contacts_kotlin.model.Contact
import com.google.android.material.imageview.ShapeableImageView

class ContactAdapter(var context: Context, var items: ArrayList<Contact>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val IS_BUTTON_TRUE = 1
    private val IS_BUTTON_FALSE = 0

    override fun getItemViewType(position: Int): Int {
        return if(items[position].isButton) {
            IS_BUTTON_TRUE
        } else IS_BUTTON_FALSE
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == IS_BUTTON_TRUE) {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact_button_view, parent, false)
            return MessageViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact_view, parent, false)
        return MessageViewHolder(view)
    }

    class MessageViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val contact = items[position]
        if(holder is MessageViewHolder) {
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname

            iv_profile.setImageResource(contact.profile)
            tv_fullname.text = contact.fullname
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}