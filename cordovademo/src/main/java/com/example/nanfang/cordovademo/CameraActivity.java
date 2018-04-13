package com.example.nanfang.cordovademo;

import android.os.Bundle;
import android.util.Log;

import org.apache.cordova.CordovaActivity;

public class CameraActivity extends CordovaActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        loadUrl("file:///android_asset/www/camera.html");
        Log.i(TAG, "onCreate: ");
    }

    /**
     * 初始化view
     */
    private void initView() {

    }
}
