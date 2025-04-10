package com.example.multiscreennavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class HomeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button detailButton = view.findViewById(R.id.button_detail);
        Button settingsButton = view.findViewById(R.id.button_settings);

        detailButton.setOnClickListener(v -> {
            HomeFragmentDirections.ActionHomeFragmentToDetailFragment action =
                    HomeFragmentDirections.actionHomeFragmentToDetailFragment("Hello from Home!");
            Navigation.findNavController(v).navigate(action);
        });

        settingsButton.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_homeFragment_to_settingsFragment);
        });

        return view;
    }
} 