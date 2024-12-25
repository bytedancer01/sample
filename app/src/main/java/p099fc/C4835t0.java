package p099fc;

import ec.C4708k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/t0.class
 */
/* renamed from: fc.t0 */
/* loaded from: combined.jar:classes2.jar:fc/t0.class */
public final class C4835t0<E> extends AbstractC4842x<E> {

    /* renamed from: d */
    public final transient E f28420d;

    /* renamed from: e */
    public transient int f28421e;

    public C4835t0(E e10) {
        this.f28420d = (E) C4708k.m23668j(e10);
    }

    public C4835t0(E e10, int i10) {
        this.f28420d = e10;
        this.f28421e = i10;
    }

    @Override // p099fc.AbstractC4842x
    /* renamed from: A */
    public AbstractC4834t<E> mo24477A() {
        return AbstractC4834t.m24540F(this.f28420d);
    }

    @Override // p099fc.AbstractC4842x
    /* renamed from: B */
    public boolean mo24481B() {
        return this.f28421e != 0;
    }

    @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f28420d.equals(obj);
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: e */
    public int mo24451e(Object[] objArr, int i10) {
        objArr[i10] = this.f28420d;
        return i10 + 1;
    }

    @Override // p099fc.AbstractC4842x, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f28421e;
        int i11 = i10;
        if (i10 == 0) {
            i11 = this.f28420d.hashCode();
            this.f28421e = i11;
        }
        return i11;
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: q */
    public boolean mo24455q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // p099fc.AbstractC4842x, p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: t */
    public AbstractC4841w0<E> iterator() {
        return C4845z.m24619l(this.f28420d);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f28420d.toString() + ']';
    }
}
