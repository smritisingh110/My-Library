package com.example.myapplication.ui.rentbooks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RentbooksViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;

    public RentbooksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is rentBook fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}