package com.example.nanfang.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity{
    private final String TAG = "FirstActivity";

    private Button btTestFirst;
    private Button btTestFirst2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_first);
        Add();
        initView();
        Sub();
    }

    /**
     * 初始化view
     */
    private void initView() {
        int width = ScreenUtils.dip2px(this, 10);
        btTestFirst = (Button) findViewById(R.id.bt_test_first);
        btTestFirst2 = (Button) findViewById(R.id.bt_test2_first);
        btTestFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: 第一个页面点击");
            }
        });
    }

    private void Add() {
        for (int i = 0; i < 99; i++) {
            Log.i(TAG, "add i == "+i);
        }
    }

    private void Sub() {
        for (int i = 90; i >=0; i--) {
            Log.i(TAG, "sub i == "+i);
        }
    }

}
