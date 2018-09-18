package com.snownaul.mvvm.tools;

import android.content.Intent;

import com.snownaul.mvvm.view.ButtonActivity;
import com.snownaul.mvvm.view.ImageActivity;
import com.snownaul.mvvm.view.InputActivity;
import com.snownaul.mvvm.view.FragmentActivity;
import com.snownaul.mvvm.view.ListActivity;
import com.snownaul.mvvm.view.RecyclerActivity;

import androidx.core.content.ContextCompat;

public class MoveActivityTool {

    public static void goToButtonActivity(){
        Intent intent = new Intent(App.getInstance(), ButtonActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }

    public static void goToInputActivity(){
        Intent intent = new Intent(App.getInstance(), InputActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }

    public static void goToListActivity(){
        Intent intent = new Intent(App.getInstance(), ListActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }

    public static void goToRecyclerActivity(){
        Intent intent = new Intent(App.getInstance(), RecyclerActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }

    public static void goToFragmentActivity(){
        Intent intent = new Intent(App.getInstance(), FragmentActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }

    public static void goToImageActivity(){
        Intent intent = new Intent(App.getInstance(), ImageActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        ContextCompat.startActivity(App.getInstance(), intent, null);
    }


}
