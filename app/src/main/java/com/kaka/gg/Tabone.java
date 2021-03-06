package com.kaka.gg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by stre6 on 2016-10-20.
 */


public class Tabone extends Fragment {

    RecyclerView rv;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager lm;
    private ArrayList<MyData> date;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, null);
        rv = (RecyclerView)view.findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        lm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(lm);
        date = new ArrayList<>();
        adapter = new Cadapter(date);
        rv.setAdapter(adapter);
        date.add(new MyData("#InsideOut", "asd", "asd", "asd", "asd", R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher, R.mipmap.ic_launcher));

        return view;
    }

}