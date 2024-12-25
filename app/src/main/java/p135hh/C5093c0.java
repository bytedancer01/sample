package p135hh;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.amazonaws.services.p045s3.model.InstructionFileId;
import de.blinkt.openvpn.core.NativeUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Vector;
import p083eh.C4726a;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/c0.class
 */
/* renamed from: hh.c0 */
/* loaded from: combined.jar:classes2.jar:hh/c0.class */
public class C5093c0 {
    /* renamed from: a */
    public static String[] m25435a(Context context) {
        Vector vector = new Vector();
        vector.add(m25441g(context));
        vector.add("--config");
        vector.add(m25436b(context));
        return (String[]) vector.toArray(new String[0]);
    }

    /* renamed from: b */
    public static String m25436b(Context context) {
        return context.getCacheDir().getAbsolutePath() + "/android.conf";
    }

    /* renamed from: c */
    public static String m25437c() {
        return "pie_openvpn";
    }

    @TargetApi(21)
    /* renamed from: d */
    public static String[] m25438d() {
        return Build.SUPPORTED_ABIS;
    }

    /* renamed from: e */
    public static String[] m25439e(String[] strArr) {
        strArr[0] = strArr[0].replace("pie_openvpn", "nopie_openvpn");
        return strArr;
    }

    /* renamed from: f */
    public static void m25440f(C4726a c4726a, Context context) {
        Intent m23859N = c4726a.m23859N(context);
        if (m23859N != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(m23859N);
            } else {
                context.startService(m23859N);
            }
        }
    }

    /* renamed from: g */
    public static String m25441g(Context context) {
        String m22575a = NativeUtils.m22575a();
        if (Build.VERSION.SDK_INT >= 28) {
            return new File(context.getApplicationInfo().nativeLibraryDir, "libovpnexec.so").getPath();
        }
        String[] m25438d = m25438d();
        String[] strArr = m25438d;
        if (!m22575a.equals(m25438d[0])) {
            C5095d0.m25482y(2132017239, Arrays.toString(m25438d), m22575a);
            strArr = new String[]{m22575a};
        }
        for (String str : strArr) {
            File file = new File(context.getCacheDir(), "c_" + m25437c() + InstructionFileId.DOT + str);
            if ((file.exists() && file.canExecute()) || m25442h(context, str, file)) {
                return file.getPath();
            }
        }
        throw new RuntimeException("Cannot find any executable for this device's ABIs " + Arrays.toString(strArr));
    }

    /* renamed from: h */
    public static boolean m25442h(Context context, String str, File file) {
        try {
            try {
                InputStream open = context.getAssets().open(m25437c() + InstructionFileId.DOT + str);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = open.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                if (file.setExecutable(true)) {
                    return true;
                }
                C5095d0.m25473p("Failed to make OpenVPN executable");
                return false;
            } catch (IOException e10) {
                C5095d0.m25478u("Failed getting assets for archicture " + str);
                return false;
            }
        } catch (IOException e11) {
            C5095d0.m25475r(e11);
            return false;
        }
    }
}
