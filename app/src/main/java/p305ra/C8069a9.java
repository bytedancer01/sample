package p305ra;

import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/a9.class
 */
/* renamed from: ra.a9 */
/* loaded from: combined.jar:classes2.jar:ra/a9.class */
public final class C8069a9 extends AbstractC8084b9 {
    public C8069a9(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: a */
    public final byte mo35007a(Object obj, long j10) {
        return this.f38951a.getByte(obj, j10);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: b */
    public final void mo35008b(Object obj, long j10, byte b10) {
        this.f38951a.putByte(obj, j10, b10);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: c */
    public final boolean mo35009c(Object obj, long j10) {
        return this.f38951a.getBoolean(obj, j10);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: d */
    public final void mo35010d(Object obj, long j10, boolean z10) {
        this.f38951a.putBoolean(obj, j10, z10);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: e */
    public final float mo35011e(Object obj, long j10) {
        return this.f38951a.getFloat(obj, j10);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: f */
    public final void mo35012f(Object obj, long j10, float f10) {
        this.f38951a.putFloat(obj, j10, f10);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: g */
    public final double mo35013g(Object obj, long j10) {
        return this.f38951a.getDouble(obj, j10);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: h */
    public final void mo35014h(Object obj, long j10, double d10) {
        this.f38951a.putDouble(obj, j10, d10);
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: i */
    public final boolean mo35015i() {
        if (!super.mo35015i()) {
            return false;
        }
        try {
            Class<?> cls = this.f38951a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th2) {
            C8099c9.m35107D(th2);
            return false;
        }
    }

    @Override // p305ra.AbstractC8084b9
    /* renamed from: j */
    public final boolean mo35016j() {
        if (!super.mo35016j()) {
            return false;
        }
        try {
            Class<?> cls = this.f38951a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th2) {
            C8099c9.m35107D(th2);
            return false;
        }
    }
}
