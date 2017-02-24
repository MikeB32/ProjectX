package com.example.mike.projectx.FirstTabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mike.projectx.R;

/**
 * Created by Mike on 11/21/2016.
 */


public class Tab5 extends android.support.v4.app.Fragment {
    Button lan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab5, container, false);

        lan = (Button)v.findViewById(R.id.language);
        lan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return v;

    }
}
