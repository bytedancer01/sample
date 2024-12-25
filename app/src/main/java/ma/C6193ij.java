package ma;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ij.class
 */
/* renamed from: ma.ij */
/* loaded from: combined.jar:classes2.jar:ma/ij.class */
public final class C6193ij {

    /* renamed from: a */
    public static final Unsafe f33829a;

    /* renamed from: b */
    public static final Class f33830b;

    /* renamed from: c */
    public static final boolean f33831c;

    /* renamed from: d */
    public static final AbstractC6172hj f33832d;

    /* renamed from: e */
    public static final boolean f33833e;

    /* renamed from: f */
    public static final boolean f33834f;

    /* renamed from: g */
    public static final long f33835g;

    /* renamed from: h */
    public static final boolean f33836h;

    /* JADX WARN: Removed duplicated region for block: B:17:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    static {
        /*
            Method dump skipped, instructions count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.C6193ij.m44909clinit():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public static boolean m29734A(Class cls) {
        int i10 = C6168hf.f33799a;
        try {
            Class cls2 = f33830b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable th2) {
            return false;
        }
    }

    /* renamed from: B */
    public static boolean m29735B(Object obj, long j10) {
        return f33832d.mo29580g(obj, j10);
    }

    /* renamed from: C */
    public static boolean m29736C() {
        return f33834f;
    }

    /* renamed from: D */
    public static boolean m29737D() {
        return f33833e;
    }

    /* renamed from: E */
    public static int m29738E(Class cls) {
        if (f33834f) {
            return f33832d.f33800a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: a */
    public static int m29739a(Class cls) {
        if (f33834f) {
            return f33832d.f33800a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static Field m29740b() {
        int i10 = C6168hf.f33799a;
        Field m29741c = m29741c(Buffer.class, "effectiveDirectAddress");
        Field field = m29741c;
        if (m29741c == null) {
            Field m29741c2 = m29741c(Buffer.class, "address");
            if (m29741c2 != null && m29741c2.getType() == Long.TYPE) {
                return m29741c2;
            }
            field = null;
        }
        return field;
    }

    /* renamed from: c */
    public static Field m29741c(Class cls, String str) {
        Field field;
        try {
            field = cls.getDeclaredField(str);
        } catch (Throwable th2) {
            field = null;
        }
        return field;
    }

    /* renamed from: d */
    public static void m29742d(Object obj, long j10, byte b10) {
        AbstractC6172hj abstractC6172hj = f33832d;
        Unsafe unsafe = abstractC6172hj.f33800a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = ((((int) j10) ^ (-1)) & 3) << 3;
        abstractC6172hj.f33800a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & ((255 << i11) ^ (-1))));
    }

    /* renamed from: e */
    public static void m29743e(Object obj, long j10, byte b10) {
        AbstractC6172hj abstractC6172hj = f33832d;
        Unsafe unsafe = abstractC6172hj.f33800a;
        long j11 = (-4) & j10;
        int i10 = unsafe.getInt(obj, j11);
        int i11 = (((int) j10) & 3) << 3;
        abstractC6172hj.f33800a.putInt(obj, j11, ((255 & b10) << i11) | (i10 & ((255 << i11) ^ (-1))));
    }

    /* renamed from: f */
    public static double m29744f(Object obj, long j10) {
        return f33832d.mo29574a(obj, j10);
    }

    /* renamed from: g */
    public static float m29745g(Object obj, long j10) {
        return f33832d.mo29575b(obj, j10);
    }

    /* renamed from: h */
    public static int m29746h(Object obj, long j10) {
        return f33832d.f33800a.getInt(obj, j10);
    }

    /* renamed from: i */
    public static long m29747i(Object obj, long j10) {
        return f33832d.f33800a.getLong(obj, j10);
    }

    /* renamed from: j */
    public static Object m29748j(Class cls) {
        try {
            return f33829a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: k */
    public static Object m29749k(Object obj, long j10) {
        return f33832d.f33800a.getObject(obj, j10);
    }

    /* renamed from: l */
    public static Unsafe m29750l() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C6088dj());
        } catch (Throwable th2) {
            unsafe = null;
        }
        return unsafe;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m29751m(Throwable th2) {
        Logger.getLogger(C6193ij.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
    }

    /* renamed from: r */
    public static void m29756r(Object obj, long j10, boolean z10) {
        f33832d.mo29576c(obj, j10, z10);
    }

    /* renamed from: s */
    public static void m29757s(byte[] bArr, long j10, byte b10) {
        f33832d.mo29577d(bArr, f33835g + j10, b10);
    }

    /* renamed from: t */
    public static void m29758t(Object obj, long j10, double d10) {
        f33832d.mo29578e(obj, j10, d10);
    }

    /* renamed from: u */
    public static void m29759u(Object obj, long j10, float f10) {
        f33832d.mo29579f(obj, j10, f10);
    }

    /* renamed from: v */
    public static void m29760v(Object obj, long j10, int i10) {
        f33832d.f33800a.putInt(obj, j10, i10);
    }

    /* renamed from: w */
    public static void m29761w(Object obj, long j10, long j11) {
        f33832d.f33800a.putLong(obj, j10, j11);
    }

    /* renamed from: x */
    public static void m29762x(Object obj, long j10, Object obj2) {
        f33832d.f33800a.putObject(obj, j10, obj2);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m29763y(Object obj, long j10) {
        return ((byte) ((f33832d.f33800a.getInt(obj, (-4) & j10) >>> ((int) (((j10 ^ (-1)) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ boolean m29764z(Object obj, long j10) {
        return ((byte) ((f33832d.f33800a.getInt(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255)) != 0;
    }
}
