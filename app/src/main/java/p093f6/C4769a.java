package p093f6;

import p075e6.InterfaceC4645a;
import p153ih.InterfaceC5261a;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:f6/a.class
 */
/* renamed from: f6.a */
/* loaded from: combined.jar:classes1.jar:f6/a.class */
public final class C4769a<T> implements InterfaceC5261a<T>, InterfaceC4645a<T> {

    /* renamed from: c */
    public static final Object f28115c = new Object();

    /* renamed from: a */
    public volatile InterfaceC5261a<T> f28116a;

    /* renamed from: b */
    public volatile Object f28117b = f28115c;

    public C4769a(InterfaceC5261a<T> interfaceC5261a) {
        this.f28116a = interfaceC5261a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC5261a<T>, T> InterfaceC4645a<T> m24159a(P p10) {
        return p10 instanceof InterfaceC4645a ? (InterfaceC4645a) p10 : new C4769a((InterfaceC5261a) C4772d.m24164b(p10));
    }

    /* renamed from: b */
    public static <P extends InterfaceC5261a<T>, T> InterfaceC5261a<T> m24160b(P p10) {
        C4772d.m24164b(p10);
        return p10 instanceof C4769a ? p10 : new C4769a(p10);
    }

    /* renamed from: c */
    public static Object m24161c(Object obj, Object obj2) {
        if (!(obj != f28115c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p153ih.InterfaceC5261a
    public T get() {
        Object obj = this.f28117b;
        Object obj2 = f28115c;
        Object obj3 = obj;
        if (obj == obj2) {
            synchronized (this) {
                Object obj4 = this.f28117b;
                obj3 = obj4;
                if (obj4 == obj2) {
                    obj3 = this.f28116a.get();
                    this.f28117b = m24161c(this.f28117b, obj3);
                    this.f28116a = null;
                }
            }
        }
        return (T) obj3;
    }
}
