package com.snownaul.mvvm.view_model;

import com.snownaul.mvvm.parents.BaseViewModel;
import com.snownaul.mvvm.tools.MoveActivityTool;

public class MainViewModel implements BaseViewModel {
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

    public void goToButtonActivity(){
        MoveActivityTool.goToButtonActivity();
    }

    public void goToInputActivity(){
        MoveActivityTool.goToInputActivity();
    }

    public void goToListActivity(){
        MoveActivityTool.goToListActivity();
    }

    public void goToRecyclerActivity(){
        MoveActivityTool.goToRecyclerActivity();
    }

    public void goToFragmentActivity(){
        MoveActivityTool.goToFragmentActivity();
    }

    public void goToImageActivity(){
        MoveActivityTool.goToFragmentActivity();
    }
}
