package io.apptribe.cricket.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.apptribe.cricket.R;
import io.apptribe.cricket.adapter.CricketItemAdapter;

/**
 * Created by kerry on 12/12/15.
 */
public class FragmentCricketsList extends Fragment {

    public static final String ITEMS_TAG =  "crickets";

    @Bind(R.id.crickets)
    RecyclerView crickets_list;

    private ArrayList<String> crickets = new ArrayList<>();

    public static FragmentCricketsList newInstance() {

        Bundle args = new Bundle();
        ArrayList<String> tmp = new ArrayList<String>();
        for(int i = 0; i < 20; i++){
            tmp.add("Crickets " + (i+1));
        }

        FragmentCricketsList fragment = new FragmentCricketsList();
        args.putStringArrayList(ITEMS_TAG, tmp);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments().containsKey(ITEMS_TAG)){
            this.crickets = getArguments().getStringArrayList(ITEMS_TAG);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_crickets_list, container, false);

        ButterKnife.bind(this, view);

        CricketItemAdapter adapter = new CricketItemAdapter(crickets);
        crickets_list.setAdapter(adapter);

        crickets_list.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}
