package com.example.myapplication.ui.yourbooks;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class YourbooksViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private final MutableLiveData<String> mText;

    public YourbooksViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is your books  fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}