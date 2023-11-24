package com.example.telegram_main_java.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.telegram_main_java.R;
import com.example.telegram_main_java.adapter.ChatAdapter;
import com.example.telegram_main_java.model.Chat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void initView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        refreshAdapter(getAllChats());
    }

    public void refreshAdapter(ArrayList<Chat> chats) {
        ChatAdapter adapter = new ChatAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    public ArrayList<Chat> getAllChats() {
        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", "Yes, you are good at programming", "2:41 PM"));
        chats.add(new Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", "What was the question?", "1:55 AM"));
        chats.add(new Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Shall we start our lesson?", "Yesterday"));
        chats.add(new Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", "Yes, you are good at programming", "2:41 PM"));
        chats.add(new Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", "What was the question?", "1:55 AM"));
        chats.add(new Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Shall we start our lesson?", "Yesterday"));
        chats.add(new Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", "Yes, you are good at programming", "2:41 PM"));
        chats.add(new Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", "What was the question?", "1:55 AM"));
        chats.add(new Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Shall we start our lesson?", "Yesterday"));
        chats.add(new Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", "Yes, you are good at programming", "2:41 PM"));
        chats.add(new Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", "What was the question?", "1:55 AM"));
        chats.add(new Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Shall we start our lesson?", "Yesterday"));
        return chats;
    }
}
