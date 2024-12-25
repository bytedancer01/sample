package p389wg;

import p411xi.C9764h;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:wg/d.class
 */
/* renamed from: wg.d */
/* loaded from: combined.jar:classes2.jar:wg/d.class */
public final class C9577d {

    /* renamed from: d */
    public static final C9764h f43601d = C9764h.m41183h(":status");

    /* renamed from: e */
    public static final C9764h f43602e = C9764h.m41183h(":method");

    /* renamed from: f */
    public static final C9764h f43603f = C9764h.m41183h(":path");

    /* renamed from: g */
    public static final C9764h f43604g = C9764h.m41183h(":scheme");

    /* renamed from: h */
    public static final C9764h f43605h = C9764h.m41183h(":authority");

    /* renamed from: i */
    public static final C9764h f43606i = C9764h.m41183h(":host");

    /* renamed from: j */
    public static final C9764h f43607j = C9764h.m41183h(":version");

    /* renamed from: a */
    public final C9764h f43608a;

    /* renamed from: b */
    public final C9764h f43609b;

    /* renamed from: c */
    public final int f43610c;

    public C9577d(String str, String str2) {
        this(C9764h.m41183h(str), C9764h.m41183h(str2));
    }

    public C9577d(C9764h c9764h, String str) {
        this(c9764h, C9764h.m41183h(str));
    }

    public C9577d(C9764h c9764h, C9764h c9764h2) {
        this.f43608a = c9764h;
        this.f43609b = c9764h2;
        this.f43610c = c9764h.size() + 32 + c9764h2.size();
    }

    public boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C9577d) {
            C9577d c9577d = (C9577d) obj;
            z10 = false;
            if (this.f43608a.equals(c9577d.f43608a)) {
                z10 = false;
                if (this.f43609b.equals(c9577d.f43609b)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public int hashCode() {
        return ((527 + this.f43608a.hashCode()) * 31) + this.f43609b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f43608a.m41188D(), this.f43609b.m41188D());
    }
}
