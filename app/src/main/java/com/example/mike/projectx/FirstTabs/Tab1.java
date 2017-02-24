package com.example.mike.projectx.FirstTabs;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.mike.projectx.R;

/**
 * Created by Mike on 11/21/2016.
 */

public class Tab1 extends android.support.v4.app.Fragment {
    Button btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tab1, container, false);
         btn1 = (Button)v.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Tab number one",Toast.LENGTH_SHORT).show();
            }
        });
        return v;

    }
}
