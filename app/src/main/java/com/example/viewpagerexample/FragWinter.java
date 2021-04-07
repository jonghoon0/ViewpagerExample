package com.example.viewpagerexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragWinter extends Fragment {
    private View view;

    public static FragWinter newInstance() {
        FragWinter fragWinter = new FragWinter();
        return fragWinter;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_winter, container, false);

        return view;
    }
}
