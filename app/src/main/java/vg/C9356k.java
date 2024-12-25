package vg;

import java.net.Proxy;
import java.net.URL;
import tg.C8743s;
import tg.EnumC8742r;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:vg/k.class
 */
/* renamed from: vg.k */
/* loaded from: combined.jar:classes2.jar:vg/k.class */
public final class C9356k {
    /* renamed from: a */
    public static String m39491a(C8743s c8743s, Proxy.Type type, EnumC8742r enumC8742r) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c8743s.m37463m());
        sb2.append(' ');
        boolean m39492b = m39492b(c8743s, type);
        URL m37466p = c8743s.m37466p();
        if (m39492b) {
            sb2.append(m37466p);
        } else {
            sb2.append(m39493c(m37466p));
        }
        sb2.append(' ');
        sb2.append(m39494d(enumC8742r));
        return sb2.toString();
    }

    /* renamed from: b */
    public static boolean m39492b(C8743s c8743s, Proxy.Type type) {
        return !c8743s.m37462l() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m39493c(URL url) {
        String file = url.getFile();
        if (file == null) {
            return "/";
        }
        String str = file;
        if (!file.startsWith("/")) {
            str = "/" + file;
        }
        return str;
    }

    /* renamed from: d */
    public static String m39494d(EnumC8742r enumC8742r) {
        return enumC8742r == EnumC8742r.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1";
    }
}
