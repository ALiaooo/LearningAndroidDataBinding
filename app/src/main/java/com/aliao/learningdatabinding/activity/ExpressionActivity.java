package com.aliao.learningdatabinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aliao.learningdatabinding.R;
import com.aliao.learningdatabinding.databinding.ActivityExpressionBinding;
import com.aliao.learningdatabinding.model.User;

/**
 * Created by 丽双 on 2015/7/16.
 * 表达式
     数学 + - / * %
     字符串连接 +
     逻辑 && ||
     二进制 & | ^
     一元运算 + - ! ~
     移位 >> >>> <<
     比较 == > < >= <=
     instanceof
     分组 ()
     null
     Cast
     方法调用
     数据访问 []
     三元运算 ?:

 1.Null合并操作
 2.三元运算符
 4.访问Resources
 3.字符串，单引号的使用（测试时不能直接在双引号里写中文）：
    android:text='@{"name:"+user.userName??"I am ALiao"}'
 */
public class ExpressionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityExpressionBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_expression);

        User user  = new User("ALiao","liaolishuang@gmail.com","女");

        binding.setLarge(true);

        binding.setUser(user);

    }
}
