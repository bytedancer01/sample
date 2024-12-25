package p305ra;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/c9.class
 */
/* renamed from: ra.c9 */
/* loaded from: combined.jar:classes2.jar:ra/c9.class */
public final class C8099c9 {

    /* renamed from: a */
    public static final Unsafe f38969a;

    /* renamed from: b */
    public static final Class<?> f38970b;

    /* renamed from: c */
    public static final boolean f38971c;

    /* renamed from: d */
    public static final boolean f38972d;

    /* renamed from: e */
    public static final AbstractC8084b9 f38973e;

    /* renamed from: f */
    public static final boolean f38974f;

    /* renamed from: g */
    public static final boolean f38975g;

    /* renamed from: h */
    public static final long f38976h;

    /* renamed from: i */
    public static final boolean f38977i;

    static {
        Unsafe m35106C = m35106C();
        f38969a = m35106C;
        f38970b = C8379v4.m35963b();
        boolean m35119e = m35119e(Long.TYPE);
        f38971c = m35119e;
        boolean m35119e2 = m35119e(Integer.TYPE);
        f38972d = m35119e2;
        AbstractC8084b9 abstractC8084b9 = null;
        if (m35106C != null) {
            if (!C8379v4.m35962a()) {
                abstractC8084b9 = new C8069a9(m35106C);
            } else if (m35119e) {
                abstractC8084b9 = new C8443z8(m35106C);
            } else if (m35119e2) {
                abstractC8084b9 = new C8428y8(m35106C);
            }
        }
        f38973e = abstractC8084b9;
        f38974f = abstractC8084b9 == null ? false : abstractC8084b9.mo35016j();
        f38975g = abstractC8084b9 == null ? false : abstractC8084b9.mo35015i();
        f38976h = m35117c(byte[].class);
        m35117c(boolean[].class);
        m35118d(boolean[].class);
        m35117c(int[].class);
        m35118d(int[].class);
        m35117c(long[].class);
        m35118d(long[].class);
        m35117c(float[].class);
        m35118d(float[].class);
        m35117c(double[].class);
        m35118d(double[].class);
        m35117c(Object[].class);
        m35118d(Object[].class);
        Field m35120f = m35120f();
        if (m35120f != null && abstractC8084b9 != null) {
            abstractC8084b9.m35041k(m35120f);
        }
        boolean z10 = false;
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z10 = true;
        }
        f38977i = z10;
    }

    /* renamed from: A */
    public static byte m35104A(byte[] bArr, long j10) {
        return f38973e.mo35007a(bArr, f38976h + j10);
    }

    /* renamed from: B */
    public static void m35105B(byte[] bArr, long j10, byte b10) {
        f38973e.mo35008b(bArr, f38976h + j10, b10);
    }

    /* renamed from: C */
    public static Unsafe m35106C() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C8413x8());
        } catch (Throwable th2) {
            unsafe = null;
        }
        return unsafe;
    }

    /* renamed from: D */
    public static /* synthetic */ void m35107D(Throwable th2) {
        Logger logger = Logger.getLogger(C8099c9.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th2);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 71);
        sb2.append("platform method missing - proto runtime falling back to safer methods: ");
        sb2.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb2.toString());
    }

    /* renamed from: J */
    public static /* synthetic */ boolean m35113J(Object obj, long j10) {
        return m35122h(obj, j10) != 0;
    }

    /* renamed from: K */
    public static /* synthetic */ boolean m35114K(Object obj, long j10) {
        return m35123i(obj, j10) != 0;
    }

    /* renamed from: c */
    public static int m35117c(Class<?> cls) {
        if (f38975g) {
            return f38973e.m35042l(cls);
        }
        return -1;
    }

    /* renamed from: d */
    public static int m35118d(Class<?> cls) {
        if (f38975g) {
            return f38973e.m35043m(cls);
        }
        return -1;
    }

    /* renamed from: e */
    public static boolean m35119e(Class<?> cls) {
        if (!C8379v4.m35962a()) {
            return false;
        }
        try {
            Class<?> cls2 = f38970b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    /* renamed from: f */
    public static Field m35120f() {
        Field m35121g;
        if (C8379v4.m35962a() && (m35121g = m35121g(Buffer.class, "effectiveDirectAddress")) != null) {
            return m35121g;
        }
        Field m35121g2 = m35121g(Buffer.class, "address");
        if (m35121g2 == null || m35121g2.getType() != Long.TYPE) {
            return null;
        }
        return m35121g2;
    }

    /* renamed from: g */
    public static Field m35121g(Class<?> cls, String str) {
        Field field;
        try {
            field = cls.getDeclaredField(str);
        } catch (Throwable th2) {
            field = null;
        }
        return field;
    }

    /* renamed from: h */
    public static byte m35122h(Object obj, long j10) {
        return (byte) ((f38973e.m35044n(obj, (-4) & j10) >>> ((int) (((j10 ^ (-1)) & 3) << 3))) & 255);
    }

    /* renamed from: i */
    public static byte m35123i(Object obj, long j10) {
        return (byte) ((f38973e.m35044n(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    /* renamed from: j */
    public static void m35124j(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        AbstractC8084b9 abstractC8084b9 = f38973e;
        int m35044n = abstractC8084b9.m35044n(obj, j11);
        int i10 = ((((int) j10) ^ (-1)) & 3) << 3;
        abstractC8084b9.m35045o(obj, j11, ((255 & b10) << i10) | (m35044n & ((255 << i10) ^ (-1))));
    }

    /* renamed from: k */
    public static void m35125k(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        AbstractC8084b9 abstractC8084b9 = f38973e;
        int m35044n = abstractC8084b9.m35044n(obj, j11);
        int i10 = (((int) j10) & 3) << 3;
        abstractC8084b9.m35045o(obj, j11, ((255 & b10) << i10) | (m35044n & ((255 << i10) ^ (-1))));
    }

    /* renamed from: l */
    public static boolean m35126l() {
        return f38975g;
    }

    /* renamed from: m */
    public static boolean m35127m() {
        return f38974f;
    }

    /* renamed from: n */
    public static <T> T m35128n(Class<T> cls) {
        try {
            return (T) f38969a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* renamed from: o */
    public static int m35129o(Object obj, long j10) {
        return f38973e.m35044n(obj, j10);
    }

    /* renamed from: p */
    public static void m35130p(Object obj, long j10, int i10) {
        f38973e.m35045o(obj, j10, i10);
    }

    /* renamed from: q */
    public static long m35131q(Object obj, long j10) {
        return f38973e.m35046p(obj, j10);
    }

    /* renamed from: r */
    public static void m35132r(Object obj, long j10, long j11) {
        f38973e.m35047q(obj, j10, j11);
    }

    /* renamed from: s */
    public static boolean m35133s(Object obj, long j10) {
        return f38973e.mo35009c(obj, j10);
    }

    /* renamed from: t */
    public static void m35134t(Object obj, long j10, boolean z10) {
        f38973e.mo35010d(obj, j10, z10);
    }

    /* renamed from: u */
    public static float m35135u(Object obj, long j10) {
        return f38973e.mo35011e(obj, j10);
    }

    /* renamed from: v */
    public static void m35136v(Object obj, long j10, float f10) {
        f38973e.mo35012f(obj, j10, f10);
    }

    /* renamed from: w */
    public static double m35137w(Object obj, long j10) {
        return f38973e.mo35013g(obj, j10);
    }

    /* renamed from: x */
    public static void m35138x(Object obj, long j10, double d10) {
        f38973e.mo35014h(obj, j10, d10);
    }

    /* renamed from: y */
    public static Object m35139y(Object obj, long j10) {
        return f38973e.m35048r(obj, j10);
    }

    /* renamed from: z */
    public static void m35140z(Object obj, long j10, Object obj2) {
        f38973e.m35049s(obj, j10, obj2);
    }
}
