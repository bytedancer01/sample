package ma;

import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/fj.class
 */
/* renamed from: ma.fj */
/* loaded from: combined.jar:classes2.jar:ma/fj.class */
public final class C6130fj extends AbstractC6172hj {
    public C6130fj(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // ma.AbstractC6172hj
    /* renamed from: a */
    public final double mo29574a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f33800a.getLong(obj, j10));
    }

    @Override // ma.AbstractC6172hj
    /* renamed from: b */
    public final float mo29575b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f33800a.getInt(obj, j10));
    }

    @Override // ma.AbstractC6172hj
    /* renamed from: c */
    public final void mo29576c(Object obj, long j10, boolean z10) {
        if (C6193ij.f33836h) {
            C6193ij.m29742d(obj, j10, r8 ? (byte) 1 : (byte) 0);
        } else {
            C6193ij.m29743e(obj, j10, r8 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // ma.AbstractC6172hj
    /* renamed from: d */
    public final void mo29577d(Object obj, long j10, byte b10) {
        if (C6193ij.f33836h) {
            C6193ij.m29742d(obj, j10, b10);
        } else {
            C6193ij.m29743e(obj, j10, b10);
        }
    }

    @Override // ma.AbstractC6172hj
    /* renamed from: e */
    public final void mo29578e(Object obj, long j10, double d10) {
        this.f33800a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // ma.AbstractC6172hj
    /* renamed from: f */
    public final void mo29579f(Object obj, long j10, float f10) {
        this.f33800a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // ma.AbstractC6172hj
    /* renamed from: g */
    public final boolean mo29580g(Object obj, long j10) {
        return C6193ij.f33836h ? C6193ij.m29763y(obj, j10) : C6193ij.m29764z(obj, j10);
    }
}
