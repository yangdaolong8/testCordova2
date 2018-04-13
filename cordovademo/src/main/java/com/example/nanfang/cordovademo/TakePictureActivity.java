package com.example.nanfang.cordovademo;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

public class TakePictureActivity extends CordovaActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadUrl("file:///android_asset/www/take_picture.html");
    }
}
