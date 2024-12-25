package ma;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/oh.class
 */
/* renamed from: ma.oh */
/* loaded from: combined.jar:classes2.jar:ma/oh.class */
public final class C6317oh extends LinkedHashMap {

    /* renamed from: c */
    public static final C6317oh f33940c;

    /* renamed from: b */
    public boolean f33941b;

    static {
        C6317oh c6317oh = new C6317oh();
        f33940c = c6317oh;
        c6317oh.f33941b = false;
    }

    public C6317oh() {
        this.f33941b = true;
    }

    public C6317oh(Map map) {
        super(map);
        this.f33941b = true;
    }

    /* renamed from: g */
    public static int m29937g(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC6337pg) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C6482wg.f34130a;
        int length = bArr.length;
        int m30095b = C6482wg.m30095b(length, bArr, 0, length);
        int i10 = m30095b;
        if (m30095b == 0) {
            i10 = 1;
        }
        return i10;
    }

    /* renamed from: b */
    public final C6317oh m29938b() {
        return isEmpty() ? new C6317oh() : new C6317oh(this);
    }

    /* renamed from: c */
    public final void m29939c() {
        this.f33941b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m29942h();
        super.clear();
    }

    /* renamed from: d */
    public final void m29940d(C6317oh c6317oh) {
        m29942h();
        if (c6317oh.isEmpty()) {
            return;
        }
        putAll(c6317oh);
    }

    /* renamed from: e */
    public final boolean m29941e() {
        return this.f33941b;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void m29942h() {
        if (!this.f33941b) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return i11;
            }
            Map.Entry entry = (Map.Entry) it.next();
            i10 = i11 + (m29937g(entry.getValue()) ^ m29937g(entry.getKey()));
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m29942h();
        Charset charset = C6482wg.f34130a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m29942h();
        for (Object obj : map.keySet()) {
            Charset charset = C6482wg.f34130a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m29942h();
        return super.remove(obj);
    }
}
