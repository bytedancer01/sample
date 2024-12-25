package ma;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:ma/di.class
 */
/* renamed from: ma.di */
/* loaded from: combined.jar:classes2.jar:ma/di.class */
public final class C6087di extends AbstractC6147gf implements RandomAccess {

    /* renamed from: e */
    public static final C6087di f33739e = new C6087di(new Object[0], 0, false);

    /* renamed from: c */
    public Object[] f33740c;

    /* renamed from: d */
    public int f33741d;

    public C6087di(Object[] objArr, int i10, boolean z10) {
        super(z10);
        this.f33740c = objArr;
        this.f33741d = i10;
    }

    /* renamed from: f */
    public static C6087di m29555f() {
        return f33739e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        m29639d();
        if (i10 < 0 || i10 > (i11 = this.f33741d)) {
            throw new IndexOutOfBoundsException(m29556g(i10));
        }
        Object[] objArr = this.f33740c;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f33740c, i10, objArr2, i10 + 1, this.f33741d - i10);
            this.f33740c = objArr2;
        }
        this.f33740c[i10] = obj;
        this.f33741d++;
        ((AbstractList) this).modCount++;
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m29639d();
        int i10 = this.f33741d;
        Object[] objArr = this.f33740c;
        if (i10 == objArr.length) {
            this.f33740c = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f33740c;
        int i11 = this.f33741d;
        this.f33741d = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: g */
    public final String m29556g(int i10) {
        return "Index:" + i10 + ", Size:" + this.f33741d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        m29557h(i10);
        return this.f33740c[i10];
    }

    /* renamed from: h */
    public final void m29557h(int i10) {
        if (i10 < 0 || i10 >= this.f33741d) {
            throw new IndexOutOfBoundsException(m29556g(i10));
        }
    }

    @Override // ma.InterfaceC6462vg
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ InterfaceC6462vg mo29429m(int i10) {
        if (i10 >= this.f33741d) {
            return new C6087di(Arrays.copyOf(this.f33740c, i10), this.f33741d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // ma.AbstractC6147gf, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        m29639d();
        m29557h(i10);
        Object[] objArr = this.f33740c;
        Object obj = objArr[i10];
        int i11 = this.f33741d;
        if (i10 < i11 - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (i11 - i10) - 1);
        }
        this.f33741d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        m29639d();
        m29557h(i10);
        Object[] objArr = this.f33740c;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33741d;
    }
}
