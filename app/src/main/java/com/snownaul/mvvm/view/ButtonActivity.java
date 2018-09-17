package com.snownaul.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.snownaul.mvvm.R;
import com.snownaul.mvvm.databinding.ActivityButtonBinding;
import com.snownaul.mvvm.view_model.ButtonViewModel;

public class ButtonActivity extends AppCompatActivity {

    ActivityButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_button);
        binding.setViewModel(new ButtonViewModel());
        getSupportActionBar().setTitle("Button Activity");
    }
}
