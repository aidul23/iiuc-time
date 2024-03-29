package com.example.iiuctime;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleNote> mExampleList;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.ImageViewID);
            mTextView1 = itemView.findViewById(R.id.TextViewID1);
            mTextView2 = itemView.findViewById(R.id.TextViewID2);
        }
    }

    public ExampleAdapter(ArrayList<ExampleNote> examplelist){
        mExampleList = examplelist;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_note,parent,false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        ExampleNote currentitem = mExampleList.get(position);

        holder.mImageView.setImageResource(currentitem.getImage());
        holder.mTextView1.setText(currentitem.getText1());
        holder.mTextView2.setText(currentitem.getTexxt2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}

