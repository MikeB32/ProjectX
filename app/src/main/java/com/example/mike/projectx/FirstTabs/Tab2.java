package com.example.mike.projectx.FirstTabs;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mike.projectx.R;
import com.example.mike.projectx.RecyclerView.MyAdapter;

import org.w3c.dom.Text;

/**
 * Created by Mike on 11/21/2016.
 */


public class Tab2 extends android.support.v4.app.Fragment {
    String[] names={"Icardi","Candreva","Milito","Perisic","Zanetti"};
   // String[] positions={"","", "","",""};
    int[] images={R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,};





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.listfragment, container, false);


        RecyclerView rv= (RecyclerView)v.findViewById(R.id.myRecycler);


        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        MyAdapter adapter=new MyAdapter(getActivity(),names,images);
        rv.setAdapter(adapter);
            return  v;
    }


}
