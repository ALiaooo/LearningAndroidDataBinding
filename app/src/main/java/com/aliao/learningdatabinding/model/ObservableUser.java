package com.aliao.learningdatabinding.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.aliao.learningdatabinding.BR;

/**
 * Created by 丽双 on 2015/7/17.
 */
public class ObservableUser extends BaseObservable {

    private String userName;
    private String lover;

    @Bindable
    public String getUserName() {
        return userName;
    }

    @Bindable
    public String getLover() {
        return lover;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    public void setLover(String lover) {
        this.lover = lover;
        notifyPropertyChanged(BR.lover);
    }
}
