package com.brasikapps.contacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contacts> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvcontacts = (RecyclerView) findViewById(R.id.recyclerView);

        contacts = Contacts.createContactsList(20);

        ContactsAdapter adapter = new ContactsAdapter(contacts);

        rvcontacts.setAdapter(adapter);

        rvcontacts.setLayoutManager(new LinearLayoutManager(this));
    }
}
