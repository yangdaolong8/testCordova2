/*
       Licensed to the Apache Software Foundation (ASF) under one
       or more contributor license agreements.  See the NOTICE file
       distributed with this work for additional information
       regarding copyright ownership.  The ASF licenses this file
       to you under the Apache License, Version 2.0 (the
       "License"); you may not use this file except in compliance
       with the License.  You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

       Unless required by applicable law or agreed to in writing,
       software distributed under the License is distributed on an
       "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
       KIND, either express or implied.  See the License for the
       specific language governing permissions and limitations
       under the License.
 */

package com.example.nanfang.cordovademo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.apache.cordova.CordovaActivity;

public class MainActivity extends Activity implements View.OnClickListener{

    private final String TAG = "MainActivity";

    private Context mContext;
    private Button btGetPicture;
    private Button btCamera;
    private Button btToast;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        initView();
    }

    /**
     * 初始化view
     */
    private void initView() {

        btGetPicture = (Button) findViewById(R.id.bt_get_picture);
        btCamera = (Button) findViewById(R.id.bt_camera);
        btToast = (Button) findViewById(R.id.bt_toast);

        btGetPicture.setOnClickListener(this);
        btCamera.setOnClickListener(this);
        btToast.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(mContext, TestCordovaWithLayoutActivity.class);
        switch (v.getId()) {
            case R.id.bt_get_picture:
                intent.putExtra("cordova_url", "file:///android_asset/www/camera.html");
                break;
            case R.id.bt_camera:
                intent.putExtra("cordova_url", "file:///android_asset/www/take_picture.html");
                break;
            case R.id.bt_toast:
                intent.putExtra("cordova_url", "file:///android_asset/www/toast.html");
                break;
        }
        startActivity(intent);
    }
}
