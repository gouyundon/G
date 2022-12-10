package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class viewadapter  extends FragmentStateAdapter {

    private final ArrayList<BackInterface> fragments;
    public viewadapter(@NonNull FragmentActivity fragmentActivity, ArrayList<BackInterface> fragments) {
        super(fragmentActivity);
        this.fragments = fragments;
    }
    @NonNull
    @Override

    public Fragment createFragment(int position) {
        return fragments.get(position).back();
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
