package p059d9;

import java.util.Arrays;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:d9/s0.class
 */
/* renamed from: d9.s0 */
/* loaded from: combined.jar:classes2.jar:d9/s0.class */
public final class C4387s0<V> {

    /* renamed from: a */
    public long[] f26645a;

    /* renamed from: b */
    public V[] f26646b;

    /* renamed from: c */
    public int f26647c;

    /* renamed from: d */
    public int f26648d;

    public C4387s0() {
        this(10);
    }

    public C4387s0(int i10) {
        this.f26645a = new long[i10];
        this.f26646b = (V[]) m22225f(i10);
    }

    /* renamed from: f */
    public static <V> V[] m22225f(int i10) {
        return (V[]) new Object[i10];
    }

    /* renamed from: a */
    public void m22226a(long j10, V v10) {
        synchronized (this) {
            m22229d(j10);
            m22230e();
            m22227b(j10, v10);
        }
    }

    /* renamed from: b */
    public final void m22227b(long j10, V v10) {
        int i10 = this.f26647c;
        int i11 = this.f26648d;
        V[] vArr = this.f26646b;
        int length = (i10 + i11) % vArr.length;
        this.f26645a[length] = j10;
        vArr[length] = v10;
        this.f26648d = i11 + 1;
    }

    /* renamed from: c */
    public void m22228c() {
        synchronized (this) {
            this.f26647c = 0;
            this.f26648d = 0;
            Arrays.fill(this.f26646b, (Object) null);
        }
    }

    /* renamed from: d */
    public final void m22229d(long j10) {
        int i10 = this.f26648d;
        if (i10 > 0) {
            int i11 = this.f26647c;
            if (j10 <= this.f26645a[((i11 + i10) - 1) % this.f26646b.length]) {
                m22228c();
            }
        }
    }

    /* renamed from: e */
    public final void m22230e() {
        int length = this.f26646b.length;
        if (this.f26648d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) m22225f(i10);
        int i11 = this.f26647c;
        int i12 = length - i11;
        System.arraycopy(this.f26645a, i11, jArr, 0, i12);
        System.arraycopy(this.f26646b, this.f26647c, vArr, 0, i12);
        int i13 = this.f26647c;
        if (i13 > 0) {
            System.arraycopy(this.f26645a, 0, jArr, i12, i13);
            System.arraycopy(this.f26646b, 0, vArr, i12, this.f26647c);
        }
        this.f26645a = jArr;
        this.f26646b = vArr;
        this.f26647c = 0;
    }

    /* renamed from: g */
    public V m22231g(long j10) {
        V m22232h;
        synchronized (this) {
            m22232h = m22232h(j10, false);
        }
        return m22232h;
    }

    /* renamed from: h */
    public final V m22232h(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (true) {
            long j12 = j11;
            if (this.f26648d <= 0) {
                break;
            }
            long j13 = j10 - this.f26645a[this.f26647c];
            if (j13 < 0 && (z10 || (-j13) >= j12)) {
                break;
            }
            v10 = m22235k();
            j11 = j13;
        }
        return v10;
    }

    /* renamed from: i */
    public V m22233i() {
        V m22235k;
        synchronized (this) {
            m22235k = this.f26648d == 0 ? null : m22235k();
        }
        return m22235k;
    }

    /* renamed from: j */
    public V m22234j(long j10) {
        V m22232h;
        synchronized (this) {
            m22232h = m22232h(j10, true);
        }
        return m22232h;
    }

    /* renamed from: k */
    public final V m22235k() {
        C4349a.m21884g(this.f26648d > 0);
        V[] vArr = this.f26646b;
        int i10 = this.f26647c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f26647c = (i10 + 1) % vArr.length;
        this.f26648d--;
        return v10;
    }

    /* renamed from: l */
    public int m22236l() {
        int i10;
        synchronized (this) {
            i10 = this.f26648d;
        }
        return i10;
    }
}
