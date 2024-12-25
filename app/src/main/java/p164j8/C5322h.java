package p164j8;

import ec.C4699b;
import java.util.Map;
import p099fc.AbstractC4838v;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:j8/h.class
 */
/* renamed from: j8.h */
/* loaded from: combined.jar:classes2.jar:j8/h.class */
public final class C5322h {

    /* renamed from: a */
    public final int f30579a;

    /* renamed from: b */
    public final int f30580b;

    /* renamed from: c */
    public final C7629w0 f30581c;

    /* renamed from: d */
    public final AbstractC4838v<String, String> f30582d;

    public C5322h(C7629w0 c7629w0, int i10, int i11, Map<String, String> map) {
        this.f30579a = i10;
        this.f30580b = i11;
        this.f30581c = c7629w0;
        this.f30582d = AbstractC4838v.m24567d(map);
    }

    /* renamed from: a */
    public static String m26577a(String str) {
        String m23639f = C4699b.m23639f(str);
        m23639f.hashCode();
        switch (m23639f) {
            case "MPEG4-GENERIC":
                return "audio/mp4a-latm";
            case "AC3":
                return "audio/ac3";
            case "H264":
                return "video/avc";
            default:
                throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static boolean m26578b(C5314a c5314a) {
        String m23639f = C4699b.m23639f(c5314a.f30520j.f30531b);
        m23639f.hashCode();
        switch (m23639f) {
            case "MPEG4-GENERIC":
            case "AC3":
            case "H264":
                return true;
            default:
                return false;
        }
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C5322h.class != obj.getClass()) {
            return false;
        }
        C5322h c5322h = (C5322h) obj;
        if (this.f30579a != c5322h.f30579a || this.f30580b != c5322h.f30580b || !this.f30581c.equals(c5322h.f30581c) || !this.f30582d.equals(c5322h.f30582d)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((((217 + this.f30579a) * 31) + this.f30580b) * 31) + this.f30581c.hashCode()) * 31) + this.f30582d.hashCode();
    }
}
