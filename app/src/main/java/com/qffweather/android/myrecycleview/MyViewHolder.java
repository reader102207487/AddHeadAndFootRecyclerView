package com.qffweather.android.myrecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by qff on 2017/5/10.
 */
public class MyViewHolder extends RecyclerView.ViewHolder{

     TextView tv;

    public MyViewHolder(View view){
        super(view);
        tv = (TextView) view.findViewById(R.id.tv);
    }
}
