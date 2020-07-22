package com.example.taingkimty.fragement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taingkimty.adapter.ProductsAdapter;
import com.example.taingkimty.R;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    ProductsAdapter productsAdapter;

    int []products = {
            R.drawable.img_one,R.drawable.img_two, R.drawable.img_three, R.drawable.img_four,
            R.drawable.img_five, R.drawable.img_six, R.drawable.img_seven, R.drawable.img_eight
    };


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);

        layoutManager = new GridLayoutManager(this.getContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        productsAdapter = new ProductsAdapter(products);
        recyclerView.setAdapter(productsAdapter);
        recyclerView.setHasFixedSize(true);

        return view;
    }
}
