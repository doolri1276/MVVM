package com.snownaul.mvvm.view_model;

import android.text.TextUtils;
import android.util.Patterns;
import android.widget.RatingBar;

import com.snownaul.mvvm.parents.BaseViewModel;

import androidx.databinding.Observable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

public class InputViewModel implements BaseViewModel {

    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableField<String> email = new ObservableField<>();
    public final ObservableInt score = new ObservableInt();
    public final ObservableBoolean isValid = new ObservableBoolean();

    @Override
    public void onCreate() {
        score.set(0);
        isValid.set(false);

        name.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                validation();
            }
        });

        email.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                validation();
            }
        });

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

    private void validation(){
        boolean isValidName = !TextUtils.isEmpty(name.get());
        boolean isValidEmail = !TextUtils.isEmpty(email.get()) && Patterns.EMAIL_ADDRESS.matcher(email.get()).matches();
        boolean isValidScore = score.get()>0;
        isValid.set(isValidName && isValidEmail && isValidScore);
    }

    public RatingBar.OnRatingBarChangeListener scoreChangeListener = new RatingBar.OnRatingBarChangeListener() {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
            score.set((int)rating);
            validation();
        }
    };
}
