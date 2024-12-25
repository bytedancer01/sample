package p078e9;

import p267p6.C7604o;
import p267p6.InterfaceC7579g;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:e9/d0.class
 */
/* renamed from: e9.d0 */
/* loaded from: combined.jar:classes2.jar:e9/d0.class */
public final class C4670d0 {

    /* renamed from: e */
    public static final C4670d0 f27557e = new C4670d0(0, 0);

    /* renamed from: f */
    public static final InterfaceC7579g<C4670d0> f27558f = new C7604o();

    /* renamed from: a */
    public final int f27559a;

    /* renamed from: b */
    public final int f27560b;

    /* renamed from: c */
    public final int f27561c;

    /* renamed from: d */
    public final float f27562d;

    public C4670d0(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public C4670d0(int i10, int i11, int i12, float f10) {
        this.f27559a = i10;
        this.f27560b = i11;
        this.f27561c = i12;
        this.f27562d = f10;
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4670d0)) {
            return false;
        }
        C4670d0 c4670d0 = (C4670d0) obj;
        if (this.f27559a != c4670d0.f27559a || this.f27560b != c4670d0.f27560b || this.f27561c != c4670d0.f27561c || this.f27562d != c4670d0.f27562d) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((((((217 + this.f27559a) * 31) + this.f27560b) * 31) + this.f27561c) * 31) + Float.floatToRawIntBits(this.f27562d);
    }
}
