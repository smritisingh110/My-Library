package com.example.myapplication.ui.store;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StoreViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public StoreViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is stores fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}