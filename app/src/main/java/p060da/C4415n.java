package p060da;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p422y9.C9935o;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:da/n.class
 */
/* renamed from: da.n */
/* loaded from: combined.jar:classes2.jar:da/n.class */
public class C4415n {

    /* renamed from: a */
    public static String f26704a;

    /* renamed from: b */
    public static int f26705b;

    /* renamed from: a */
    public static String m22462a() {
        BufferedReader bufferedReader;
        String sb2;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        if (f26704a == null) {
            int i10 = f26705b;
            int i11 = i10;
            if (i10 == 0) {
                i11 = Process.myPid();
                f26705b = i11;
            }
            String str = null;
            if (i11 <= 0) {
                str = null;
            } else {
                try {
                    StringBuilder sb3 = new StringBuilder(25);
                    sb3.append("/proc/");
                    sb3.append(i11);
                    sb3.append("/cmdline");
                    sb2 = sb3.toString();
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                } catch (IOException e10) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
                try {
                    bufferedReader = new BufferedReader(new FileReader(sb2));
                    try {
                        String readLine = bufferedReader.readLine();
                        C9935o.m41850j(readLine);
                        str = readLine.trim();
                    } catch (IOException e11) {
                    } catch (Throwable th3) {
                        th = th3;
                        C4412k.m22448a(bufferedReader);
                        throw th;
                    }
                    C4412k.m22448a(bufferedReader);
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
            f26704a = str;
        }
        return f26704a;
    }
}
