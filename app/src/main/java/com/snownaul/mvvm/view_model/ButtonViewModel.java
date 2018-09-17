package com.snownaul.mvvm.view_model;

import android.view.View;

import com.snownaul.mvvm.parents.BaseViewModel;

import androidx.databinding.ObservableField;

public class ButtonViewModel implements BaseViewModel {

    public final ObservableField<String> helloText = new ObservableField<>();

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

    public void showCurrentTime(){
        helloText.set(String.valueOf(System.currentTimeMillis()));
    }

    public View.OnClickListener currentTime2ClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showCurrentTime();
        }
    };

    public View.OnClickListener resetText=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            helloText.set("Hello World!");
        }
    };
}
