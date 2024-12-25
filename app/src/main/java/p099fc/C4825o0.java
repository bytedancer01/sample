package p099fc;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:fc/o0.class
 */
/* renamed from: fc.o0 */
/* loaded from: combined.jar:classes2.jar:fc/o0.class */
public final class C4825o0<E> extends AbstractC4842x<E> {

    /* renamed from: i */
    public static final C4825o0<Object> f28364i = new C4825o0<>(new Object[0], 0, null, 0, 0);

    /* renamed from: d */
    public final transient Object[] f28365d;

    /* renamed from: e */
    public final transient Object[] f28366e;

    /* renamed from: f */
    public final transient int f28367f;

    /* renamed from: g */
    public final transient int f28368g;

    /* renamed from: h */
    public final transient int f28369h;

    public C4825o0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f28365d = objArr;
        this.f28366e = objArr2;
        this.f28367f = i11;
        this.f28368g = i10;
        this.f28369h = i12;
    }

    @Override // p099fc.AbstractC4842x
    /* renamed from: A */
    public AbstractC4834t<E> mo24477A() {
        return AbstractC4834t.m24547w(this.f28365d, this.f28369h);
    }

    @Override // p099fc.AbstractC4842x
    /* renamed from: B */
    public boolean mo24481B() {
        return true;
    }

    @Override // p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f28366e;
        if (obj == null || objArr == null) {
            return false;
        }
        int m24525c = C4828q.m24525c(obj);
        while (true) {
            int i10 = m24525c & this.f28367f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m24525c = i10 + 1;
        }
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: e */
    public int mo24451e(Object[] objArr, int i10) {
        System.arraycopy(this.f28365d, 0, objArr, i10, this.f28369h);
        return i10 + this.f28369h;
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: f */
    public Object[] mo24452f() {
        return this.f28365d;
    }

    @Override // p099fc.AbstractC4830r
    /* renamed from: g */
    public int mo24453g() {
        return this.f28369h;
    }

    @Override // p099fc.AbstractC4842x, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f28368g;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f28369h;
    }

    @Override // p099fc.AbstractC4842x, p099fc.AbstractC4830r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: t */
    public AbstractC4841w0<E> iterator() {
        return mo24480d().iterator();
    }
}
