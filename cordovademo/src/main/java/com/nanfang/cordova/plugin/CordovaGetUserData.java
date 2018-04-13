package com.nanfang.cordova.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONException;

public class CordovaGetUserData extends CordovaPlugin{

    @Override
    public boolean execute(String action, String rawArgs, CallbackContext callbackContext) throws JSONException {
        if("userData".equals(action)) {
            //showToast(args.getString(0), args.getInt(1));
        }
        return true;
    }
}
