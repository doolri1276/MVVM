package com.snownaul.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.snownaul.mvvm.R;
import com.snownaul.mvvm.databinding.ActivityInputBinding;
import com.snownaul.mvvm.view_model.InputViewModel;

public class InputActivity extends AppCompatActivity {

    ActivityInputBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_input);
        binding.setViewModel(new InputViewModel());
        getSupportActionBar().setTitle("Input Activity");

        binding.getViewModel().onCreate();
    }
}
