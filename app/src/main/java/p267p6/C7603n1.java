package p267p6;

import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:p6/n1.class
 */
/* renamed from: p6.n1 */
/* loaded from: combined.jar:classes2.jar:p6/n1.class */
public final class C7603n1 {

    /* renamed from: d */
    public static final C7603n1 f36894d = new C7603n1(1.0f);

    /* renamed from: e */
    public static final InterfaceC7579g<C7603n1> f36895e = new C7604o();

    /* renamed from: a */
    public final float f36896a;

    /* renamed from: b */
    public final float f36897b;

    /* renamed from: c */
    public final int f36898c;

    public C7603n1(float f10) {
        this(f10, 1.0f);
    }

    public C7603n1(float f10, float f11) {
        C4349a.m21878a(f10 > 0.0f);
        C4349a.m21878a(f11 > 0.0f);
        this.f36896a = f10;
        this.f36897b = f11;
        this.f36898c = Math.round(f10 * 1000.0f);
    }

    /* renamed from: a */
    public long m32863a(long j10) {
        return j10 * this.f36898c;
    }

    /* renamed from: b */
    public C7603n1 m32864b(float f10) {
        return new C7603n1(f10, this.f36897b);
    }

    public boolean equals(Object obj) {
        boolean z10 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7603n1.class != obj.getClass()) {
            return false;
        }
        C7603n1 c7603n1 = (C7603n1) obj;
        if (this.f36896a != c7603n1.f36896a || this.f36897b != c7603n1.f36897b) {
            z10 = false;
        }
        return z10;
    }

    public int hashCode() {
        return ((527 + Float.floatToRawIntBits(this.f36896a)) * 31) + Float.floatToRawIntBits(this.f36897b);
    }

    public String toString() {
        return C4401z0.m22321E("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f36896a), Float.valueOf(this.f36897b));
    }
}
