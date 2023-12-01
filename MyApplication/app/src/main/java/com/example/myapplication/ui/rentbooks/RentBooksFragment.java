package com.example.myapplication.ui.rentbooks;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.databinding.FragmentRentbooksBinding;
import com.example.myapplication.ui.home.HomeViewModel;

public class RentBooksFragment extends Fragment {

    private FragmentRentbooksBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RentbooksViewModel rentbooksViewModel =
                new ViewModelProvider(this).get(RentbooksViewModel.class);

        binding = FragmentRentbooksBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRentbook;
        rentbooksViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}