package p339ti;

import android.util.Log;
import ci.C1129o;
import ci.C1131q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kh.C5632z;
import ni.C6798e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p173ji.C5402b0;
import p312ri.C8479e;
import p372vh.C9367f;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ti/c.class
 */
/* renamed from: ti.c */
/* loaded from: combined.jar:classes2.jar:ti/c.class */
public final class C8752c {

    /* renamed from: b */
    public static final Map<String, String> f40717b;

    /* renamed from: c */
    public static final C8752c f40718c = new C8752c();

    /* renamed from: a */
    public static final CopyOnWriteArraySet<Logger> f40716a = new CopyOnWriteArraySet<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r02 = C5402b0.class.getPackage();
        String name = r02 != null ? r02.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C5402b0.class.getName();
        C9367f.m39525d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C8479e.class.getName();
        C9367f.m39525d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C6798e.class.getName();
        C9367f.m39525d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f40717b = C5632z.m27750d(linkedHashMap);
    }

    /* renamed from: a */
    public final void m37551a(@NotNull String str, int i10, @NotNull String str2, @Nullable Throwable th2) {
        int min;
        C9367f.m39526e(str, "loggerName");
        C9367f.m39526e(str2, "message");
        String m37554d = m37554d(str);
        if (Log.isLoggable(m37554d, i10)) {
            String str3 = str2;
            if (th2 != null) {
                str3 = str2 + "\n" + Log.getStackTraceString(th2);
            }
            int i11 = 0;
            int length = str3.length();
            while (i11 < length) {
                int m6746N = C1129o.m6746N(str3, '\n', i11, false, 4, null);
                if (m6746N == -1) {
                    m6746N = length;
                }
                while (true) {
                    min = Math.min(m6746N, i11 + 4000);
                    String substring = str3.substring(i11, min);
                    C9367f.m39525d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i10, m37554d, substring);
                    if (min >= m6746N) {
                        break;
                    } else {
                        i11 = min;
                    }
                }
                i11 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m37552b() {
        for (Map.Entry<String, String> entry : f40717b.entrySet()) {
            m37553c(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m37553c(String str, String str2) {
        Logger logger = Logger.getLogger(str);
        if (f40716a.add(logger)) {
            C9367f.m39525d(logger, "logger");
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(C8753d.f40719a);
        }
    }

    /* renamed from: d */
    public final String m37554d(String str) {
        String str2 = f40717b.get(str);
        return str2 != null ? str2 : C1131q.m6785w0(str, 23);
    }
}
