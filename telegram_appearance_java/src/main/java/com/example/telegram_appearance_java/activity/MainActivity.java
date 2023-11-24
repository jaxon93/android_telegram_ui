package com.example.telegram_appearance_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.telegram_appearance_java.R;
import com.example.telegram_appearance_java.adapter.ThemesAdapter;
import com.example.telegram_appearance_java.model.Theme;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        refreshAdapter(getAllThemes());
    }

    private void refreshAdapter(ArrayList<Theme> themes) {
        ThemesAdapter adapter = new ThemesAdapter(this, themes);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Theme> getAllThemes() {
        ArrayList<Theme> themes = new ArrayList<>();
        themes.add(new Theme(R.color.black, R.drawable.telegram_oval2, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.drawable.telegram_theme2, R.drawable.telegram_oval3, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.drawable.telegram_theme3, R.drawable.telegram_oval4, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.drawable.telegram_theme4, R.drawable.telegram_oval5, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.color.black, R.drawable.telegram_oval2, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.drawable.telegram_theme2, R.drawable.telegram_oval3, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.drawable.telegram_theme3, R.drawable.telegram_oval4, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.drawable.telegram_theme4, R.drawable.telegram_oval5, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.color.black, R.drawable.telegram_oval2, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.drawable.telegram_theme2, R.drawable.telegram_oval3, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.drawable.telegram_theme3, R.drawable.telegram_oval4, R.drawable.telegram_oval1, R.drawable.telegram_home));
        themes.add(new Theme(R.drawable.telegram_theme4, R.drawable.telegram_oval5, R.drawable.telegram_oval1, R.drawable.telegram_home));

        return themes;
    }
}
