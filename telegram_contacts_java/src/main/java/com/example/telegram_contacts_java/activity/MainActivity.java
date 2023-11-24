package com.example.telegram_contacts_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.telegram_contacts_java.R;
import com.example.telegram_contacts_java.adapter.ContactAdapter;
import com.example.telegram_contacts_java.model.Contact;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
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
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        refreshAdapter(getAllChats());
    }

    private void refreshAdapter(ArrayList<Contact> chats) {
        ContactAdapter adapter = new ContactAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Contact> getAllChats() {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(R.drawable.ic_location, "Find People Nearby", true));
        contacts.add(new Contact(R.drawable.ic_invite_friends, "Invite Friends", true));
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false));
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false));
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false));
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false));
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", false));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", false));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", false));
        return contacts;
    }
}
