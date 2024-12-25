package ma;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/f3.class
 */
/* renamed from: ma.f3 */
/* loaded from: combined.jar:classes2.jar:ma/f3.class */
public final class C6114f3 extends AbstractC6428u2 {

    /* renamed from: d */
    public final transient Object f33761d;

    public C6114f3(Object obj) {
        obj.getClass();
        this.f33761d = obj;
    }

    @Override // ma.AbstractC6260m2
    /* renamed from: a */
    public final int mo29380a(Object[] objArr, int i10) {
        objArr[0] = this.f33761d;
        return 1;
    }

    @Override // ma.AbstractC6260m2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f33761d.equals(obj);
    }

    @Override // ma.AbstractC6428u2, ma.AbstractC6260m2
    /* renamed from: g */
    public final AbstractC6344q2 mo29381g() {
        Object obj = this.f33761d;
        AbstractC6156h3 abstractC6156h3 = AbstractC6344q2.f33979c;
        Object[] objArr = {obj};
        C6468w2.m30085b(objArr, 1);
        return AbstractC6344q2.m29975t(objArr, 1);
    }

    @Override // ma.AbstractC6428u2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f33761d.hashCode();
    }

    @Override // ma.AbstractC6428u2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C6448v2(this.f33761d);
    }

    @Override // ma.AbstractC6428u2
    /* renamed from: q */
    public final AbstractC6135g3 iterator() {
        return new C6448v2(this.f33761d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f33761d.toString() + "]";
    }
}
