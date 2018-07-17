package com.brasikapps.contacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ibrahim on 17/07/2018.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    public ContactsAdapter(List<Contacts> mContacts) {
        this.mContacts = mContacts;
    }

    private List<Contacts> mContacts;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();

        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact,parent,false);

        ViewHolder viewHolder = new ViewHolder(contactView);

        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Contacts contacts = mContacts.get(position);

        TextView textview = holder.nameTextView;
        textview.setText(contacts.getmName());
        Button button = holder.messageButton;
        button.setText(contacts.isOnline() ? "Message" : "Offline");
        button.setEnabled(contacts.isOnline());

    }


    @Override
    public int getItemCount() {
        return mContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTextView;
        public Button messageButton;

        public ViewHolder(View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.contact_name);
            messageButton = (Button) itemView.findViewById(R.id.message_button);
        }
    }
}
