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
        getContext().sendBroadcast(new Intent("com.ydjw.ua.ua.ACTION_LOGOUT"));
        call.resolve(ret);
    }
    @PluginMethod
    public void sendLogOutBroadcast(PluginCall call) {
        //String value = call.getString("value");
        getContext().sendBroadcast(new Intent("com.ydjw.ua.ua.ACTION_LOGOUT"));
        JSObject ret = new JSObject();
        ret.put("success", "true");
        call.resolve(ret);
    }
    @PluginMethod
    public void getRecord(PluginCall call) {
        //String value = call.getString("value");
        String recordNum=SpUtils.getString(context,Constant.RECORDNUM);
        JSObject ret = new JSObject();
        ret.put("success", ""+recordNum);
        call.resolve(ret);
    }
}
