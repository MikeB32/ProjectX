package com.example.mike.projectx;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.mike.projectx.FirstTabs.Tab1;
import com.example.mike.projectx.FirstTabs.Tab2;
import com.example.mike.projectx.FirstTabs.Tab3;
import com.example.mike.projectx.FirstTabs.Tab4;
import com.example.mike.projectx.FirstTabs.Tab5;
import com.example.mike.projectx.FirstTabs.Tab6;
import com.example.mike.projectx.FirstTabs.Tab7;

/**
 * Created by Mike on 11/21/2016.
 */

public class Pager extends FragmentStatePagerAdapter{


    int tabCount;

    public Pager(FragmentManager fm,int tabCount) {

        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Tab1 tab1= new Tab1();
                return tab1;
            case 1:
                Tab2 tab2= new Tab2();
                return tab2;
            case 2:
                Tab3 tab3= new Tab3();
                return tab3;
            case 3:
                Tab4 tab4= new Tab4();
                return tab4;
            case 4:
                Tab5 tab5= new Tab5();
                return tab5;
            case 5:
                Tab6 tab6= new Tab6();
                return tab6;
            case 6:
                Tab7 tab7= new Tab7();
                return tab7;


            default:
                return null;


        }

    }


    @Override
    public int getCount() {
        return tabCount;
    }
}
