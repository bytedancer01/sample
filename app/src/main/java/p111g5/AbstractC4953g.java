package p111g5;

import java.io.Serializable;
import p074e5.AbstractC4625b;
import p074e5.EnumC4637n;
import p111g5.AbstractC4953g;
import p180k5.AbstractC5481f;
import p300r5.C7963e;
import p378w4.C9411e;
import p378w4.InterfaceC9409c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:g5/g.class
 */
/* renamed from: g5.g */
/* loaded from: combined.jar:classes1.jar:g5/g.class */
public abstract class AbstractC4953g<T extends AbstractC4953g<T>> implements AbstractC5481f.a, Serializable {

    /* renamed from: d */
    public static final C9411e f28724d = C9411e.m39768a();

    /* renamed from: e */
    public static final InterfaceC9409c.c f28725e = InterfaceC9409c.c.m39767b();

    /* renamed from: b */
    public final int f28726b;

    /* renamed from: c */
    public final C4947a f28727c;

    public AbstractC4953g(C4947a c4947a, int i10) {
        this.f28727c = c4947a;
        this.f28726b = i10;
    }

    public AbstractC4953g(AbstractC4953g<T> abstractC4953g, int i10) {
        this.f28727c = abstractC4953g.f28727c;
        this.f28726b = i10;
    }

    /* renamed from: b */
    public static <F extends Enum<F> & InterfaceC4948b> int m24940b(Class<F> cls) {
        Object[] objArr = (Enum[]) cls.getEnumConstants();
        int length = objArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i10 >= length) {
                return i12;
            }
            InterfaceC4948b interfaceC4948b = (InterfaceC4948b) objArr[i10];
            int i13 = i12;
            if (interfaceC4948b.enabledByDefault()) {
                i13 = i12 | interfaceC4948b.getMask();
            }
            i10++;
            i11 = i13;
        }
    }

    /* renamed from: c */
    public AbstractC4625b mo23268c() {
        return this.f28727c.m24935a();
    }

    /* renamed from: d */
    public final C7963e m24941d() {
        return this.f28727c.m24936b();
    }

    /* renamed from: e */
    public final boolean m24942e() {
        return m24943f(EnumC4637n.USE_ANNOTATIONS);
    }

    /* renamed from: f */
    public final boolean m24943f(EnumC4637n enumC4637n) {
        return (enumC4637n.getMask() & this.f28726b) != 0;
    }
}
