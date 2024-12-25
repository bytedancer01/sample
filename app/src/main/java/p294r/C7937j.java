package p294r;

import org.slf4j.helpers.MessageFormatter;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/j.class
 */
/* renamed from: r.j */
/* loaded from: combined.jar:classes1.jar:r/j.class */
public class C7937j<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f38198f = new Object();

    /* renamed from: b */
    public boolean f38199b;

    /* renamed from: c */
    public int[] f38200c;

    /* renamed from: d */
    public Object[] f38201d;

    /* renamed from: e */
    public int f38202e;

    public C7937j() {
        this(10);
    }

    public C7937j(int i10) {
        this.f38199b = false;
        if (i10 == 0) {
            this.f38200c = C7932e.f38160a;
            this.f38201d = C7932e.f38162c;
        } else {
            int m34393e = C7932e.m34393e(i10);
            this.f38200c = new int[m34393e];
            this.f38201d = new Object[m34393e];
        }
    }

    /* renamed from: a */
    public void m34444a(int i10, E e10) {
        int i11 = this.f38202e;
        if (i11 != 0 && i10 <= this.f38200c[i11 - 1]) {
            m34452j(i10, e10);
            return;
        }
        if (this.f38199b && i11 >= this.f38200c.length) {
            m34447d();
        }
        int i12 = this.f38202e;
        if (i12 >= this.f38200c.length) {
            int m34393e = C7932e.m34393e(i12 + 1);
            int[] iArr = new int[m34393e];
            Object[] objArr = new Object[m34393e];
            int[] iArr2 = this.f38200c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f38201d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f38200c = iArr;
            this.f38201d = objArr;
        }
        this.f38200c[i12] = i10;
        this.f38201d[i12] = e10;
        this.f38202e = i12 + 1;
    }

    /* renamed from: b */
    public void m34445b() {
        int i10 = this.f38202e;
        Object[] objArr = this.f38201d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f38202e = 0;
        this.f38199b = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C7937j<E> clone() {
        try {
            C7937j<E> c7937j = (C7937j) super.clone();
            c7937j.f38200c = (int[]) this.f38200c.clone();
            c7937j.f38201d = (Object[]) this.f38201d.clone();
            return c7937j;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: d */
    public final void m34447d() {
        int i10 = this.f38202e;
        int[] iArr = this.f38200c;
        Object[] objArr = this.f38201d;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= i10) {
                this.f38199b = false;
                this.f38202e = i13;
                return;
            }
            Object obj = objArr[i11];
            int i14 = i13;
            if (obj != f38198f) {
                if (i11 != i13) {
                    iArr[i13] = iArr[i11];
                    objArr[i13] = obj;
                    objArr[i11] = null;
                }
                i14 = i13 + 1;
            }
            i11++;
            i12 = i14;
        }
    }

    /* renamed from: e */
    public E m34448e(int i10) {
        return m34449g(i10, null);
    }

    /* renamed from: g */
    public E m34449g(int i10, E e10) {
        E e11;
        int m34389a = C7932e.m34389a(this.f38200c, this.f38202e, i10);
        return (m34389a < 0 || (e11 = (E) this.f38201d[m34389a]) == f38198f) ? e10 : e11;
    }

    /* renamed from: h */
    public int m34450h(E e10) {
        if (this.f38199b) {
            m34447d();
        }
        for (int i10 = 0; i10 < this.f38202e; i10++) {
            if (this.f38201d[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public int m34451i(int i10) {
        if (this.f38199b) {
            m34447d();
        }
        return this.f38200c[i10];
    }

    /* renamed from: j */
    public void m34452j(int i10, E e10) {
        int m34389a = C7932e.m34389a(this.f38200c, this.f38202e, i10);
        if (m34389a >= 0) {
            this.f38201d[m34389a] = e10;
            return;
        }
        int i11 = m34389a ^ (-1);
        int i12 = this.f38202e;
        if (i11 < i12) {
            Object[] objArr = this.f38201d;
            if (objArr[i11] == f38198f) {
                this.f38200c[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        int i13 = i11;
        if (this.f38199b) {
            i13 = i11;
            if (i12 >= this.f38200c.length) {
                m34447d();
                i13 = C7932e.m34389a(this.f38200c, this.f38202e, i10) ^ (-1);
            }
        }
        int i14 = this.f38202e;
        if (i14 >= this.f38200c.length) {
            int m34393e = C7932e.m34393e(i14 + 1);
            int[] iArr = new int[m34393e];
            Object[] objArr2 = new Object[m34393e];
            int[] iArr2 = this.f38200c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f38201d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f38200c = iArr;
            this.f38201d = objArr2;
        }
        int i15 = this.f38202e;
        if (i15 - i13 != 0) {
            int[] iArr3 = this.f38200c;
            int i16 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i16, i15 - i13);
            Object[] objArr4 = this.f38201d;
            System.arraycopy(objArr4, i13, objArr4, i16, this.f38202e - i13);
        }
        this.f38200c[i13] = i10;
        this.f38201d[i13] = e10;
        this.f38202e++;
    }

    /* renamed from: k */
    public void m34453k(int i10) {
        Object[] objArr = this.f38201d;
        Object obj = objArr[i10];
        Object obj2 = f38198f;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f38199b = true;
        }
    }

    /* renamed from: l */
    public int m34454l() {
        if (this.f38199b) {
            m34447d();
        }
        return this.f38202e;
    }

    /* renamed from: m */
    public E m34455m(int i10) {
        if (this.f38199b) {
            m34447d();
        }
        return (E) this.f38201d[i10];
    }

    public String toString() {
        if (m34454l() <= 0) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb2 = new StringBuilder(this.f38202e * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f38202e; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m34451i(i10));
            sb2.append('=');
            E m34455m = m34455m(i10);
            if (m34455m != this) {
                sb2.append(m34455m);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
