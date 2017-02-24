package com.example.mike.projectx.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.mike.projectx.R;

/**
 * Created by Mike on 8/19/2016.
 */
public class MyHolder extends RecyclerView.ViewHolder  implements  View.OnClickListener {
    Context c;
    ImageView img;
    TextView nameTxt,posTxt;
    ItemClickListener itemClickListener;
    //ImageButton stars;
    ToggleButton stars;
    public MyHolder(View itemView) {
        super(itemView);

        img = (ImageView)itemView.findViewById(R.id.playerImage);
        nameTxt = (TextView) itemView.findViewById(R.id.nameTxt);
      //  stars = (ImageButton) itemView.findViewById(R.id.star);
        stars = (ToggleButton) itemView.findViewById(R.id.star);





        //  posTxt = (TextView)itemView.findViewById(R.id.posTxt);\

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.onItemClick(v,getLayoutPosition());



    }

    public  void  setItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }
}
