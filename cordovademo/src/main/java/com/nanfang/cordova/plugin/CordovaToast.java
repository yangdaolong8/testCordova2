package com.nanfang.cordova.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class CordovaToast extends CordovaPlugin{

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if("showToast".equals(action)) {
            showToast(args.getString(0), args.getInt(1));
        }
        return true;
    }

    private void showToast(String text, int type) {
        android.widget.Toast.makeText(cordova.getActivity(), text, type).show();
    }
}
