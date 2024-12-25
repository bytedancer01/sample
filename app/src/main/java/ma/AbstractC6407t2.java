package ma;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/t2.class
 */
/* renamed from: ma.t2 */
/* loaded from: combined.jar:classes2.jar:ma/t2.class */
public abstract class AbstractC6407t2 implements Map, Serializable {

    /* renamed from: b */
    public transient AbstractC6428u2 f34059b;

    /* renamed from: c */
    public transient AbstractC6428u2 f34060c;

    /* renamed from: d */
    public transient AbstractC6260m2 f34061d;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static AbstractC6407t2 m30033d(Iterable iterable) {
        C6386s2 c6386s2 = new C6386s2(iterable instanceof Collection ? iterable.size() : 4);
        c6386s2.m30000a(iterable);
        C6365r2 c6365r2 = c6386s2.f34009c;
        if (c6365r2 != null) {
            throw c6365r2.m29994a();
        }
        C6051c3 m29483i = C6051c3.m29483i(c6386s2.f34008b, c6386s2.f34007a, c6386s2);
        C6365r2 c6365r22 = c6386s2.f34009c;
        if (c6365r22 == null) {
            return m29483i;
        }
        throw c6365r22.m29994a();
    }

    /* renamed from: e */
    public static AbstractC6407t2 m30034e() {
        return C6051c3.f33697h;
    }

    /* renamed from: b */
    public abstract AbstractC6260m2 mo29484b();

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC6260m2 values() {
        AbstractC6260m2 abstractC6260m2 = this.f34061d;
        AbstractC6260m2 abstractC6260m22 = abstractC6260m2;
        if (abstractC6260m2 == null) {
            abstractC6260m22 = mo29484b();
            this.f34061d = abstractC6260m22;
        }
        return abstractC6260m22;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            z10 = true;
        } else {
            if (obj instanceof Map) {
                return entrySet().equals(((Map) obj).entrySet());
            }
            z10 = false;
        }
        return z10;
    }

    /* renamed from: f */
    public abstract AbstractC6428u2 mo29485f();

    /* renamed from: g */
    public abstract AbstractC6428u2 mo29486g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final AbstractC6428u2 entrySet() {
        AbstractC6428u2 abstractC6428u2 = this.f34059b;
        AbstractC6428u2 abstractC6428u22 = abstractC6428u2;
        if (abstractC6428u2 == null) {
            abstractC6428u22 = mo29485f();
            this.f34059b = abstractC6428u22;
        }
        return abstractC6428u22;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C6093e3.m29562a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC6428u2 abstractC6428u2 = this.f34060c;
        AbstractC6428u2 abstractC6428u22 = abstractC6428u2;
        if (abstractC6428u2 == null) {
            abstractC6428u22 = mo29486g();
            this.f34060c = abstractC6428u22;
        }
        return abstractC6428u22;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        Iterator it = entrySet().iterator();
        boolean z10 = true;
        while (true) {
            boolean z11 = z10;
            if (!it.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
    }
}
