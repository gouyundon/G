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
            content.setChatname("高数群");
            content.setChatcontent("考试开始了");
            data.add(content);
        }
        RecyclerView recycle = (RecyclerView) findViewById(R.id.recycle);
readapter myadapter=new readapter(data);
recycle.setAdapter(myadapter);
recycle.setLayoutManager(new LinearLayoutManager(this));
    }
}