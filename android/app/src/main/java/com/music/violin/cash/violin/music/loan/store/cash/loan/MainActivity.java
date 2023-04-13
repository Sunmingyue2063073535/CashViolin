package com.music.violin.cash.violin.music.loan.store.cash.loan;

import com.getcapacitor.BridgeActivity;


import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.NonNull;

import com.getcapacitor.Bridge;
import com.getcapacitor.BridgeActivity;
import com.getcapacitor.JSObject;

import java.util.HashMap;
import java.util.Map;


public class MainActivity extends BridgeActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        registerPlugin(MyPlugin.class);
        super.onCreate(savedInstanceState);
    }
    public void  onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        JSObject jsonObject  = new JSObject();
//        判断用户权限，有一个为null就不让通过， 再次申请
        if (MyPlugin.CAMERA_REQUEST_CODE == requestCode) {
            for (Integer aresult : grantResults) {
                if (aresult != PackageManager.PERMISSION_GRANTED) {
                    jsonObject.put("result",false);
                    MyPlugin.newCall.resolve(jsonObject);
                    return;
                }
            }
            //获取设备信息
            jsonObject.put("result",true);
            MyPlugin.newCall.resolve(jsonObject);
        }
    }
}
