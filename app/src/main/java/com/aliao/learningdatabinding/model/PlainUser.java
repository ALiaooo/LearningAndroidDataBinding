package com.aliao.learningdatabinding.model;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by 丽双 on 2015/7/17.
 */
public class PlainUser {

    public final ObservableField<String> userName = new ObservableField<>();
    public final ObservableField<String> lover = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();

}
