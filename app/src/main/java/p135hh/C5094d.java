package p135hh;

import android.text.TextUtils;
import java.io.Serializable;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:hh/d.class
 */
/* renamed from: hh.d */
/* loaded from: combined.jar:classes2.jar:hh/d.class */
public class C5094d implements Serializable, Cloneable {

    /* renamed from: l */
    public boolean f29241l;

    /* renamed from: b */
    public String f29231b = "openvpn.example.com";

    /* renamed from: c */
    public String f29232c = "1194";

    /* renamed from: d */
    public boolean f29233d = true;

    /* renamed from: e */
    public String f29234e = "";

    /* renamed from: f */
    public boolean f29235f = false;

    /* renamed from: g */
    public boolean f29236g = true;

    /* renamed from: h */
    public int f29237h = 0;

    /* renamed from: i */
    public a f29238i = a.NONE;

    /* renamed from: j */
    public String f29239j = "proxy.example.com";

    /* renamed from: k */
    public String f29240k = "8080";

    /* renamed from: m */
    public String f29242m = null;

    /* renamed from: n */
    public String f29243n = null;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:hh/d$a.class
     */
    /* renamed from: hh.d$a */
    /* loaded from: combined.jar:classes2.jar:hh/d$a.class */
    public enum a {
        NONE,
        HTTP,
        SOCKS5,
        ORBOT
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C5094d clone() {
        return (C5094d) super.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e5, code lost:
    
        if (m25446d() != false) goto L13;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m25444b(boolean r9) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p135hh.C5094d.m25444b(boolean):java.lang.String");
    }

    /* renamed from: c */
    public boolean m25445c() {
        return TextUtils.isEmpty(this.f29234e) || !this.f29235f;
    }

    /* renamed from: d */
    public boolean m25446d() {
        return this.f29235f && this.f29234e.contains("http-proxy-option ");
    }
}
