package ma;

import java.util.Iterator;
import java.util.Map;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/z2.class
 */
/* renamed from: ma.z2 */
/* loaded from: combined.jar:classes2.jar:ma/z2.class */
public final class C6528z2 extends AbstractC6428u2 {

    /* renamed from: d */
    public final transient AbstractC6407t2 f34198d;

    /* renamed from: e */
    public final transient Object[] f34199e;

    /* renamed from: f */
    public final transient int f34200f;

    public C6528z2(AbstractC6407t2 abstractC6407t2, Object[] objArr, int i10, int i11) {
        this.f34198d = abstractC6407t2;
        this.f34199e = objArr;
        this.f34200f = i11;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: a */
    public final int mo29380a(Object[] objArr, int i10) {
        return mo29381g().mo29380a(objArr, 0);
    }

    @Override // ma.AbstractC6260m2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f34198d.get(key));
    }

    @Override // ma.AbstractC6428u2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo29381g().listIterator(0);
    }

    @Override // ma.AbstractC6428u2
    /* renamed from: q */
    public final AbstractC6135g3 iterator() {
        return mo29381g().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34200f;
    }

    @Override // ma.AbstractC6428u2
    /* renamed from: v */
    public final AbstractC6344q2 mo29544v() {
        return new C6508y2(this);
    }
}
