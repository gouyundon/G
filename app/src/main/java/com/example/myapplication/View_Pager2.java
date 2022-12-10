package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class View_Pager2 extends AppCompatActivity {
       private TabLayout tabLayout;
        ArrayList<String> data=new ArrayList<>();


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager2);
        ArrayList<BackInterface> fragments=new ArrayList<>();
        ViewPager2 re=findViewById(R.id.item_vp);
        tabLayout=findViewById(R.id.tablayout);
        data.add("第一");
        data.add("第二");

        fragments.add(new BackInterface() {
            @Override
            public Fragment back() {
                return new fragment1();
            }
        });
        fragments.add(new BackInterface() {
            @Override
            public Fragment back() {
                return new fragment2();
            }
        });

        viewadapter adapter=new viewadapter(this,fragments);
        re.setAdapter(adapter);
        new TabLayoutMediator(tabLayout, re, new
                TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int
                            position) {

                        tab.setText(data.get(position).toString());
                    }
                }).attach();
    }
}