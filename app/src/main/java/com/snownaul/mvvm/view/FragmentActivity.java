package com.snownaul.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.snownaul.mvvm.R;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
    }
}
