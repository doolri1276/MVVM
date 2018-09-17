package com.snownaul.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.snownaul.mvvm.R;
import com.snownaul.mvvm.databinding.ActivityMainBinding;
import com.snownaul.mvvm.view_model.MainViewModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setViewModel(new MainViewModel());
        getSupportActionBar().setTitle("Main Activity");
    }
}
