package p109g3;

import p173ji.C5410f0;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g3/c.class
 */
/* renamed from: g3.c */
/* loaded from: combined.jar:classes1.jar:g3/c.class */
public final class C4937c extends C4936b {

    /* renamed from: b */
    public final int f28693b;

    /* renamed from: c */
    public final String f28694c;

    /* renamed from: d */
    public final transient C5410f0 f28695d;

    public C4937c(C5410f0 c5410f0) {
        super(m24931a(c5410f0));
        this.f28693b = c5410f0 != null ? c5410f0.m26925q() : 0;
        this.f28694c = c5410f0 != null ? c5410f0.m26929v0() : "";
        this.f28695d = c5410f0;
    }

    /* renamed from: a */
    public static String m24931a(C5410f0 c5410f0) {
        if (c5410f0 == null) {
            return "Empty HTTP response";
        }
        return "HTTP " + c5410f0.m26925q() + " " + c5410f0.m26929v0();
    }

    /* renamed from: b */
    public C5410f0 m24932b() {
        return this.f28695d;
    }
}
