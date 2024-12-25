package ma;

import java.util.Iterator;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/bj.class
 */
/* renamed from: ma.bj */
/* loaded from: combined.jar:classes2.jar:ma/bj.class */
public final class C6046bj implements Iterator {

    /* renamed from: b */
    public final Iterator f33691b;

    /* renamed from: c */
    public final C6067cj f33692c;

    public C6046bj(C6067cj c6067cj) {
        InterfaceC6044bh interfaceC6044bh;
        this.f33692c = c6067cj;
        interfaceC6044bh = c6067cj.f33716b;
        this.f33691b = interfaceC6044bh.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33691b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f33691b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
