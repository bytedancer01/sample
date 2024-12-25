package ua;

import android.os.Bundle;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/z3.class
 */
/* renamed from: ua.z3 */
/* loaded from: combined.jar:classes2.jar:ua/z3.class */
public final class C9139z3 {

    /* renamed from: a */
    public final String f41815a;

    /* renamed from: b */
    public final String f41816b;

    /* renamed from: c */
    public final long f41817c;

    /* renamed from: d */
    public final Bundle f41818d;

    public C9139z3(String str, String str2, Bundle bundle, long j10) {
        this.f41815a = str;
        this.f41816b = str2;
        this.f41818d = bundle;
        this.f41817c = j10;
    }

    /* renamed from: a */
    public static C9139z3 m38422a(C9068t c9068t) {
        return new C9139z3(c9068t.f41627d, c9068t.f41629f, c9068t.f41628e.m38211T(), c9068t.f41630g);
    }

    /* renamed from: b */
    public final C9068t m38423b() {
        return new C9068t(this.f41815a, new C9044r(new Bundle(this.f41818d)), this.f41816b, this.f41817c);
    }

    public final String toString() {
        String str = this.f41816b;
        String str2 = this.f41815a;
        String valueOf = String.valueOf(this.f41818d);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }
}
