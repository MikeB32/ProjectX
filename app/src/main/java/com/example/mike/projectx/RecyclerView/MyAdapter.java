package com.example.mike.projectx.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.mike.projectx.FirstTabs.Tab2;
import com.example.mike.projectx.MiniDetails;
import com.example.mike.projectx.R;

/**
 * Created by Mike on 8/19/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder>{

    Context c;
    String[] place;
   // String[] positions;
    int[] images;
    public MyAdapter(Context ctx,String[] place,int[] images)
    {
        this.c=ctx;
        this.place=place;
     //   this.positions=positions;
        this.images=images;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);

        MyHolder holder=new MyHolder(v);

        return holder;
    }


    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {

        holder.nameTxt.setText(place[position]);
       // holder.posTxt.setText(positions[position]);
        holder.img.setImageResource(images[position]);
        holder.stars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!holder.stars.isChecked()){
                Toast.makeText(c,"unregisterd",Toast.LENGTH_SHORT).show();
            }else {
                    Toast.makeText(c, "hola", Toast.LENGTH_SHORT).show();

                }
            }
        });


        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {

                Intent i=new Intent(c,MiniDetails.class);

                i.putExtra("Name",place[position]);
               // i.putExtra("Position",positions[position]);
                i.putExtra("Image",images[position]);

                c.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return place.length;
    }
}