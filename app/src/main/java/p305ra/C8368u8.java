package p305ra;

import java.util.ListIterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/u8.class
 */
/* renamed from: ra.u8 */
/* loaded from: combined.jar:classes2.jar:ra/u8.class */
public final class C8368u8 implements ListIterator<String> {

    /* renamed from: b */
    public final ListIterator<String> f39320b;

    /* renamed from: c */
    public final int f39321c;

    /* renamed from: d */
    public final C8398w8 f39322d;

    public C8368u8(C8398w8 c8398w8, int i10) {
        InterfaceC8067a7 interfaceC8067a7;
        this.f39322d = c8398w8;
        this.f39321c = i10;
        interfaceC8067a7 = c8398w8.f39364b;
        this.f39320b = interfaceC8067a7.listIterator(i10);
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f39320b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f39320b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return this.f39320b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f39320b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ String previous() {
        return this.f39320b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f39320b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
