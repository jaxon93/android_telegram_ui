package com.example.telegram_contacts_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.telegram_contacts_kotlin.R
import com.example.telegram_contacts_kotlin.adapter.ContactAdapter
import com.example.telegram_contacts_kotlin.model.Contact

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

    fun refreshAdapter(chats: ArrayList<Contact>) {
        val adapter = ContactAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Contact> {
        val contacts: ArrayList<Contact> = ArrayList<Contact>()
        contacts.add(Contact(R.drawable.ic_location, "Find People Nearby", true))
        contacts.add(Contact(R.drawable.ic_invite_friends, "Invite Friends", true))
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false))
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false))
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false))
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false))
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false))
        return contacts
    }
}