package com.snownaul.mvvm.view_model;

import com.snownaul.mvvm.model.UserViewModel;
import com.snownaul.mvvm.parents.BaseViewModel;

import java.util.Random;

import androidx.databinding.ObservableArrayList;

public class UsersViewModel implements BaseViewModel {

    public final ObservableArrayList<UserViewModel> users = new ObservableArrayList<>();
    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void newUser(){
        users.add(new UserViewModel("name : "+random(), "email : "+random()));
    }

    private int random(){
        return new Random().nextInt();
    }


}
