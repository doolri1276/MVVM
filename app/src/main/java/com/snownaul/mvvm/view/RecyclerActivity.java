package com.snownaul.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.snownaul.mvvm.R;
import com.snownaul.mvvm.adapters.UserRecyclerViewAdapter;
import com.snownaul.mvvm.databinding.ActivityRecyclerBinding;
import com.snownaul.mvvm.model.UserViewModel;
import com.snownaul.mvvm.view_model.DividerLineDecoratorViewModel;
import com.snownaul.mvvm.view_model.UsersViewModel;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {
    ActivityRecyclerBinding binding;
    private DividerLineDecoratorViewModel dividerLineDecoratorViewModel=new DividerLineDecoratorViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_recycler);
        binding.setViewModel(new UsersViewModel());
        binding.setDecorator(dividerLineDecoratorViewModel);
        dividerLineDecoratorViewModel.onCreate();
    }

    @BindingAdapter("app:items")
    public static void setUserList(RecyclerView recyclerView, ArrayList<UserViewModel> users){
        UserRecyclerViewAdapter adapter;

        if(recyclerView.getAdapter()==null){
            adapter = new UserRecyclerViewAdapter();
            recyclerView.setAdapter(adapter);
        }else{
            adapter = (UserRecyclerViewAdapter) recyclerView.getAdapter();
        }

        adapter.add(users);

    }

    @BindingAdapter("app:decorator")
    public static void setDecorator(RecyclerView recyclerView, ObservableField<DividerItemDecoration> decorator){
        recyclerView.addItemDecoration(decorator.get());
    }
}
