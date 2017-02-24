package com.example.mike.projectx.FirstTabs;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mike.projectx.R;

import java.io.File;

/**
 * Created by Mike on 11/21/2016.
 */


public class Tab3 extends android.support.v4.app.Fragment {
TextView dwnlist;
    String name;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab3, container, false);
        dwnlist=(TextView)v.findViewById(R.id.txt1);
        File sdCardRoot = Environment.getExternalStorageDirectory();
        File yourDir = new File(sdCardRoot, "/Mike/");
        for (File f : yourDir.listFiles()) {
            if (f.isFile())
                 name = f.getName();
            dwnlist.setText(name);
            // make something with the name
        }

        return v;

    }
}
