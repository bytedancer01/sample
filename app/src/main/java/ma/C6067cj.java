package ma;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/cj.class
 */
@Deprecated
/* renamed from: ma.cj */
/* loaded from: combined.jar:classes2.jar:ma/cj.class */
public final class C6067cj extends AbstractList implements RandomAccess, InterfaceC6044bh {

    /* renamed from: b */
    public final InterfaceC6044bh f33716b;

    public C6067cj(InterfaceC6044bh interfaceC6044bh) {
        this.f33716b = interfaceC6044bh;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((C6023ah) this.f33716b).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C6046bj(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new C6025aj(this, i10);
    }

    @Override // ma.InterfaceC6044bh
    /* renamed from: n */
    public final Object mo29430n(int i10) {
        return this.f33716b.mo29430n(i10);
    }

    @Override // ma.InterfaceC6044bh
    /* renamed from: o */
    public final InterfaceC6044bh mo29431o() {
        return this;
    }

    @Override // ma.InterfaceC6044bh
    /* renamed from: p */
    public final List mo29432p() {
        return this.f33716b.mo29432p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33716b.size();
    }
}
