package p305ra;

import java.util.NoSuchElementException;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ra/a5.class
 */
/* renamed from: ra.a5 */
/* loaded from: combined.jar:classes2.jar:ra/a5.class */
public final class C8065a5 extends AbstractC8095c5 {

    /* renamed from: b */
    public int f38926b = 0;

    /* renamed from: c */
    public final int f38927c;

    /* renamed from: d */
    public final AbstractC8230l5 f38928d;

    public C8065a5(AbstractC8230l5 abstractC8230l5) {
        this.f38928d = abstractC8230l5;
        this.f38927c = abstractC8230l5.mo35264d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f38926b < this.f38927c;
    }

    @Override // p305ra.InterfaceC8155g5
    public final byte zza() {
        int i10 = this.f38926b;
        if (i10 >= this.f38927c) {
            throw new NoSuchElementException();
        }
        this.f38926b = i10 + 1;
        return this.f38928d.mo35263b(i10);
    }
}
