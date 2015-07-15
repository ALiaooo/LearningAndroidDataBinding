package com.aliao.learningdatabinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aliao.learningdatabinding.R;
import com.aliao.learningdatabinding.databinding.ActivityGettingStartedBinding;
import com.aliao.learningdatabinding.model.User;

/**
 * Created by ALiao on 2015/7/15.
 * data binding 使用初体验
 * 1.在xml里调整根元素为layout，并添加data元素描述一个user的变量属性，以及view元素来写文件布局
 * 2.在data元素的variable标签里设置(user)变量属性后，会自动生成一个Binding类。该类是model和view数值连接的桥梁。
 *   该类的命名规则是基于layout文件名称首字母大写并连接“Binding”后缀产生，例如：
 *   activity_getting_started.xml  =>  ActivityGettingStartedBinding
 * 3.activity与layout的连接方式。以往要设置layout中的控件的值，要先findViewByid把控件找出来再去设置要显示的值。
 *   使用data binding后，就不用再在activity里直接操作layout中的控件，而是通过生成的Binding类把model中的值更新到view上。
 *   =========================================================
 *
 *   http://www.willowtreeapps.com/blog/mvvm-on-android-what-you-need-to-know/
 *   在以往的Android架构中，是由controller将数据推送给view，即在Activity中通过findviewbyid找到该view，然后给他设置内容
 *   而在MVVM中，ViewModel(将view与model绑定在一起的对象)更改了数据，然后通知bindig framework数值改变了。该框架就会自动更新绑定了该model内容的任何view视图。
 */
public class GettingStartedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityGettingStartedBinding binding = new DataBindingUtil().setContentView(this, R.layout.activity_getting_started);

        User user = new User("ALiao", "liaolishuang@gmail.com");

        binding.setUser(user);
    }
}
