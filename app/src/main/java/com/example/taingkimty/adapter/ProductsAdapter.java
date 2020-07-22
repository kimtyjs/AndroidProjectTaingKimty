package com.example.taingkimty.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taingkimty.R;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.ProductViewHolder> {

    int []product;

    public ProductsAdapter(int[] product) {
        this.product = product;
    }


    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.single_view, parent, false);
        ProductViewHolder viewHolder = new ProductViewHolder(itemView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ProductsAdapter.ProductViewHolder holder, int position) {


        holder.imageView.setImageResource(product[position]);
        holder.textView.setText("Book"+ position);


    }

    @Override
    public int getItemCount() {

        return product.length;
    }


    //create viewholder class
    static class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.img_product);
            textView =  itemView.findViewById(R.id.txt_product);

        }
    }

}