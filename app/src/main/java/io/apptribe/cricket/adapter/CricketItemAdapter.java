package io.apptribe.cricket.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.apptribe.cricket.R;
import io.apptribe.cricket.viewholder.CricketViewHolder;

/**
 * Created by kerry on 12/12/15.
 */
public class CricketItemAdapter extends RecyclerView.Adapter<CricketViewHolder>{

//    String crickets[];
    ArrayList<String> crickets;

    public CricketItemAdapter(ArrayList<String> crickets){
        this.crickets = crickets;
    }

    @Override
    public CricketViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cricket_item, parent, false);
        return new CricketViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CricketViewHolder holder, int position) {
        holder.bind(crickets.get(position), true);
    }

    @Override
    public int getItemCount() {
        return crickets.size();
    }
}
