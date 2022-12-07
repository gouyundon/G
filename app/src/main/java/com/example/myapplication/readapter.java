package com.example.myapplication;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class readapter extends RecyclerView.Adapter<readapter.InnerHolder> {


    private ArrayList<content> data;
    public readapter(ArrayList<content> data){
        this.data=data;
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public readapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull readapter.InnerHolder holder, int position) {
holder.chatname.setText(data.get(position).getChatname());
holder.chatcontent.setText(data.get(position).getChatcontent());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public  static class InnerHolder extends RecyclerView.ViewHolder{

        TextView chatcontent;
        TextView chatname;
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            chatname=itemView.findViewById(R.id.chatname);
             chatcontent=itemView.findViewById(R.id.chatcontent);
        }
    }
}
