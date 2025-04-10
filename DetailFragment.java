package com.example.multiscreennavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class DetailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView messageText = view.findViewById(R.id.text_message);
        
        // Get the message from the arguments
        String message = DetailFragmentArgs.fromBundle(getArguments()).getMessage();
        messageText.setText(message);

        return view;
    }
} 