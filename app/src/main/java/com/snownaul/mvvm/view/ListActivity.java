package com.snownaul.mvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;

import android.os.Bundle;
import android.widget.ListView;

import com.snownaul.mvvm.R;
import com.snownaul.mvvm.adapters.UserListViewAdapter;
import com.snownaul.mvvm.databinding.ActivityListBinding;
import com.snownaul.mvvm.model.UserViewModel;
import com.snownaul.mvvm.view_model.UsersViewModel;

public class ListActivity extends AppCompatActivity {

    ActivityListBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_list);
        binding.setViewModel(new UsersViewModel());

        getSupportActionBar().setTitle("List Activity");

    }

    @BindingAdapter("app:items")
    public static void setUserList(ListView listView, ObservableArrayList<UserViewModel> users){
        UserListViewAdapter adapter;

        if(listView.getAdapter()==null){
            adapter=new UserListViewAdapter();
            listView.setAdapter(adapter);
        }else{
            adapter= (UserListViewAdapter) listView.getAdapter();
        }

        adapter.addAll(users);
    }
}
