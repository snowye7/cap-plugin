package com.mycompany.plugins.example;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Example")
public class ExamplePlugin extends Plugin {

    private Example implementation = new Example();

    @PluginMethod
    public void sendLoginBroadcast(PluginCall call) {
        //String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("success", "true");
        LocalBroadcastManager.getInstance(this.bridge.getContext()).sendBroadcast(new Intent("com.ydjw.ua.ua.ACTION_LOGIN"));
        call.resolve(ret);
    }

    public void sendLogOutBroadcast(PluginCall call) {
        //String value = call.getString("value");
        LocalBroadcastManager.getInstance(this.bridge.getContext()).sendBroadcast(new Intent("com.ydjw.ua.ua.ACTION_LOGOUT"));
        JSObject ret = new JSObject();
        ret.put("success", "true");
        call.resolve(ret);
    }

    public void getRecord(PluginCall call) {
        //String value = call.getString("value");
        String recordNum=SpUtils.getString(context,Constant.RECORDNUM);
        JSObject ret = new JSObject();
        ret.put("success", ""+recordNum);
        call.resolve(ret);
    }
}
