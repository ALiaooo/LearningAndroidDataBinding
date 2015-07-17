package com.aliao.learningdatabinding.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.aliao.learningdatabinding.R;
import com.aliao.learningdatabinding.databinding.ActivityObservableBinding;
import com.aliao.learningdatabinding.model.ObservableUser;
import com.aliao.learningdatabinding.model.PlainUser;


/**
 * Created by 丽双 on 2015/7/17.
 * Data对象：如果直接修改POJO对象是不能直接更新UI的，如果想当model对象的数据更新时，UI能够自动更新，可以使用三种不同的数据变化通知：Observale对象，Observable字段，Observable集合
 * 1.Observale对象
 * 1.在getter上加上一个Bindable注解
 * 2.在setter内通知notifyPropertyChanged(BR.xx),BR类是自动生成的
 *
 * 2.ObservableField
 * ObservableFields是自包含具有单个字段的observable对象。它有所有基本类型和一个是引用类型。要使用它需要在data对象中创建public final字段
 * 访问值时使用set和get方法：
    user.firstName.set("Google");
    int age = user.age.get();

 * 3.Observable集合
 * Observable集合允许键控访问这些data对象：
 * ObservableArrayMap用于键是引用类型（和Map的使用方法一样）
 * ObservableArrayList用与键是整数（只用于整型？？！类似数组通过索引取值）
 */
public class ObservableActivity extends AppCompatActivity {


    ObservableUser observableUser = new ObservableUser();
    PlainUser plainUser = new PlainUser();
    ObservableArrayMap mapUser = new ObservableArrayMap();
    ObservableArrayList<String> listUser = new ObservableArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityObservableBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_observable);

        binding.setUser(observableUser);
        binding.setPlainUser(plainUser);
        binding.setMapUser(mapUser);
        binding.setListUser(listUser);
    }


    public void setOtherName(View view){

        //Observable 对象
        observableUser.setUserName("蓝宇");
        observableUser.setLover("陈捍东");

        //Obserable 字段
        plainUser.userName.set("蓝宇");
        plainUser.lover.set("陈捍东");
        plainUser.age.set(23);

        //Observable 集合ObserableArrayMap
        mapUser.put("name", "蓝宇");
        mapUser.put("lover","陈捍东");
        mapUser.put("age", 23);

        //Observable 集合ObserableArrayList
        listUser.add("蓝宇");
        listUser.add("陈捍东");
        listUser.add("23");
    }

    public void setMyName(View view){
        observableUser.setUserName("ALiao");
        observableUser.setLover("蓝宇");

        plainUser.userName.set("ALiao");
        plainUser.lover.set("蓝宇");
        plainUser.age.set(26);

        mapUser.put("name", "ALiao");
        mapUser.put("lover", "蓝宇");
        mapUser.put("age",26);

        listUser.add("ALiao");
        listUser.add("蓝宇");
        listUser.add("26");
    }

}
