package p027b9;

import java.util.Arrays;
import p059d9.C4349a;
import p059d9.C4401z0;

/* JADX WARN: Classes with same name are omitted:
  classes2.jar:b9/q.class
 */
/* renamed from: b9.q */
/* loaded from: combined.jar:classes2.jar:b9/q.class */
public final class C0859q implements InterfaceC0832b {

    /* renamed from: a */
    public final boolean f5868a;

    /* renamed from: b */
    public final int f5869b;

    /* renamed from: c */
    public final byte[] f5870c;

    /* renamed from: d */
    public final C0830a[] f5871d;

    /* renamed from: e */
    public int f5872e;

    /* renamed from: f */
    public int f5873f;

    /* renamed from: g */
    public int f5874g;

    /* renamed from: h */
    public C0830a[] f5875h;

    public C0859q(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public C0859q(boolean z10, int i10, int i11) {
        C4349a.m21878a(i10 > 0);
        C4349a.m21878a(i11 >= 0);
        this.f5868a = z10;
        this.f5869b = i10;
        this.f5874g = i11;
        this.f5875h = new C0830a[i11 + 100];
        if (i11 > 0) {
            this.f5870c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f5875h[i12] = new C0830a(this.f5870c, i12 * i10);
            }
        } else {
            this.f5870c = null;
        }
        this.f5871d = new C0830a[1];
    }

    @Override // p027b9.InterfaceC0832b
    /* renamed from: a */
    public C0830a mo5300a() {
        C0830a c0830a;
        synchronized (this) {
            this.f5873f++;
            int i10 = this.f5874g;
            if (i10 > 0) {
                C0830a[] c0830aArr = this.f5875h;
                int i11 = i10 - 1;
                this.f5874g = i11;
                c0830a = (C0830a) C4349a.m21882e(c0830aArr[i11]);
                this.f5875h[this.f5874g] = null;
            } else {
                c0830a = new C0830a(new byte[this.f5869b], 0);
            }
        }
        return c0830a;
    }

    @Override // p027b9.InterfaceC0832b
    /* renamed from: b */
    public void mo5301b(C0830a[] c0830aArr) {
        synchronized (this) {
            int i10 = this.f5874g;
            int length = c0830aArr.length;
            C0830a[] c0830aArr2 = this.f5875h;
            if (length + i10 >= c0830aArr2.length) {
                this.f5875h = (C0830a[]) Arrays.copyOf(c0830aArr2, Math.max(c0830aArr2.length * 2, i10 + c0830aArr.length));
            }
            for (C0830a c0830a : c0830aArr) {
                C0830a[] c0830aArr3 = this.f5875h;
                int i11 = this.f5874g;
                this.f5874g = i11 + 1;
                c0830aArr3[i11] = c0830a;
            }
            this.f5873f -= c0830aArr.length;
            notifyAll();
        }
    }

    @Override // p027b9.InterfaceC0832b
    /* renamed from: c */
    public void mo5302c(C0830a c0830a) {
        synchronized (this) {
            C0830a[] c0830aArr = this.f5871d;
            c0830aArr[0] = c0830a;
            mo5301b(c0830aArr);
        }
    }

    @Override // p027b9.InterfaceC0832b
    /* renamed from: d */
    public void mo5303d() {
        synchronized (this) {
            int max = Math.max(0, C4401z0.m22395l(this.f5872e, this.f5869b) - this.f5873f);
            int i10 = this.f5874g;
            if (max >= i10) {
                return;
            }
            int i11 = max;
            if (this.f5870c != null) {
                int i12 = i10 - 1;
                int i13 = 0;
                while (i13 <= i12) {
                    C0830a c0830a = (C0830a) C4349a.m21882e(this.f5875h[i13]);
                    if (c0830a.f5736a == this.f5870c) {
                        i13++;
                    } else {
                        C0830a c0830a2 = (C0830a) C4349a.m21882e(this.f5875h[i12]);
                        if (c0830a2.f5736a != this.f5870c) {
                            i12--;
                        } else {
                            C0830a[] c0830aArr = this.f5875h;
                            c0830aArr[i13] = c0830a2;
                            c0830aArr[i12] = c0830a;
                            i12--;
                            i13++;
                        }
                    }
                }
                int max2 = Math.max(max, i13);
                i11 = max2;
                if (max2 >= this.f5874g) {
                    return;
                }
            }
            Arrays.fill(this.f5875h, i11, this.f5874g, (Object) null);
            this.f5874g = i11;
        }
    }

    @Override // p027b9.InterfaceC0832b
    /* renamed from: e */
    public int mo5304e() {
        return this.f5869b;
    }

    /* renamed from: f */
    public int m5394f() {
        int i10;
        int i11;
        synchronized (this) {
            i10 = this.f5873f;
            i11 = this.f5869b;
        }
        return i10 * i11;
    }

    /* renamed from: g */
    public void m5395g() {
        synchronized (this) {
            if (this.f5868a) {
                m5396h(0);
            }
        }
    }

    /* renamed from: h */
    public void m5396h(int i10) {
        synchronized (this) {
            boolean z10 = i10 < this.f5872e;
            this.f5872e = i10;
            if (z10) {
                mo5303d();
            }
        }
    }
}
