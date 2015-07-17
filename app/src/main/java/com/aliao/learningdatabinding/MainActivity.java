package com.aliao.learningdatabinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.aliao.learningdatabinding.activity.CollectionActivity;
import com.aliao.learningdatabinding.activity.CustomBindingClassNameActivity;
import com.aliao.learningdatabinding.activity.ExpressionActivity;
import com.aliao.learningdatabinding.activity.GettingStartedActivity;
import com.aliao.learningdatabinding.activity.IncludesActivity;
import com.aliao.learningdatabinding.activity.ObservableActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        findViewById(R.id.btn_getting_started).setOnClickListener(this);
        findViewById(R.id.btn_custom).setOnClickListener(this);
        findViewById(R.id.btn_include).setOnClickListener(this);
        findViewById(R.id.btn_app_expression).setOnClickListener(this);
        findViewById(R.id.btn_app_collection).setOnClickListener(this);
        findViewById(R.id.btn_app_observable).setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_getting_started:
                startActivity(new Intent(MainActivity.this, GettingStartedActivity.class));
                break;
            case R.id.btn_custom:
                startActivity(new Intent(MainActivity.this, CustomBindingClassNameActivity.class));
                break;
            case R.id.btn_include:
                startActivity(new Intent(MainActivity.this, IncludesActivity.class));
                break;
            case R.id.btn_app_expression:
                startActivity(new Intent(MainActivity.this, ExpressionActivity.class));
                break;
            case R.id.btn_app_collection:
                startActivity(new Intent(MainActivity.this, CollectionActivity.class));
                break;
            case R.id.btn_app_observable:
                startActivity(new Intent(MainActivity.this, ObservableActivity.class));
                break;
        }
    }
}
