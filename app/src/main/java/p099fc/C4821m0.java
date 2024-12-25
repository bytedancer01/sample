package p099fc;

import ec.C4708k;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/m0.class
 */
/* renamed from: fc.m0 */
/* loaded from: combined.jar:classes2.jar:fc/m0.class */
public class C4821m0<E> extends AbstractC4834t<E> {

    /* renamed from: f */
    public static final AbstractC4834t<Object> f28342f = new C4821m0(new Object[0], 0);

    /* renamed from: d */
    public final transient Object[] f28343d;

    /* renamed from: e */
    public final transient int f28344e;

    public C4821m0(Object[] objArr, int i10) {
        this.f28343d = objArr;
        this.f28344e = i10;
    }

    @Override // p099fc.AbstractC4834t, p099fc.AbstractC4830r
    /* renamed from: e */
    public int mo24451e(Object[] objArr, int i10) {
        System.arraycopy(this.f28343d, 0, objArr, i10, this.f28344e);
        return i10 + this.f28344e;
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: f */
    public Object[] mo24452f() {
        return this.f28343d;
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: g */
    public int mo24453g() {
        return this.f28344e;
    }

    @Override // java.util.List
    public E get(int i10) {
        C4708k.m23666h(i10, this.f28344e);
        return (E) this.f28343d[i10];
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: i */
    public int mo24454i() {
        return 0;
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: q */
    public boolean mo24455q() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f28344e;
    }
}
