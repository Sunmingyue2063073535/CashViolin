package com.music.violin.cash.violin.music.loan.store.cash.loan;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.ActivityCompat;
import com.getcapacitor.ggFJmuhehlz2k1;
import com.getcapacitor.iFpfch2J8RfW1c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class C4XY {

    /* renamed from: C4XY  reason: collision with root package name */
    private static TelephonyManager f501C4XY;
    private final AssetManager QTcw4j1x;

    /* renamed from: com.music.violin.cash.violin.music.loan.store.cash.loan.C4XY$C4XY  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0053C4XY implements FileFilter {
        C0053C4XY() {
        }

        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            return Pattern.matches(StringFog.decrypt("eXA3Kn8Djqg=\n", "GgBCcU8ut/U=\n"), file.getName());
        }
    }

    public C4XY(AssetManager assetManager) {
        this.QTcw4j1x = assetManager;
    }

    public static long AFXu57tvOA0() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String AFXu57tvOA0(Context context) {
        String str;
        String str2;
        String str3 = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(StringFog.decrypt("YVPhOeM=\n", "ETuOV4agLTU=\n"));
            if (Build.VERSION.SDK_INT >= 24) {
                switch (telephonyManager.getDataNetworkType()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        str = "Yx8=\n";
                        str2 = "UVgQVeaz3Xc=\n";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 10:
                    case 12:
                    case 15:
                        str = "bQw=\n";
                        str2 = "XksgVDbn23U=\n";
                        break;
                    case 9:
                    case 14:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    default:
                        str = "J8PAZE0IxA==\n";
                        str2 = "cq2rCiJ/qps=\n";
                        break;
                    case 13:
                        str = "n54=\n";
                        str2 = "q9nOv0Cnen0=\n";
                        break;
                    case 20:
                        str = "Bes=\n";
                        str2 = "MKxVGOiZ8dM=\n";
                        break;
                }
                str3 = StringFog.decrypt(str, str2);
                return str3;
            }
            return null;
        } catch (Exception unused) {
            return str3;
        }
    }

    public static String C4XY() {
        try {
            return new BufferedReader(new FileReader(StringFog.decrypt("lNybZkslE/POxYdvRw==\n", "u6zpCSgKcIM=\n"))).readLine().split(StringFog.decrypt("W3auIw==\n", "YSrdCNh60tY=\n"), 2)[1];
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static int[] C4XY(Context context) {
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter(StringFog.decrypt("DO/9QnPWlTIE7+1VcsvffQ718F9ykbNdOdXcYkXgslQsz951WA==\n", "bYGZMBy/8Rw=\n")));
            return new int[]{registerReceiver.getIntExtra(StringFog.decrypt("bGGGxj8=\n", "HwLnqlrPJ/A=\n"), 100), registerReceiver.getIntExtra(StringFog.decrypt("BfBj3wY=\n", "aZUVumq5fg8=\n"), 0)};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static long Cyxd6DRPreJUiX() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String Cyxd6DRPreJUiX(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(StringFog.decrypt("IbJNOII=\n", "UdoiVueouWE=\n"))).getNetworkOperatorName();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String IQyLz(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(StringFog.decrypt("fdPL+Qo=\n", "Dbukl2/k7Jg=\n"))).getNetworkOperator();
        } catch (Exception unused) {
            return null;
        }
    }

    public static long[] IQyLz() {
        try {
            return new long[]{SystemClock.elapsedRealtime(), SystemClock.uptimeMillis()};
        } catch (Exception unused) {
            return new long[]{0, 0};
        }
    }

    public static String N4B1AfRo() {
        try {
            return Build.getRadioVersion();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static List<String> N4B1AfRo(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            if (!(ActivityCompat.checkSelfPermission(context, StringFog.decrypt("YY8gaEk1ohxwhDZ3Ty+1W2+PakhjHYJtRbkQX3QSh35fshBVdB2Bdw==\n", "AOFEGiZcxjI=\n")) != 0)) {
                Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, null);
                if (query != null && query.getCount() > 0) {
                    while (query.moveToNext()) {
                        String string = query.getString(query.getColumnIndexOrThrow(StringFog.decrypt("O9Kv/50=\n", "ZLbOi/yN0rY=\n")));
                        if (new File(string).exists()) {
                            arrayList.add(string);
                        }
                    }
                }
                return null;
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static String NQtKsO(Context context) {
        String str;
        String str2;
        try {
            int phoneType = ((TelephonyManager) context.getSystemService(StringFog.decrypt("ALhqk8I=\n", "cNAF/acSgMs=\n"))).getPhoneType();
            if (phoneType == 0) {
                str = "zo70aQ==\n";
                str2 = "gOGaDH6pIQ8=\n";
            } else if (phoneType == 1) {
                str = "epXg\n";
                str2 = "Pcat9jbMDXk=\n";
            } else if (phoneType == 2) {
                str = "GMpqyA==\n";
                str2 = "W44niYfxd7s=\n";
            } else if (phoneType != 3) {
                return "";
            } else {
                str = "OKh2\n";
                str2 = "a+Em4QXcmHM=\n";
            }
            return StringFog.decrypt(str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map NQtKsO() {
        StatFs statFs;
        if (!Environment.getExternalStorageState().equals(StringFog.decrypt("Nom+EkScfw==\n", "W+bLfDD5G/Q=\n"))) {
            Environment.getExternalStorageState().equals(StringFog.decrypt("LYLNOAY8mg==\n", "X+egV3BZ/os=\n"));
            return null;
        }
        HashMap hashMap = new HashMap();
        long blockSize = new StatFs(Environment.getExternalStorageDirectory().getPath()).getBlockSize();
        long blockCount = statFs.getBlockCount() * blockSize;
        long availableBlocks = statFs.getAvailableBlocks() * blockSize;
        hashMap.put(StringFog.decrypt("8djvfJ3m73zg\n", "hbebHfG1hgY=\n"), Long.valueOf(blockCount));
        hashMap.put(StringFog.decrypt("lIRJAtaQuqo=\n", "8vYsZ4X5wM8=\n"), Long.valueOf(availableBlocks));
        hashMap.put(StringFog.decrypt("QQiBW5CNUQ==\n", "NHvkCPn3NPI=\n"), Long.valueOf(blockCount - availableBlocks));
        return hashMap;
    }

    public static int QTcw4j1x() {
        try {
            return new File(StringFog.decrypt("qMEDpnR9tzfu0R+mdGqrMvPXF/o4aadu\n", "h7J61VsZ0kE=\n")).listFiles(new C0053C4XY()).length;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        }
    }

    public static String QTcw4j1x(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService(StringFog.decrypt("PbZ0nGr0\n", "St8a+AWD1GI=\n"))).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            return Double.toString(Math.sqrt(Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d) + Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static long RkflxGI2By7Sz() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static Boolean RkflxGI2By7Sz(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(StringFog.decrypt("BkDyw/w=\n", "diidrZkMnc8=\n"))).getSimState() != 5 ? Boolean.FALSE : Boolean.TRUE;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String Sm73oGzmW() {
        String str;
        Exception e;
        try {
            Class<?> cls = Class.forName(StringFog.decrypt("hioTWMebSTSIN1l50YFZf4oUBUXYl19ujiEE\n", "50R3KqjyLRo=\n"));
            str = (String) cls.getMethod(StringFog.decrypt("jo3v\n", "6eibGfPSAU4=\n"), String.class).invoke(cls, StringFog.decrypt("YlQh713hg058VWA=\n", "EDsPnDiT6i8=\n"));
            try {
                return str.isEmpty() ? (String) cls.getMethod(StringFog.decrypt("Pbw2\n", "WtlCCZI8seg=\n"), String.class, String.class).invoke(cls, StringFog.decrypt("4ZpTqdWNWRzyn1Hyy4pOBw==\n", "k/M/h6boK3U=\n"), StringFog.decrypt("efJgzxch6w==\n", "DJwLoXhWhfg=\n")) : str;
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
                return str;
            }
        } catch (Exception e3) {
            str = null;
            e = e3;
        }
    }

    public static String Sm73oGzmW(Context context) {
        try {
            return context.getResources().getConfiguration().locale.getLanguage();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String Tk3BGC4() {
        try {
            return Build.VERSION.SDK;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String Tk3BGC4(Context context) {
        try {
            return context.getResources().getConfiguration().locale.getISO3Country();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String X3OKRI() {
        try {
            return Build.VERSION.RELEASE;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String X3OKRI(Context context) {
        try {
            return context.getResources().getConfiguration().locale.getISO3Language();
        } catch (Exception unused) {
            return null;
        }
    }

    private JSONArray ampfXsdJX() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.QTcw4j1x.open(StringFog.decrypt("QnPiWcQnNqJTPOJU0ikro1I8+EvIIA==\n", "IRKSOKdOQs0=\n"))));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    JSONArray jSONArray = new JSONArray(sb.toString());
                    bufferedReader.close();
                    return jSONArray;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            throw new ggFJmuhehlz2k1(StringFog.decrypt("QOeOdcxEriF3qJd2yQDgLWL4mnrBEK88LfiXbM8Nrj0t4oh2xg==\n", "A4j7GahkwE4=\n"));
        } catch (JSONException unused2) {
            throw new ggFJmuhehlz2k1(StringFog.decrypt("lbXmdNKrBZqi+uN5xPgO1bW743nV4h+apPTjdMPsApul9Plr2eVLlKX62Uv5xQ==\n", "1tqTGLaLa/U=\n"));
        }
    }

    public static boolean b6HMc6th(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(StringFog.decrypt("WVZi3kUOex9MUHjJ\n", "OjkMsCBtD3Y=\n"));
            Method declaredMethod = Class.forName(connectivityManager.getClass().getName()).getDeclaredMethod(StringFog.decrypt("8VxQIvbN+3LzfUUb+Or8f/RVQQs=\n", "ljkkb5mvkh4=\n"), new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static float[] b6HMc6th() {
        try {
            return new float[]{(float) (Runtime.getRuntime().maxMemory() / 1048576.0d), (float) (Runtime.getRuntime().totalMemory() / 1048576.0d), (float) (Runtime.getRuntime().freeMemory() / 1048576.0d)};
        } catch (Exception unused) {
            return new float[]{0.0f, 0.0f, 0.0f};
        }
    }

    public static String bswmnu() {
        Process process;
        BufferedReader bufferedReader;
        try {
            try {
                process = Runtime.getRuntime().exec(StringFog.decrypt("MClnlpGvrBA5KWfIh66vAQ==\n", "V0wT5uPA3DA=\n"));
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = null;
                }
                try {
                    String readLine = bufferedReader.readLine();
                    try {
                        bufferedReader.close();
                    } catch (IOException unused2) {
                    }
                    process.destroy();
                    return readLine;
                } catch (IOException unused3) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused4) {
                    }
                    process.destroy();
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused5) {
                    }
                    process.destroy();
                    throw th;
                }
            } catch (IOException unused6) {
                process = null;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                process = null;
                bufferedReader = null;
            }
        } catch (Exception unused7) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String bswmnu(Context context) {
        String str;
        String str2;
        TelephonyManager telephonyManager;
        try {
            telephonyManager = (TelephonyManager) context.getSystemService(StringFog.decrypt("SOdJgzU=\n", "OI8m7VCQ7Q8=\n"));
        } catch (Exception unused) {
        }
        if (ActivityCompat.checkSelfPermission(context, StringFog.decrypt("Xiube7zQJJJPII1kusoz1VAr0VuW+ATjbw2wR5bmE+h+Ebo=\n", "P0X/CdO5QLw=\n")) != 0) {
            switch (telephonyManager.getNetworkType()) {
                case 0:
                    str = "hm9PAQy7Vg==\n";
                    str2 = "0wEkb2PMOPw=\n";
                    break;
                case 1:
                    str = "5zbQ8A==\n";
                    str2 = "oGaCo3SUU1c=\n";
                    break;
                case 2:
                    str = "Xkr8Sw==\n";
                    str2 = "Gw67DhzJJWY=\n";
                    break;
                case 3:
                    str = "2Y7kFw==\n";
                    str2 = "jMOwRDw+Sgw=\n";
                    break;
                case 4:
                    str = "SlxlIA==\n";
                    str2 = "CRgoYfeU3ZY=\n";
                    break;
                case 5:
                    str = "ylqd22kpO6WhLOk=\n";
                    str2 = "jwzZlElbXtM=\n";
                    break;
                case 6:
                    str = "5KCtwRahEdiP1qg=\n";
                    str2 = "ofbpjjbTdK4=\n";
                    break;
                case 7:
                    return StringFog.decrypt("gnlB2g0=\n", "swETjlnlYH4=\n");
                case 8:
                    str = "0V0aGs0=\n";
                    str2 = "mQ5eSozBkyo=\n";
                    break;
                case 9:
                    str = "THoNTQY=\n";
                    str2 = "BClYHUei4Fg=\n";
                    break;
                case 10:
                    str = "r4LRgA==\n";
                    str2 = "59GBwaJdgM0=\n";
                    break;
                case 11:
                    str = "xfhOVA==\n";
                    str2 = "rLwrOjsn/F4=\n";
                    break;
                case 12:
                    str = "/i8X0s/J3f+VWRE=\n";
                    str2 = "u3lTne+7uIk=\n";
                    break;
                case 13:
                    str = "CsNE\n";
                    str2 = "RpcBA63fE3g=\n";
                    break;
                case 14:
                    str = "gFyS/NQ=\n";
                    str2 = "5RTArJAm88A=\n";
                    break;
                case 15:
                    str = "9CgUjfg=\n";
                    str2 = "vHtEzNPVLss=\n";
                    break;
            }
            return StringFog.decrypt(str, str2);
        }
        str = "tENy7TeG5g==\n";
        str2 = "4S0Zg1jxiFk=\n";
        return StringFog.decrypt(str, str2);
    }

    public static String g6Zy() {
        try {
            return Locale.getDefault().getDisplayLanguage();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String g6Zy(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            StringBuilder sb = new StringBuilder();
            sb.append(configuration.mcc);
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String ggFJmuhehlz2k1() {
        try {
            return Build.BRAND;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String iFpfch2J8RfW1c() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String iFpfch2J8RfW1c(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), StringFog.decrypt("QxWsijn2dXlLHw==\n", "InvI+FafESY=\n"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String lm() {
        try {
            return Build.DEVICE;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String lm(Context context) {
        try {
            if (!(ActivityCompat.checkSelfPermission(context, StringFog.decrypt("PR169/Iu6cAsFmzo9DT+hzMdMNfYBsmxDDtRy9gY3rodJ1s=\n", "XHMehZ1Hje4=\n")) != 0)) {
                if (f501C4XY == null) {
                    f501C4XY = (TelephonyManager) context.getSystemService(StringFog.decrypt("QmXJ9r4=\n", "Mg2mmNsWXL4=\n"));
                }
                return f501C4XY.getDeviceId();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static long oNyMDeoN9d7r() {
        try {
            return System.currentTimeMillis() - SystemClock.elapsedRealtime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String oNyMDeoN9d7r(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            StringBuilder sb = new StringBuilder();
            sb.append(configuration.keyboard);
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String snRLW7bVlwmEpJ() {
        try {
            return Build.PRODUCT;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String snRLW7bVlwmEpJ(Context context) {
        try {
            if (!(ActivityCompat.checkSelfPermission(context, StringFog.decrypt("/ycUu/q3wIzuLAKk/K3Xy/EnXpvQn+D9zgE/h9CB9/bfHTU=\n", "nklwyZXepKI=\n")) != 0)) {
                return ((TelephonyManager) context.getSystemService(StringFog.decrypt("lZebqt8=\n", "5f/0xLrvWdo=\n"))).getSubscriberId();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static String urYzCG() {
        try {
            return Build.MODEL;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String vYxqgzJ193v1Yi(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(StringFog.decrypt("FLD+NdI=\n", "ZNiRW7eBJ5E=\n"))).getLine1Number();
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean vYxqgzJ193v1Yi() {
        try {
            String str = Build.TAGS;
            if (str == null || !str.contains(StringFog.decrypt("frFQsBu0He95\n", "CtQjxDbfeJY=\n"))) {
                String[] strArr = {StringFog.decrypt("0kP0dt1AKJ6cQP0q+lA11I9F/mDbCyTBlg==\n", "/TCNBaklRbE=\n"), StringFog.decrypt("jqaczYLlFRs=\n", "odX+pOzKZm4=\n"), StringFog.decrypt("9+6QxgKWHRq69IeaBYY=\n", "2J3ptXbzcDU=\n"), StringFog.decrypt("nM5qLL68anvL33ox5apy\n", "s70TX8rZB1Q=\n"), StringFog.decrypt("5QWASSWO1YCpAI0SPMPQgeUSlA==\n", "ymHhPUShue8=\n"), StringFog.decrypt("ma0JiIBCWHjVqATTgwRaOMW8\n", "tslo/OFtNBc=\n"), StringFog.decrypt("ylcsjjtu45qWQHqFLWLgmpZR\n", "5SRV/U8LjrU=\n"), StringFog.decrypt("8Q1s2PQKguC8F3uE5g6Go60fc86vHJo=\n", "3n4Vq4Bv788=\n"), StringFog.decrypt("DIm3ijKbRm5AjLrRIME=\n", "I+3W/lO0KgE=\n"), StringFog.decrypt("5eEWbu/aEYG55w==\n", "ypJjQY2zf64=\n")};
                for (int i = 0; i < 10; i++) {
                    if (new File(strArr[i]).exists()) {
                        return true;
                    }
                }
                Process exec = Runtime.getRuntime().exec(new String[]{StringFog.decrypt("UgHrP1D6AlYFEPsiC+gHEB4a\n", "fXKSTCSfb3k=\n"), StringFog.decrypt("STQ=\n", "OkFENGws3RQ=\n")});
                if (new BufferedReader(new InputStreamReader(exec.getInputStream())).readLine() != null) {
                    if (exec != null) {
                        exec.destroy();
                    }
                    return true;
                }
                if (exec != null) {
                    exec.destroy();
                }
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static long wXOhEqY() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String wXOhEqY(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService(StringFog.decrypt("Xc9VxTg=\n", "Lac6q11pYnc=\n"))).getSimCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String xoHs(Context context) {
        try {
            Configuration configuration = context.getResources().getConfiguration();
            StringBuilder sb = new StringBuilder();
            sb.append(configuration.mnc);
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean xoHs() {
        try {
            if (!Build.FINGERPRINT.startsWith(StringFog.decrypt("faazyNZOcg==\n", "GsPdraQnEZM=\n")) && !Build.FINGERPRINT.toLowerCase().contains(StringFog.decrypt("HGEU7Q==\n", "agN7lWYZNws=\n")) && !Build.FINGERPRINT.toLowerCase().contains(StringFog.decrypt("2OfP6rOrjyrf\n", "rIK8np7A6lM=\n")) && !Build.MODEL.contains(StringFog.decrypt("uXgZx3UQu7y6fA==\n", "3hd2oBl15M8=\n")) && !Build.MODEL.contains(StringFog.decrypt("EIcg\n", "Y+NL/PPIzMw=\n")) && !Build.MODEL.contains(StringFog.decrypt("dBqcHaox9SI=\n", "MXfpcctFmlA=\n")) && !Build.MANUFACTURER.contains(StringFog.decrypt("uGwF2hMYbWSQZw==\n", "/wlro353GQ0=\n")) && (!Build.BRAND.startsWith(StringFog.decrypt("9LP/0rZfsQ==\n", "k9aRt8Q20kk=\n")) || !Build.DEVICE.startsWith(StringFog.decrypt("tTOonxh4+Q==\n", "0lbG+moRmmQ=\n")))) {
                if (!StringFog.decrypt("jAaI3rTg1tGPAg==\n", "62nnudiFiaI=\n").equals(Build.PRODUCT)) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public List<Class<? extends iFpfch2J8RfW1c>> hO0() {
        JSONArray ampfXsdJX = ampfXsdJX();
        ArrayList arrayList = new ArrayList();
        try {
            int length = ampfXsdJX.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(Class.forName(ampfXsdJX.getJSONObject(i).getString(StringFog.decrypt("LDdlZ3VK9VIn\n", "T1sEFAY6lCY=\n"))).asSubclass(iFpfch2J8RfW1c.class));
            }
            return arrayList;
        } catch (ClassNotFoundException e) {
            throw new ggFJmuhehlz2k1(StringFog.decrypt("Fl6bL4B1VRQhEYgqijEbGDlQnTDEN0JbNl2PMJd1SxohWdRj\n", "VTHuQ+RVO3s=\n") + e.getMessage());
        } catch (JSONException unused) {
            throw new ggFJmuhehlz2k1(StringFog.decrypt("FD4e3cR5/1gjcRvQ0ir0FzQwG9DDMOVYJX8b3dU++FkkfwHCzzexViRxIeLvFw==\n", "V1FrsaBZkTc=\n"));
        }
    }
}