package com.demoApp.whatsappclone;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.demoApp.whatsappclone.Frags.CallFragment;
import com.demoApp.whatsappclone.Frags.ChatFragment;
import com.demoApp.whatsappclone.Frags.ContactsFragment;

public class FragAdapter extends FragmentPagerAdapter {

    private Context mCOntext;
    private int tabCount;


    public FragAdapter(@NonNull FragmentManager fm , Context context, int tabs) {
        super(fm);
        this.mCOntext = context;
        this.tabCount = tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
       switch (position){
           case 0:
               CallFragment callFragment = new CallFragment();
               return callFragment;
           case 1:
               ChatFragment chatFragment =new ChatFragment();
               return chatFragment;
           case 2:
               ContactsFragment contactsFragment=new ContactsFragment();
               return contactsFragment;
           default:
               return null;
       }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
