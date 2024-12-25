package p225n4;

import java.util.HashMap;
import java.util.Map;
import p363v4.C9241g;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:n4/d.class
 */
/* renamed from: n4.d */
/* loaded from: combined.jar:classes1.jar:n4/d.class */
public class C6651d {

    /* renamed from: b */
    public static final C9241g f34681b = new C9241g();

    /* renamed from: a */
    public final Map<C9241g, InterfaceC6650c<?, ?>> f34682a = new HashMap();

    /* renamed from: a */
    public <Z, R> InterfaceC6650c<Z, R> m30652a(Class<Z> cls, Class<R> cls2) {
        InterfaceC6650c<Z, R> interfaceC6650c;
        if (cls.equals(cls2)) {
            return C6652e.m30654b();
        }
        C9241g c9241g = f34681b;
        synchronized (c9241g) {
            c9241g.m38962a(cls, cls2);
            interfaceC6650c = (InterfaceC6650c) this.f34682a.get(c9241g);
        }
        if (interfaceC6650c != null) {
            return interfaceC6650c;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }

    /* renamed from: b */
    public <Z, R> void m30653b(Class<Z> cls, Class<R> cls2, InterfaceC6650c<Z, R> interfaceC6650c) {
        this.f34682a.put(new C9241g(cls, cls2), interfaceC6650c);
    }
}
