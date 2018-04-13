package com.example.nanfang.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private final String TAG = "MainActivity";
    private Button btTest;
    private Button btTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

     /**
     * 初始化view
     */
    private void initView() {
        btTest = (Button) findViewById(R.id.bt_test);
        btTest2 = (Button) findViewById(R.id.bt_test2);

        btTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick: 按钮点击");
                startActivity(new Intent(MainActivity.this, FirstActivity.class));
            }
        });
    }
}
