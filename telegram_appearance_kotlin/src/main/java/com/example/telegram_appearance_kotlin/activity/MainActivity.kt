package com.example.telegram_appearance_kotlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_appearance_kotlin.R
import com.example.telegram_appearance_kotlin.adapter.ThemesAdapter
import com.example.telegram_appearance_kotlin.model.Theme


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        refreshAdapter(getAllThemes())
    }

    fun refreshAdapter(themes: ArrayList<Theme>) {
        val adapter = ThemesAdapter(this, themes)
        recyclerView.adapter = adapter
    }

    fun getAllThemes(): ArrayList<Theme> {
        val themes: ArrayList<Theme> = ArrayList<Theme>()
        themes.add(Theme(R.color.black, R.drawable.telegram_oval2, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.drawable.telegram_theme2, R.drawable.telegram_oval3, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.drawable.telegram_theme3, R.drawable.telegram_oval4, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.drawable.telegram_theme4, R.drawable.telegram_oval5, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.color.black, R.drawable.telegram_oval2, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.drawable.telegram_theme2, R.drawable.telegram_oval3, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.drawable.telegram_theme3, R.drawable.telegram_oval4, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.drawable.telegram_theme4, R.drawable.telegram_oval5, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.color.black, R.drawable.telegram_oval2, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.drawable.telegram_theme2, R.drawable.telegram_oval3, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.drawable.telegram_theme3, R.drawable.telegram_oval4, R.drawable.telegram_oval1, R.drawable.telegram_home))
        themes.add(Theme(R.drawable.telegram_theme4, R.drawable.telegram_oval5, R.drawable.telegram_oval1, R.drawable.telegram_home))

        return themes
    }
}