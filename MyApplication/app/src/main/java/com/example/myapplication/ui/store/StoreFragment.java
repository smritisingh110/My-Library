package com.example.myapplication.ui.store;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentStoreBinding;

public class StoreFragment extends Fragment {

    private FragmentStoreBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StoreViewModel storeViewModel =
                new ViewModelProvider(this).get(StoreViewModel.class);

        binding = FragmentStoreBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBook;
        storeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}