package p305ra;

import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/y8.class
 */
/* renamed from: ra.y8 */
/* loaded from: combined.jar:classes2.jar:ra/y8.class */
public final class C8428y8 extends AbstractC8084b9 {
    public C8428y8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: a */
    public final byte mo35007a(Object obj, long j10) {
        byte m35123i;
        byte m35122h;
        if (C8099c9.f38977i) {
            m35122h = C8099c9.m35122h(obj, j10);
            return m35122h;
        }
        m35123i = C8099c9.m35123i(obj, j10);
        return m35123i;
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: b */
    public final void mo35008b(Object obj, long j10, byte b10) {
        if (C8099c9.f38977i) {
            C8099c9.m35124j(obj, j10, b10);
        } else {
            C8099c9.m35125k(obj, j10, b10);
        }
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: c */
    public final boolean mo35009c(Object obj, long j10) {
        return C8099c9.f38977i ? C8099c9.m35113J(obj, j10) : C8099c9.m35114K(obj, j10);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: d */
    public final void mo35010d(Object obj, long j10, boolean z10) {
        if (C8099c9.f38977i) {
            C8099c9.m35124j(obj, j10, r8 ? (byte) 1 : (byte) 0);
        } else {
            C8099c9.m35125k(obj, j10, r8 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: e */
    public final float mo35011e(Object obj, long j10) {
        return Float.intBitsToFloat(m35044n(obj, j10));
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: f */
    public final void mo35012f(Object obj, long j10, float f10) {
        m35045o(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: g */
    public final double mo35013g(Object obj, long j10) {
        return Double.longBitsToDouble(m35046p(obj, j10));
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: h */
    public final void mo35014h(Object obj, long j10, double d10) {
        m35047q(obj, j10, Double.doubleToLongBits(d10));
    }
}
