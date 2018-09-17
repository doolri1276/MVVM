package com.snownaul.mvvm.tools;

import android.app.Application;

public class App extends Application {

    public static App instance;

    public static App getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
    }
}
