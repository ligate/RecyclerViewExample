package com.brasikapps.contacts;

import java.util.ArrayList;

/**
 * Created by Ibrahim on 17/07/2018.
 */

public class Contacts {


    public Contacts(String mName, boolean mOnline) {
        this.mName = mName;
        this.mOnline = mOnline;
    }

    private String mName;
    private boolean mOnline;



    public String getmName() {
        return mName;
    }

    public boolean isOnline() {
        return mOnline;
    }

    private static int lastContactId = 0;

    public static ArrayList<Contacts> createContactsList(int numContacts){


        ArrayList<Contacts> contacts = new ArrayList <Contacts>();

        for(int i=1; i<=numContacts; i++){
            contacts.add(new Contacts("person" +  ++lastContactId, i<=numContacts/2));
        }
   return contacts;
      }
   }
