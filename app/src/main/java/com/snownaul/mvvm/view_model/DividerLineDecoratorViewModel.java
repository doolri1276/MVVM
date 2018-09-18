package com.snownaul.mvvm.view_model;

import android.content.Context;

import com.snownaul.mvvm.parents.BaseViewModel;
import com.snownaul.mvvm.tools.App;

import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.DividerItemDecoration;

public class DividerLineDecoratorViewModel implements BaseViewModel {

    public final ObservableField<DividerItemDecoration> decorator = new ObservableField<>();

    @Override
    public void onCreate() {
        decorator.set(new DividerItemDecoration(App.getInstance(), DividerItemDecoration.VERTICAL));
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
}
