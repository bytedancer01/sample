package p294r;

import org.slf4j.helpers.MessageFormatter;

/* JADX WARN: Classes with same name are omitted:
  classes1.jar:r/f.class
 */
/* renamed from: r.f */
/* loaded from: combined.jar:classes1.jar:r/f.class */
public class C7933f<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f38163f = new Object();

    /* renamed from: b */
    public boolean f38164b;

    /* renamed from: c */
    public long[] f38165c;

    /* renamed from: d */
    public Object[] f38166d;

    /* renamed from: e */
    public int f38167e;

    public C7933f() {
        this(10);
    }

    public C7933f(int i10) {
        this.f38164b = false;
        if (i10 == 0) {
            this.f38165c = C7932e.f38161b;
            this.f38166d = C7932e.f38162c;
        } else {
            int m34394f = C7932e.m34394f(i10);
            this.f38165c = new long[m34394f];
            this.f38166d = new Object[m34394f];
        }
    }

    /* renamed from: a */
    public void m34395a(long j10, E e10) {
        int i10 = this.f38167e;
        if (i10 != 0 && j10 <= this.f38165c[i10 - 1]) {
            m34403j(j10, e10);
            return;
        }
        if (this.f38164b && i10 >= this.f38165c.length) {
            m34398d();
        }
        int i11 = this.f38167e;
        if (i11 >= this.f38165c.length) {
            int m34394f = C7932e.m34394f(i11 + 1);
            long[] jArr = new long[m34394f];
            Object[] objArr = new Object[m34394f];
            long[] jArr2 = this.f38165c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f38166d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f38165c = jArr;
            this.f38166d = objArr;
        }
        this.f38165c[i11] = j10;
        this.f38166d[i11] = e10;
        this.f38167e = i11 + 1;
    }

    /* renamed from: b */
    public void m34396b() {
        int i10 = this.f38167e;
        Object[] objArr = this.f38166d;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f38167e = 0;
        this.f38164b = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C7933f<E> clone() {
        try {
            C7933f<E> c7933f = (C7933f) super.clone();
            c7933f.f38165c = (long[]) this.f38165c.clone();
            c7933f.f38166d = (Object[]) this.f38166d.clone();
            return c7933f;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    /* renamed from: d */
    public final void m34398d() {
        int i10 = this.f38167e;
        long[] jArr = this.f38165c;
        Object[] objArr = this.f38166d;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12;
            if (i11 >= i10) {
                this.f38164b = false;
                this.f38167e = i13;
                return;
            }
            Object obj = objArr[i11];
            int i14 = i13;
            if (obj != f38163f) {
                if (i11 != i13) {
                    jArr[i13] = jArr[i11];
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
    public E m34399e(long j10) {
        return m34400g(j10, null);
    }

    /* renamed from: g */
    public E m34400g(long j10, E e10) {
        E e11;
        int m34390b = C7932e.m34390b(this.f38165c, this.f38167e, j10);
        return (m34390b < 0 || (e11 = (E) this.f38166d[m34390b]) == f38163f) ? e10 : e11;
    }

    /* renamed from: h */
    public int m34401h(long j10) {
        if (this.f38164b) {
            m34398d();
        }
        return C7932e.m34390b(this.f38165c, this.f38167e, j10);
    }

    /* renamed from: i */
    public long m34402i(int i10) {
        if (this.f38164b) {
            m34398d();
        }
        return this.f38165c[i10];
    }

    /* renamed from: j */
    public void m34403j(long j10, E e10) {
        int m34390b = C7932e.m34390b(this.f38165c, this.f38167e, j10);
        if (m34390b >= 0) {
            this.f38166d[m34390b] = e10;
            return;
        }
        int i10 = m34390b ^ (-1);
        int i11 = this.f38167e;
        if (i10 < i11) {
            Object[] objArr = this.f38166d;
            if (objArr[i10] == f38163f) {
                this.f38165c[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        int i12 = i10;
        if (this.f38164b) {
            i12 = i10;
            if (i11 >= this.f38165c.length) {
                m34398d();
                i12 = C7932e.m34390b(this.f38165c, this.f38167e, j10) ^ (-1);
            }
        }
        int i13 = this.f38167e;
        if (i13 >= this.f38165c.length) {
            int m34394f = C7932e.m34394f(i13 + 1);
            long[] jArr = new long[m34394f];
            Object[] objArr2 = new Object[m34394f];
            long[] jArr2 = this.f38165c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f38166d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f38165c = jArr;
            this.f38166d = objArr2;
        }
        int i14 = this.f38167e;
        if (i14 - i12 != 0) {
            long[] jArr3 = this.f38165c;
            int i15 = i12 + 1;
            System.arraycopy(jArr3, i12, jArr3, i15, i14 - i12);
            Object[] objArr4 = this.f38166d;
            System.arraycopy(objArr4, i12, objArr4, i15, this.f38167e - i12);
        }
        this.f38165c[i12] = j10;
        this.f38166d[i12] = e10;
        this.f38167e++;
    }

    /* renamed from: k */
    public void m34404k(long j10) {
        int m34390b = C7932e.m34390b(this.f38165c, this.f38167e, j10);
        if (m34390b >= 0) {
            Object[] objArr = this.f38166d;
            Object obj = objArr[m34390b];
            Object obj2 = f38163f;
            if (obj != obj2) {
                objArr[m34390b] = obj2;
                this.f38164b = true;
            }
        }
    }

    /* renamed from: l */
    public void m34405l(int i10) {
        Object[] objArr = this.f38166d;
        Object obj = objArr[i10];
        Object obj2 = f38163f;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f38164b = true;
        }
    }

    /* renamed from: m */
    public int m34406m() {
        if (this.f38164b) {
            m34398d();
        }
        return this.f38167e;
    }

    /* renamed from: n */
    public E m34407n(int i10) {
        if (this.f38164b) {
            m34398d();
        }
        return (E) this.f38166d[i10];
    }

    public String toString() {
        if (m34406m() <= 0) {
            return MessageFormatter.DELIM_STR;
        }
        StringBuilder sb2 = new StringBuilder(this.f38167e * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f38167e; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(m34402i(i10));
            sb2.append('=');
            E m34407n = m34407n(i10);
            if (m34407n != this) {
                sb2.append(m34407n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
