package ua;

import java.util.List;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ua/l3.class
 */
/* renamed from: ua.l3 */
/* loaded from: combined.jar:classes2.jar:ua/l3.class */
public final class C8976l3<V> {

    /* renamed from: h */
    public static final Object f41278h = new Object();

    /* renamed from: a */
    public final String f41279a;

    /* renamed from: b */
    public final InterfaceC8952j3<V> f41280b;

    /* renamed from: c */
    public final V f41281c;

    /* renamed from: d */
    public final V f41282d;

    /* renamed from: e */
    public final Object f41283e = new Object();

    /* renamed from: f */
    public volatile V f41284f = null;

    /* renamed from: g */
    public volatile V f41285g = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C8976l3(String str, Object obj, Object obj2, InterfaceC8952j3 interfaceC8952j3, C8940i3 c8940i3) {
        this.f41279a = str;
        this.f41281c = obj;
        this.f41282d = obj2;
        this.f41280b = interfaceC8952j3;
    }

    /* renamed from: a */
    public final String m38107a() {
        return this.f41279a;
    }

    /* renamed from: b */
    public final V m38108b(V v10) {
        List<C8976l3> list;
        V v11;
        synchronized (this.f41283e) {
        }
        if (v10 != null) {
            return v10;
        }
        if (C8964k3.f41253a == null) {
            return this.f41281c;
        }
        synchronized (f41278h) {
            if (C9079ta.m38242a()) {
                return this.f41285g == null ? this.f41281c : this.f41285g;
            }
            try {
                list = C8988m3.f41351a;
                for (C8976l3 c8976l3 : list) {
                    if (C9079ta.m38242a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    try {
                        InterfaceC8952j3<V> interfaceC8952j3 = c8976l3.f41280b;
                        v11 = null;
                        if (interfaceC8952j3 != null) {
                            v11 = interfaceC8952j3.zza();
                        }
                    } catch (IllegalStateException e10) {
                        v11 = null;
                    }
                    synchronized (f41278h) {
                        c8976l3.f41285g = v11;
                    }
                }
            } catch (SecurityException e11) {
            }
            InterfaceC8952j3<V> interfaceC8952j32 = this.f41280b;
            if (interfaceC8952j32 == null) {
                return this.f41281c;
            }
            try {
                return interfaceC8952j32.zza();
            } catch (IllegalStateException e12) {
                return this.f41281c;
            } catch (SecurityException e13) {
                return this.f41281c;
            }
        }
    }
}
