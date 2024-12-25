package p332t6;

import p059d9.C4349a;
import p267p6.C7629w0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:t6/g.class
 */
/* renamed from: t6.g */
/* loaded from: combined.jar:classes2.jar:t6/g.class */
public final class C8639g {

    /* renamed from: a */
    public final String f40335a;

    /* renamed from: b */
    public final C7629w0 f40336b;

    /* renamed from: c */
    public final C7629w0 f40337c;

    /* renamed from: d */
    public final int f40338d;

    /* renamed from: e */
    public final int f40339e;

    public C8639g(String str, C7629w0 c7629w0, C7629w0 c7629w02, int i10, int i11) {
        C4349a.m21878a(i10 == 0 || i11 == 0);
        this.f40335a = C4349a.m21881d(str);
        this.f40336b = (C7629w0) C4349a.m21882e(c7629w0);
        this.f40337c = (C7629w0) C4349a.m21882e(c7629w02);
        this.f40338d = i10;
        this.f40339e = i11;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8639g.class != obj.getClass()) {
            return false;
        }
        C8639g c8639g = (C8639g) obj;
        if (this.f40338d != c8639g.f40338d || this.f40339e != c8639g.f40339e || !this.f40335a.equals(c8639g.f40335a) || !this.f40336b.equals(c8639g.f40336b) || !this.f40337c.equals(c8639g.f40337c)) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((((((527 + this.f40338d) * 31) + this.f40339e) * 31) + this.f40335a.hashCode()) * 31) + this.f40336b.hashCode()) * 31) + this.f40337c.hashCode();
    }
}
