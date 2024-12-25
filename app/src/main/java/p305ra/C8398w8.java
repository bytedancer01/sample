package p305ra;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/w8.class
 */
/* renamed from: ra.w8 */
/* loaded from: combined.jar:classes2.jar:ra/w8.class */
public final class C8398w8 extends AbstractList<String> implements RandomAccess, InterfaceC8067a7 {

    /* renamed from: b */
    public final InterfaceC8067a7 f39364b;

    public C8398w8(InterfaceC8067a7 interfaceC8067a7) {
        this.f39364b = interfaceC8067a7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((C8441z6) this.f39364b).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C8383v8(this);
    }

    @Override // p305ra.InterfaceC8067a7
    /* renamed from: j */
    public final InterfaceC8067a7 mo34999j() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i10) {
        return new C8368u8(this, i10);
    }

    @Override // p305ra.InterfaceC8067a7
    /* renamed from: m */
    public final Object mo35000m(int i10) {
        return this.f39364b.mo35000m(i10);
    }

    @Override // p305ra.InterfaceC8067a7
    /* renamed from: p */
    public final List<?> mo35001p() {
        return this.f39364b.mo35001p();
    }

    @Override // p305ra.InterfaceC8067a7
    /* renamed from: r */
    public final void mo35002r(AbstractC8230l5 abstractC8230l5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39364b.size();
    }
}
