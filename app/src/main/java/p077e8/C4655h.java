package p077e8;

import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e8/h.class
 */
/* renamed from: e8.h */
/* loaded from: combined.jar:classes2.jar:e8/h.class */
public final class C4655h {

    /* renamed from: a */
    public final String f27449a;

    /* renamed from: b */
    public final String f27450b;

    /* renamed from: c */
    public final String f27451c;

    /* renamed from: d */
    public final String f27452d;

    /* renamed from: e */
    public final String f27453e;

    public C4655h(String str, String str2, String str3, String str4, String str5) {
        this.f27449a = str;
        this.f27450b = str2;
        this.f27451c = str3;
        this.f27452d = str4;
        this.f27453e = str5;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4655h)) {
            return false;
        }
        C4655h c4655h = (C4655h) obj;
        if (!C4401z0.m22371c(this.f27449a, c4655h.f27449a) || !C4401z0.m22371c(this.f27450b, c4655h.f27450b) || !C4401z0.m22371c(this.f27451c, c4655h.f27451c) || !C4401z0.m22371c(this.f27452d, c4655h.f27452d) || !C4401z0.m22371c(this.f27453e, c4655h.f27453e)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        String str = this.f27449a;
        int i10 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f27450b;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.f27451c;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.f27452d;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.f27453e;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return ((((((((527 + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i10;
    }
}
