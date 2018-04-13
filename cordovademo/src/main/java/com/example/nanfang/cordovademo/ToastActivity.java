package com.example.nanfang.cordovademo;

import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

public class ToastActivity extends CordovaActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadUrl("file:///android_asset/www/toast.html");
    }
}
