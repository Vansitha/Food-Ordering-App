package com.example.foodapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.logic.CheckoutCartList;
import com.example.foodapp.logic.HomeFragFoodList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class FragBrowse extends Fragment {

    RecyclerView recyclerView;
    HomeFragFoodList foodList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        foodList = new HomeFragFoodList(getActivity());
        foodList.load();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_browse, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.browseRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        BrowseAdapter myAdapter = new BrowseAdapter(getContext(), foodList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.notifyDataSetChanged();
    }
}