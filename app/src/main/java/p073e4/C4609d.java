package p073e4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/d.class
 */
/* renamed from: e4.d */
/* loaded from: combined.jar:classes1.jar:e4/d.class */
public class C4609d {

    /* renamed from: a */
    public final URL f27286a;

    /* renamed from: b */
    public final InterfaceC4610e f27287b;

    /* renamed from: c */
    public final String f27288c;

    /* renamed from: d */
    public String f27289d;

    /* renamed from: e */
    public URL f27290e;

    public C4609d(String str) {
        this(str, InterfaceC4610e.f27292b);
    }

    public C4609d(String str, InterfaceC4610e interfaceC4610e) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        }
        if (interfaceC4610e == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.f27288c = str;
        this.f27286a = null;
        this.f27287b = interfaceC4610e;
    }

    public C4609d(URL url) {
        this(url, InterfaceC4610e.f27292b);
    }

    public C4609d(URL url, InterfaceC4610e interfaceC4610e) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        }
        if (interfaceC4610e == null) {
            throw new IllegalArgumentException("Headers must not be null");
        }
        this.f27286a = url;
        this.f27288c = null;
        this.f27287b = interfaceC4610e;
    }

    /* renamed from: a */
    public String m23235a() {
        String str = this.f27288c;
        if (str == null) {
            str = this.f27286a.toString();
        }
        return str;
    }

    /* renamed from: b */
    public Map<String, String> m23236b() {
        return this.f27287b.getHeaders();
    }

    /* renamed from: c */
    public final String m23237c() {
        if (TextUtils.isEmpty(this.f27289d)) {
            String str = this.f27288c;
            String str2 = str;
            if (TextUtils.isEmpty(str)) {
                str2 = this.f27286a.toString();
            }
            this.f27289d = Uri.encode(str2, "@#&=*+-_.,:!?()/~'%");
        }
        return this.f27289d;
    }

    /* renamed from: d */
    public final URL m23238d() {
        if (this.f27290e == null) {
            this.f27290e = new URL(m23237c());
        }
        return this.f27290e;
    }

    /* renamed from: e */
    public URL m23239e() {
        return m23238d();
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C4609d) {
            C4609d c4609d = (C4609d) obj;
            z10 = false;
            if (m23235a().equals(c4609d.m23235a())) {
                z10 = false;
                if (this.f27287b.equals(c4609d.f27287b)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public int hashCode() {
        return (m23235a().hashCode() * 31) + this.f27287b.hashCode();
    }

    public String toString() {
        return m23235a() + '\n' + this.f27287b.toString();
    }
}
