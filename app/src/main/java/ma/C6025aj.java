package ma;

import java.util.ListIterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/aj.class
 */
/* renamed from: ma.aj */
/* loaded from: combined.jar:classes2.jar:ma/aj.class */
public final class C6025aj implements ListIterator {

    /* renamed from: b */
    public final ListIterator f33669b;

    /* renamed from: c */
    public final int f33670c;

    /* renamed from: d */
    public final C6067cj f33671d;

    public C6025aj(C6067cj c6067cj, int i10) {
        InterfaceC6044bh interfaceC6044bh;
        this.f33671d = c6067cj;
        this.f33670c = i10;
        interfaceC6044bh = c6067cj.f33716b;
        this.f33669b = interfaceC6044bh.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f33669b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33669b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f33669b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33669b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f33669b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33669b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
