package com.example.viewpagerexample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragSummer extends Fragment {
    private View view;

    public static FragSummer newInstance() {
        FragSummer fragSummer = new FragSummer();
        return fragSummer;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_summer, container, false);

        return view;
    }
}
