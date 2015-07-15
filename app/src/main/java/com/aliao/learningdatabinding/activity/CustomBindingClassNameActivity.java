package com.aliao.learningdatabinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.aliao.learningdatabinding.R;
import com.aliao.learningdatabinding.databinding.CustomBindingName;
import com.aliao.learningdatabinding.model.User;

/**
 * Created by ALiao on 2015/7/15.
 * 自定义Binding类名称
 * Binding类通过调整data元素中的class属性来重命名或放置在不同的包中
 *
 * 1.自定义的Binding类风在databinding封装包下：com.aliao.learningdatabinding.databinding.CustomBindingName
 *     <data class="CustomBindingName">
 *          <variable
 *              name="user"
 *              type="com.aliao.learningdatabinding.model.User"/>
 *      </data>
 *
 * 2.生成在不同的包下,自定义的Binding类添加前缀.(即当前包名目录下)：com.aliao.learningdatabinding.CustomBindingName
 *     <data class=".CustomBindingName">
 *          <variable
 *              name="user"
 *              type="com.aliao.learningdatabinding.model.User"/>
 *      </data>
 *
 * 3.生成在不同的包下,提供整个包名路径：com.aliao.learningdatabinding.activity.CustomBindingName
 *     <data class="com.aliao.learningdatabinding.activity.CustomBindingName">
 *          <variable
 *              name="user"
 *              type="com.aliao.learningdatabinding.model.User"/>
 *      </data>
 */
public class CustomBindingClassNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomBindingName binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_binding_classname);

        User user = new User("ALiao", "liaolishuang@gmail.com");

        binding.setUser(user);

    }
}
