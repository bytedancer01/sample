package p073e4;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p416y3.InterfaceC9817c;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:e4/c.class
 */
/* renamed from: e4.c */
/* loaded from: combined.jar:classes1.jar:e4/c.class */
public class C4608c {

    /* renamed from: d */
    public static final InterfaceC4617l f27282d = new a();

    /* renamed from: a */
    public final Map<Class, Map<Class, InterfaceC4618m>> f27283a = new HashMap();

    /* renamed from: b */
    public final Map<Class, Map<Class, InterfaceC4617l>> f27284b = new HashMap();

    /* renamed from: c */
    public final Context f27285c;

    /* JADX WARN: Classes with same name are omitted:
      classes1.jar:e4/c$a.class
     */
    /* renamed from: e4.c$a */
    /* loaded from: combined.jar:classes1.jar:e4/c$a.class */
    public static final class a implements InterfaceC4617l {
        @Override // p073e4.InterfaceC4617l
        /* renamed from: a */
        public InterfaceC9817c mo23227a(Object obj, int i10, int i11) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public C4608c(Context context) {
        this.f27285c = context.getApplicationContext();
    }

    /* renamed from: a */
    public <T, Y> InterfaceC4617l<T, Y> m23229a(Class<T> cls, Class<Y> cls2) {
        InterfaceC4617l<T, Y> interfaceC4617l;
        synchronized (this) {
            InterfaceC4617l<T, Y> m23232d = m23232d(cls, cls2);
            if (m23232d != null) {
                if (f27282d.equals(m23232d)) {
                    return null;
                }
                return m23232d;
            }
            InterfaceC4618m<T, Y> m23233e = m23233e(cls, cls2);
            if (m23233e != null) {
                InterfaceC4617l<T, Y> mo23257b = m23233e.mo23257b(this.f27285c, this);
                m23230b(cls, cls2, mo23257b);
                interfaceC4617l = mo23257b;
            } else {
                m23231c(cls, cls2);
                interfaceC4617l = m23232d;
            }
            return interfaceC4617l;
        }
    }

    /* renamed from: b */
    public final <T, Y> void m23230b(Class<T> cls, Class<Y> cls2, InterfaceC4617l<T, Y> interfaceC4617l) {
        Map<Class, InterfaceC4617l> map = this.f27284b.get(cls);
        Map<Class, InterfaceC4617l> map2 = map;
        if (map == null) {
            map2 = new HashMap();
            this.f27284b.put(cls, map2);
        }
        map2.put(cls2, interfaceC4617l);
    }

    /* renamed from: c */
    public final <T, Y> void m23231c(Class<T> cls, Class<Y> cls2) {
        m23230b(cls, cls2, f27282d);
    }

    /* renamed from: d */
    public final <T, Y> InterfaceC4617l<T, Y> m23232d(Class<T> cls, Class<Y> cls2) {
        Map<Class, InterfaceC4617l> map = this.f27284b.get(cls);
        return map != null ? map.get(cls2) : null;
    }

    /* renamed from: e */
    public final <T, Y> InterfaceC4618m<T, Y> m23233e(Class<T> cls, Class<Y> cls2) {
        Map<Class, InterfaceC4618m> map;
        Map<Class, InterfaceC4618m> map2 = this.f27283a.get(cls);
        InterfaceC4618m<T, Y> interfaceC4618m = map2 != null ? map2.get(cls2) : null;
        InterfaceC4618m<T, Y> interfaceC4618m2 = interfaceC4618m;
        if (interfaceC4618m == null) {
            Iterator<Class> it = this.f27283a.keySet().iterator();
            while (true) {
                interfaceC4618m2 = interfaceC4618m;
                if (!it.hasNext()) {
                    break;
                }
                Class next = it.next();
                if (next.isAssignableFrom(cls) && (map = this.f27283a.get(next)) != null) {
                    interfaceC4618m2 = map.get(cls2);
                    interfaceC4618m = interfaceC4618m2;
                    if (interfaceC4618m2 != null) {
                        break;
                    }
                }
            }
        }
        return interfaceC4618m2;
    }

    /* renamed from: f */
    public <T, Y> InterfaceC4618m<T, Y> m23234f(Class<T> cls, Class<Y> cls2, InterfaceC4618m<T, Y> interfaceC4618m) {
        InterfaceC4618m<T, Y> interfaceC4618m2;
        synchronized (this) {
            this.f27284b.clear();
            Map<Class, InterfaceC4618m> map = this.f27283a.get(cls);
            Map<Class, InterfaceC4618m> map2 = map;
            if (map == null) {
                map2 = new HashMap<>();
                this.f27283a.put(cls, map2);
            }
            InterfaceC4618m<T, Y> put = map2.put(cls2, interfaceC4618m);
            interfaceC4618m2 = put;
            if (put != null) {
                Iterator<Map<Class, InterfaceC4618m>> it = this.f27283a.values().iterator();
                while (true) {
                    interfaceC4618m2 = put;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().containsValue(put)) {
                        interfaceC4618m2 = null;
                        break;
                    }
                }
            }
        }
        return interfaceC4618m2;
    }
}
