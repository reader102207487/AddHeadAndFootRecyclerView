package com.qffweather.android.myrecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by qff on 2017/5/10.
 */

public class RvAdapter extends RecyclerView.Adapter<MyViewHolder>{
    private final MainActivity context;
    private final ArrayList<String> datas;

    public RvAdapter(MainActivity mainActivity, ArrayList<String> datas) {
        this.context = mainActivity;
        this.datas = datas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder myViewHolder = new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
           holder.tv.setText(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
