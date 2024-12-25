package ma;

import com.journeyapps.barcodescanner.C2582b;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/ae.class
 */
/* renamed from: ma.ae */
/* loaded from: combined.jar:classes2.jar:ma/ae.class */
public final class C6020ae extends AbstractC6376rd {

    /* renamed from: a */
    public static final Unsafe f33653a;

    /* renamed from: b */
    public static final long f33654b;

    /* renamed from: c */
    public static final long f33655c;

    /* renamed from: d */
    public static final long f33656d;

    /* renamed from: e */
    public static final long f33657e;

    /* renamed from: f */
    public static final long f33658f;

    /* JADX WARN: Classes with same name are omitted:
      classes2.jar:ma/ae$a.class
     */
    /* renamed from: ma.ae$a */
    /* loaded from: combined.jar:classes2.jar:ma/ae$a.class */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e10) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        }
        try {
            f33655c = unsafe.objectFieldOffset(AbstractC6062ce.class.getDeclaredField("d"));
            f33654b = unsafe.objectFieldOffset(AbstractC6062ce.class.getDeclaredField("c"));
            f33656d = unsafe.objectFieldOffset(AbstractC6062ce.class.getDeclaredField(C2582b.f15902o));
            f33657e = unsafe.objectFieldOffset(C6041be.class.getDeclaredField("a"));
            f33658f = unsafe.objectFieldOffset(C6041be.class.getDeclaredField(C2582b.f15902o));
            f33653a = unsafe;
        } catch (NoSuchFieldException e12) {
            throw new RuntimeException(e12);
        } catch (RuntimeException e13) {
            throw e13;
        }
    }

    public /* synthetic */ C6020ae(C6167he c6167he) {
        super(null);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: a */
    public final C6439ud mo29388a(AbstractC6062ce abstractC6062ce, C6439ud c6439ud) {
        C6439ud c6439ud2;
        do {
            c6439ud2 = abstractC6062ce.f33709c;
            if (c6439ud == c6439ud2) {
                return c6439ud2;
            }
        } while (!mo29392e(abstractC6062ce, c6439ud2, c6439ud));
        return c6439ud2;
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: b */
    public final C6041be mo29389b(AbstractC6062ce abstractC6062ce, C6041be c6041be) {
        C6041be c6041be2;
        do {
            c6041be2 = abstractC6062ce.f33710d;
            if (c6041be == c6041be2) {
                return c6041be2;
            }
        } while (!mo29394g(abstractC6062ce, c6041be2, c6041be));
        return c6041be2;
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: c */
    public final void mo29390c(C6041be c6041be, C6041be c6041be2) {
        f33653a.putObject(c6041be, f33658f, c6041be2);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: d */
    public final void mo29391d(C6041be c6041be, Thread thread) {
        f33653a.putObject(c6041be, f33657e, thread);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: e */
    public final boolean mo29392e(AbstractC6062ce abstractC6062ce, C6439ud c6439ud, C6439ud c6439ud2) {
        return C6146ge.m29638a(f33653a, abstractC6062ce, f33654b, c6439ud, c6439ud2);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: f */
    public final boolean mo29393f(AbstractC6062ce abstractC6062ce, Object obj, Object obj2) {
        return C6146ge.m29638a(f33653a, abstractC6062ce, f33656d, obj, obj2);
    }

    @Override // ma.AbstractC6376rd
    /* renamed from: g */
    public final boolean mo29394g(AbstractC6062ce abstractC6062ce, C6041be c6041be, C6041be c6041be2) {
        return C6146ge.m29638a(f33653a, abstractC6062ce, f33655c, c6041be, c6041be2);
    }
}
