package com.example.android_telegram_ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_telegram_ui.R
import com.example.android_telegram_ui.adapter.ChatAdapter
import com.example.android_telegram_ui.model.Chat

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    fun initView() {
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList<Chat>()
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", "Yes you are good at programming", "2:41 PM"))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", "What was the question?", "1:55 AM"))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Shall we start our lesson?", "Yesterday"))
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", "Yes you are good at programming", "2:41 PM"))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", "What was the question?", "1:55 AM"))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Shall we start our lesson?", "Yesterday"))
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", "Yes you are good at programming", "2:41 PM"))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", "What was the question?", "1:55 AM"))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Shall we start our lesson?", "Yesterday"))
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", "Yes you are good at programming", "2:41 PM"))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", "What was the question?", "1:55 AM"))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Shall we start our lesson?", "Yesterday"))
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", "Yes you are good at programming", "2:41 PM"))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", "What was the question?", "1:55 AM"))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Shall we start our lesson?", "Yesterday"))
        return chats
    }
}