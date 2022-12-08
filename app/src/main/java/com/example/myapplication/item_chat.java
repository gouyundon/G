package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class item_chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_chat);
        ArrayList<content> data=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            content content=new content();
            for (int j = 0; j < 5; j++) {
                content.setChatcontent("高数"+j);
                content.setChatname("马上考试了"+i);
            }
            data.add(content);
        }
        RecyclerView recycle = (RecyclerView) findViewById(R.id.recycle);
readapter myadapter=new readapter(data);
recycle.setAdapter(myadapter);
recycle.setLayoutManager(new LinearLayoutManager(this));
    }
}