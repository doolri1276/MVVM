package com.snownaul.mvvm.model;

import com.snownaul.mvvm.view_model.UsersViewModel;

import androidx.databinding.ObservableField;

public class UserViewModel {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> email = new ObservableField<>();

    public UserViewModel(String name, String email){
        this.name.set(name);
        this.email.set(email);
    }
}
