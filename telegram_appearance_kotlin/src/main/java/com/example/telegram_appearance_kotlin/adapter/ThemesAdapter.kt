package com.example.telegram_appearance_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_appearance_kotlin.R
import com.example.telegram_appearance_kotlin.model.Theme

class ThemesAdapter(var context: Context, var themes: ArrayList<Theme>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.theme_item, parent, false)
        return MessageViewHolder(view)
    }

    class MessageViewHolder(var view: View): RecyclerView.ViewHolder(view) {
        var imgBack: ImageView
        var img1: ImageView
        var img2: ImageView
        var img3: ImageView
        init {
            imgBack = view.findViewById(R.id.imgBack)
            img1 = view.findViewById(R.id.img1)
            img2 = view.findViewById(R.id.img2)
            img3 = view.findViewById(R.id.img3)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val theme = themes[position]
        if(holder is MessageViewHolder) {
            var iv_imgBack = holder.imgBack
            var iv_img1 = holder.img1
            var iv_img2 = holder.img2
            var iv_img3 = holder.img3

            iv_imgBack.setImageResource(theme.imgBack)
            iv_img1.setImageResource(theme.img1)
            iv_img2.setImageResource(theme.img2)
            iv_img3.setImageResource(theme.img3)
        }
    }

    override fun getItemCount(): Int {
        return themes.size
    }
}