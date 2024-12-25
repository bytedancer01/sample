package p280q4;

import java.util.HashMap;
import java.util.Map;
import p363v4.C9241g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:q4/c.class
 */
/* renamed from: q4.c */
/* loaded from: combined.jar:classes1.jar:q4/c.class */
public class C7754c {

    /* renamed from: b */
    public static final C9241g f37619b = new C9241g();

    /* renamed from: a */
    public final Map<C9241g, InterfaceC7753b<?, ?>> f37620a = new HashMap();

    /* renamed from: a */
    public <T, Z> InterfaceC7753b<T, Z> m33910a(Class<T> cls, Class<Z> cls2) {
        InterfaceC7753b<?, ?> interfaceC7753b;
        C9241g c9241g = f37619b;
        synchronized (c9241g) {
            c9241g.m38962a(cls, cls2);
            interfaceC7753b = this.f37620a.get(c9241g);
        }
        InterfaceC7753b<?, ?> interfaceC7753b2 = interfaceC7753b;
        if (interfaceC7753b == null) {
            interfaceC7753b2 = C7755d.m33912f();
        }
        return (InterfaceC7753b<T, Z>) interfaceC7753b2;
    }

    /* renamed from: b */
    public <T, Z> void m33911b(Class<T> cls, Class<Z> cls2, InterfaceC7753b<T, Z> interfaceC7753b) {
        this.f37620a.put(new C9241g(cls, cls2), interfaceC7753b);
    }
}
