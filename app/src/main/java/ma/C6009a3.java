package ma;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/a3.class
 */
/* renamed from: ma.a3 */
/* loaded from: combined.jar:classes2.jar:ma/a3.class */
public final class C6009a3 extends AbstractC6428u2 {

    /* renamed from: d */
    public final transient AbstractC6407t2 f33647d;

    /* renamed from: e */
    public final transient AbstractC6344q2 f33648e;

    public C6009a3(AbstractC6407t2 abstractC6407t2, AbstractC6344q2 abstractC6344q2) {
        this.f33647d = abstractC6407t2;
        this.f33648e = abstractC6344q2;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: a */
    public final int mo29380a(Object[] objArr, int i10) {
        return this.f33648e.mo29380a(objArr, 0);
    }

    @Override // ma.AbstractC6260m2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f33647d.get(obj) != null;
    }

    @Override // ma.AbstractC6428u2, ma.AbstractC6260m2
    /* renamed from: g */
    public final AbstractC6344q2 mo29381g() {
        return this.f33648e;
    }

    @Override // ma.AbstractC6428u2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f33648e.listIterator(0);
    }

    @Override // ma.AbstractC6428u2
    /* renamed from: q */
    public final AbstractC6135g3 iterator() {
        return this.f33648e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33647d.size();
    }
}
