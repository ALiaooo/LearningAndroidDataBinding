package com.aliao.learningdatabinding.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;

import com.aliao.learningdatabinding.R;
import com.aliao.learningdatabinding.databinding.ActivityCollectionBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 丽双 on 2015/7/16.
 */
public class CollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityCollectionBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_collection);

        String[] datas = new String[]{"北京故事","蓝宇"};

        List<String> list = new ArrayList<>();
        SparseArray<String> sparseArray = new SparseArray<>(2);

        for (int i = 0; i<datas.length; i++){
            list.add(datas[i]);
            sparseArray.put(i, datas[i]);
        }

        Map<String, String> map = new HashMap<>();
        map.put("author","筱禾");
        map.put("director","关锦鹏");

        binding.setList(list);
        binding.setMap(map);
        binding.setSparse(sparseArray);
        binding.setIndex(0);
        binding.setKeyAuthor("author");
        binding.setKeyDirector("director");


    }
}
