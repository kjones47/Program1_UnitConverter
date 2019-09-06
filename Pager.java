package com.example.android.weather2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;
    public Pager(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount = tabCount;

    }

    public Fragment getItem(int position){
        switch(position) {
            case 0:
                Tab1_Fragment tab1_fragment = new Tab1_Fragment();
                return tab1_fragment;
            case 1:
                Tab2_Fragment tab2_fragment = new Tab2_Fragment();
                return tab2_fragment;
            default: return null;
        }
    }

    public int getCount(){
        return tabCount;
    }
}
