package com.snownaul.mvvm.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.snownaul.mvvm.R;
import com.snownaul.mvvm.adapters.view_holders.BindingViewHolder;
import com.snownaul.mvvm.databinding.ListItemUserBinding;
import com.snownaul.mvvm.model.UserViewModel;
import com.snownaul.mvvm.tools.App;
import com.snownaul.mvvm.view_model.UsersViewModel;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserRecyclerViewAdapter extends RecyclerView.Adapter<BindingViewHolder<ListItemUserBinding>> {

    private ArrayList<UserViewModel> users = new ArrayList<>();

    public void add(ArrayList<UserViewModel> users){
        for(UserViewModel user:users){
            if(!this.users.contains(user)){
                this.users.add(user);
                notifyItemInserted(this.users.size()-1);
            }
        }
    }

    @NonNull
    @Override
    public BindingViewHolder<ListItemUserBinding> onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(App.getInstance());
        return new BindingViewHolder<>(inflater.inflate(R.layout.list_item_user, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BindingViewHolder<ListItemUserBinding> holder, int position) {
        holder.binding().setUser(users.get(position));

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
