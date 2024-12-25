package p347u6;

import p267p6.C7604o;
import p267p6.InterfaceC7579g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:u6/a.class
 */
/* renamed from: u6.a */
/* loaded from: combined.jar:classes2.jar:u6/a.class */
public final class C8795a {

    /* renamed from: d */
    public static final C8795a f40792d = new C8795a(0, 0, 0);

    /* renamed from: e */
    public static final InterfaceC7579g<C8795a> f40793e = new C7604o();

    /* renamed from: a */
    public final int f40794a;

    /* renamed from: b */
    public final int f40795b;

    /* renamed from: c */
    public final int f40796c;

    public C8795a(int i10, int i11, int i12) {
        this.f40794a = i10;
        this.f40795b = i11;
        this.f40796c = i12;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8795a)) {
            return false;
        }
        C8795a c8795a = (C8795a) obj;
        if (this.f40794a != c8795a.f40794a || this.f40795b != c8795a.f40795b || this.f40796c != c8795a.f40796c) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((527 + this.f40794a) * 31) + this.f40795b) * 31) + this.f40796c;
    }
}
