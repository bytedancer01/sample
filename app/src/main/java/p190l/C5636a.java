package p190l;

import java.util.HashMap;
import java.util.Map;
import p190l.C5637b;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:l/a.class
 */
/* renamed from: l.a */
/* loaded from: combined.jar:classes1.jar:l/a.class */
public class C5636a<K, V> extends C5637b<K, V> {

    /* renamed from: f */
    public HashMap<K, C5637b.c<K, V>> f31718f = new HashMap<>();

    public boolean contains(K k10) {
        return this.f31718f.containsKey(k10);
    }

    @Override // p190l.C5637b
    /* renamed from: e */
    public C5637b.c<K, V> mo27807e(K k10) {
        return this.f31718f.get(k10);
    }

    @Override // p190l.C5637b
    /* renamed from: i */
    public V mo27808i(K k10, V v10) {
        C5637b.c<K, V> mo27807e = mo27807e(k10);
        if (mo27807e != null) {
            return mo27807e.f31724c;
        }
        this.f31718f.put(k10, m27814h(k10, v10));
        return null;
    }

    @Override // p190l.C5637b
    /* renamed from: q */
    public V mo27809q(K k10) {
        V v10 = (V) super.mo27809q(k10);
        this.f31718f.remove(k10);
        return v10;
    }

    /* renamed from: t */
    public Map.Entry<K, V> m27810t(K k10) {
        if (contains(k10)) {
            return this.f31718f.get(k10).f31726e;
        }
        return null;
    }
}
