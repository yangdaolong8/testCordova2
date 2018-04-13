package com.example.nanfang.cordovademo;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaWebViewImpl;
import org.apache.cordova.engine.SystemWebView;
import org.apache.cordova.engine.SystemWebViewEngine;

public class TestCordovaWithLayoutActivity extends CordovaActivity{
    private final String TAG = "TestCordovaWithLayoutActivity";
    private String cordovaUrl;

    @SuppressLint("LongLogTag")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_cordova_with_layout);
        //launchUrl = "file:///android_asset/www/toast.html";
        cordovaUrl = getIntent().getStringExtra("cordova_url");
        if (!TextUtils.isEmpty(cordovaUrl)) {
            Log.i(TAG, "cordova url:  "+cordovaUrl);
            loadUrl(cordovaUrl);
        }
    }

    @Override
    protected CordovaWebView makeWebView() {
        SystemWebView webView = (SystemWebView)findViewById(R.id.cordovaWebView);
        return new CordovaWebViewImpl(new SystemWebViewEngine(webView));
    }

    @Override
    protected void createViews() {
        if (preferences.contains("BackgroundColor")) {
            int backgroundColor = preferences.getInteger("BackgroundColor", Color.BLACK);
            // Background of activity:
            appView.getView().setBackgroundColor(backgroundColor);
        }

        appView.getView().requestFocusFromTouch();
    }
}
