package p305ra;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/b9.class
 */
/* renamed from: ra.b9 */
/* loaded from: combined.jar:classes2.jar:ra/b9.class */
public abstract class AbstractC8084b9 {

    /* renamed from: a */
    public final Unsafe f38951a;

    public AbstractC8084b9(Unsafe unsafe) {
        this.f38951a = unsafe;
    }

    /* renamed from: a */
    public abstract byte mo35007a(Object obj, long j10);

    /* renamed from: b */
    public abstract void mo35008b(Object obj, long j10, byte b10);

    /* renamed from: c */
    public abstract boolean mo35009c(Object obj, long j10);

    /* renamed from: d */
    public abstract void mo35010d(Object obj, long j10, boolean z10);

    /* renamed from: e */
    public abstract float mo35011e(Object obj, long j10);

    /* renamed from: f */
    public abstract void mo35012f(Object obj, long j10, float f10);

    /* renamed from: g */
    public abstract double mo35013g(Object obj, long j10);

    /* renamed from: h */
    public abstract void mo35014h(Object obj, long j10, double d10);

    /* renamed from: i */
    public boolean mo35015i() {
        Unsafe unsafe = this.f38951a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th2) {
            C8099c9.m35107D(th2);
            return false;
        }
    }

    /* renamed from: j */
    public boolean mo35016j() {
        Field m35120f;
        Unsafe unsafe = this.f38951a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            m35120f = C8099c9.m35120f();
            return m35120f != null;
        } catch (Throwable th2) {
            C8099c9.m35107D(th2);
            return false;
        }
    }

    /* renamed from: k */
    public final long m35041k(Field field) {
        return this.f38951a.objectFieldOffset(field);
    }

    /* renamed from: l */
    public final int m35042l(Class<?> cls) {
        return this.f38951a.arrayBaseOffset(cls);
    }

    /* renamed from: m */
    public final int m35043m(Class<?> cls) {
        return this.f38951a.arrayIndexScale(cls);
    }

    /* renamed from: n */
    public final int m35044n(Object obj, long j10) {
        return this.f38951a.getInt(obj, j10);
    }

    /* renamed from: o */
    public final void m35045o(Object obj, long j10, int i10) {
        this.f38951a.putInt(obj, j10, i10);
    }

    /* renamed from: p */
    public final long m35046p(Object obj, long j10) {
        return this.f38951a.getLong(obj, j10);
    }

    /* renamed from: q */
    public final void m35047q(Object obj, long j10, long j11) {
        this.f38951a.putLong(obj, j10, j11);
    }

    /* renamed from: r */
    public final Object m35048r(Object obj, long j10) {
        return this.f38951a.getObject(obj, j10);
    }

    /* renamed from: s */
    public final void m35049s(Object obj, long j10, Object obj2) {
        this.f38951a.putObject(obj, j10, obj2);
    }
}
