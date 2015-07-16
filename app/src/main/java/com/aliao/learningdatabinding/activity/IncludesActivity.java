package com.aliao.learningdatabinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aliao.learningdatabinding.R;
import com.aliao.learningdatabinding.databinding.ActivityIncludesBinding;
import com.aliao.learningdatabinding.model.User;

/**
 * Created by ALiao on 2015/7/15.
 * 通过“application namespace:variable”的方式从当前layout中传递变量到被包含的layout中
 * <include
 *     layout="@layout/layout_user"
 *     bind:user="@{user}"/>
 *     在被包含的layout中必须声明传递进来的变量
 */
public class IncludesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityIncludesBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_includes);

        User user = new User("ALiao", "liaolishuang@gmail.com");

        binding.setUser(user);
    }
}
