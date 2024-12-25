package p447zg;

import com.sun.jna.FromNativeConverter;
import com.sun.jna.Pointer;
import com.sun.jna.ToNativeConverter;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:zg/r.class
 */
/* renamed from: zg.r */
/* loaded from: combined.jar:classes2.jar:zg/r.class */
public class C10227r implements FromNativeConverter, ToNativeConverter {

    /* renamed from: d */
    public static final Map<Class<?>, Reference<C10227r>> f46810d = new WeakHashMap();

    /* renamed from: a */
    public final Class<?> f46811a;

    /* renamed from: b */
    public final Class<?> f46812b;

    /* renamed from: c */
    public final InterfaceC10226q f46813c;

    public C10227r(Class<?> cls) {
        if (!InterfaceC10226q.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Type must derive from " + InterfaceC10226q.class);
        }
        this.f46811a = cls;
        InterfaceC10226q m42793d = m42793d();
        this.f46813c = m42793d;
        this.f46812b = m42793d.mo42751a();
    }

    /* renamed from: e */
    public static C10227r m42792e(Class<?> cls) {
        C10227r c10227r;
        Map<Class<?>, Reference<C10227r>> map = f46810d;
        synchronized (map) {
            Reference<C10227r> reference = map.get(cls);
            C10227r c10227r2 = reference != null ? reference.get() : null;
            c10227r = c10227r2;
            if (c10227r2 == null) {
                c10227r = new C10227r(cls);
                map.put(cls, new SoftReference(c10227r));
            }
        }
        return c10227r;
    }

    @Override // com.sun.jna.FromNativeConverter, com.sun.jna.ToNativeConverter
    /* renamed from: a */
    public Class<?> mo21328a() {
        return this.f46812b;
    }

    @Override // com.sun.jna.FromNativeConverter
    /* renamed from: b */
    public Object mo21329b(Object obj, C10213d c10213d) {
        return this.f46813c.mo42752b(obj, c10213d);
    }

    @Override // com.sun.jna.ToNativeConverter
    /* renamed from: c */
    public Object mo21441c(Object obj, C10233x c10233x) {
        Object obj2 = obj;
        if (obj == null) {
            if (Pointer.class.isAssignableFrom(this.f46812b)) {
                return null;
            }
            obj2 = m42793d();
        }
        return ((InterfaceC10226q) obj2).mo42753c();
    }

    /* renamed from: d */
    public InterfaceC10226q m42793d() {
        return (InterfaceC10226q) (this.f46811a.isEnum() ? this.f46811a.getEnumConstants()[0] : AbstractC10220k.m42756a(this.f46811a));
    }
}
